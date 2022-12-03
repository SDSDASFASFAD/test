package Thread_.saleTicket;

public class saleTicket1 {


    public static void main(String[] args) throws InterruptedException {

        sale01 sale01 = new sale01();
        sale01 sale02 = new sale01();
        sale01 sale03 = new sale01();

        sale01.start();
        sale02.start();
        sale03.start();


        sale02 sale = new sale02();
        Thread thread1 = new Thread(sale);
        Thread thread2 = new Thread(sale);
        Thread thread3 = new Thread(sale);

        thread1.start();
        thread2.start();
        thread3.start();

        // 中断线程，但没有真正的结束线程。所以一般用于中断正在休眠线程
        thread1.interrupt();

        thread1.start();
        // 线程的静态方法，使当前线程休眠
        Thread.sleep(50);
        // 设置线程的优先级
        thread1.setPriority(1);
        // 线程的礼让，让出CPU，让其他线程执行，但礼让的时间不确定，所以也不一定礼让成功
        Thread.yield();
        // 线程的插队：插队的线程一旦插队成功在，则肯定先执行完插入的线程的所有的任务
        // 案例：创建一个子线程，每隔也s输出hello，输出20次主线程每隔一秒输出hi，当主线程输出5次后，就让子线程运行完毕，主线程再继续
        thread1.join();
    }


}

class sale01 extends Thread{
    // 让多个线程共享
    public static int tickets = 100;

    @Override
    public void run() {
        while (true){
            try {
                sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"\t"+--tickets);
            if(tickets <= 0) break;
        }
    }
}


class sale02 implements Runnable{

    int tickets = 100;

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"\t"+--tickets);
            if(tickets <= 0) break;
        }
    }
}


