package sync_;

public class saleTicket1 {


    public static void main(String[] args) throws InterruptedException {

//        sale01 sale01 = new sale01();
//        sale01 sale02 = new sale01();
//        sale01 sale03 = new sale01();
//
//        sale01.start();
//        sale02.start();
//        sale03.start();


        sale02 sale = new sale02();
        Thread thread1 = new Thread(sale);
        Thread thread2 = new Thread(sale);
        Thread thread3 = new Thread(sale);

        thread1.start();
        thread2.start();
        thread3.start();

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

     public synchronized void m(){
         if(tickets <= 0) return;
         try {
             Thread.sleep(50);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
         System.out.println(Thread.currentThread().getName()+"\t"+--tickets);
     }

    @Override
    public  void run() {
        while (true){
            m();
            if(tickets <= 0) break;
        }
    }
}


