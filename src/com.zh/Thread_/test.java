package Thread_;

import homework01.DAO;

public class test extends Thread{


    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat();
        // 为什么不直接调用run方法：run方法只是一个方法，调用run方法main线程会阻塞
        // start方法才是真正启动一个线程
//        cat.start();
        dog dog = new dog();
        Thread thread = new Thread(dog);
        thread.start();
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1500);
            System.out.println(i);
        }
    }

}


// 当一个类继承了Thread类,该类就可以当做一个线程使用
class Cat extends Thread {

    // run方法是 thread类继承了 Runnable接口实现的
    // 重写 run方法，写上自己的业务代码
    // run Thread
    @Override
    public void run() {
        while (true) {
            System.out.println("喵喵喵");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
}

// 问题：如果一个类有父类的情况下如何实现线程？
// 实际上可以继承runnable接口来重写 run方法，然后利用 Thread的构造方法将该类传进去，最终调用start方法
class dog implements Runnable{

    @Override
    public void run() {
        while (true) {
            System.out.println("汪汪汪");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
}

// 解释继承Runnable接口的类是如何在main方法中被Thread类变为单独的线程来执行的
// 代理者模式
// 问题：为什么dog类继承接口之后还要被传入Thread的构造方法中才能被当做线程
// 首先思考一个问题，为什么继承了 runnable接口无法启动线程，而继承Thread类就可以直接调用start方法实现线程
// 因为Thread类中有一个本地方法 start0(),这个方法才是真正的创建线程并执行 dog类 run方法的方法
// 而 dog类想要使用 Thread类中的 start0(),  Thread类中加入了 Runnable接口的成员属性,并允许初始化时给该属性赋值
// 并重写run方法，将成员属性的run方法赋给该方法，然后Thread类就可以调用start方法，进而调用start0方法
class ThreadProxy implements Runnable {

    private Runnable target = null ;

    @Override
    public void run() {
        if (target != null){
            target.run();
        }
    }

    public ThreadProxy(Runnable target) {
        this.target = target;
    }

    public void start(){
        // 这里的start0方法对应着真正的Thread类中的public native void start0 方法
        // start0方法才是真正实现多线程的方法
        start0();
    }

    public void start0(){
        // Thread类中的start0方法中的注释写到会去调用对应的run方法
        run();
    }
}
