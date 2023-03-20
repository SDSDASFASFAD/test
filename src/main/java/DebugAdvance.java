import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * 断点调试：进阶
 */
public class DebugAdvance {

    // 条件表达式
    public static  void  conditions(){

        // 条件表达式
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        myThread myThread = new myThread();
        Thread thread1 = new Thread(myThread, "thread1");
        Thread thread2 = new Thread(myThread, "thread2");
        Thread thread3 = new Thread(myThread, "thread3");
        thread1.start();
        thread2.start();
        thread3.start();

    }

    // 打印堆栈信息
    public static void printStackTrace(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        System.out.println(arrayList);
    }

    // 表达式解析
    public static void evalute(){
        System.out.println("evaluate");
        Person_1 bywind = new Person_1("bywind", 35);

        List<Integer> lis = Arrays.asList(1, 2, 3, 4).stream()
                .map(x -> x * 2).collect(Collectors.toList());


    }

    // 避免操作资源 | force return
    public static void saveResource(){
        // sout输出的仅是对资源进行操作的模拟，比如将数据保存到数据库，将数据保存到redis，或者消息队列中
        System.out.println("shit happens");

        System.out.println("save to db");
        System.out.println("save to redis");
        System.out.println("send message to MQ for money payout");
    }

    public static void main(String[] args) {
//        conditions();
//        printStackTrace();
//        evalute();
        saveResource();

    }




    static class  myThread implements Runnable{

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + "--进入");
                try {
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    System.out.println(Thread.currentThread().getName()+"--离开");
                }
        }
    }
}
