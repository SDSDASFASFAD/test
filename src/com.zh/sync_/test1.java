package sync_;

public class test1 {
    public static void main(String[] args) {
        use01 use01 = new use01();

        Thread thread1 = new Thread(use01);
        Thread thread2 = new Thread(use01);

        thread1.start();
        thread2.start();
    }
}


class use01 implements Runnable{

    int money = 10000;

    public synchronized void draw_money(){
        //如果
        if (money>0){
            System.out.println(Thread.currentThread().getName()+"取了1000，还剩"+(money-=1000));
        }
    }

    @Override
    public void run() {
        while (money>0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            draw_money();
        }
    }
}