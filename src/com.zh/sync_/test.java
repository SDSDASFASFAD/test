package sync_;

import java.util.Random;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        thread01 thread01 = new thread01();
        thread02 thread02 = new thread02(thread01);

        thread01.start();
        thread02.start();

    }
}

class thread01 extends Thread{
    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            System.out.println(random.nextInt(100));

            try {
                sleep(5000);
            } catch (InterruptedException e) {
                break;
            }


        }
    }
}

class thread02 extends Thread{

    thread01 thread01;

    public thread02(thread01 thread01){
        this.thread01 = thread01;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.nextLine().equals("Q")) {
                while (!thread01.isInterrupted()){
                    thread01.interrupt();
                }
            }
            break;
        }
    }
}
