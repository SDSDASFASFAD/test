import java.math.BigInteger;

public class BreakPointDemo {


        // 行断点
        public static void line(){
            System.out.println("this is the line break point");
        }

        // 详细断点(源断点)
        public static void detailLine(){
            System.out.println("this is the detail line break point");
        }

        // 方法断点 |  接口跳转实现类
        public static void method(){
            System.out.println("this is from method");
            IServiceImpl iService = new IServiceImpl();
            iService.excute();
        }

        // 异常断点  |  全局捕获
        public static void exception(){
            Object o = null;
            o.toString();
            System.out.println("this line will never be print !");

        }

        // 字段断点  | 读写监控
        public static void field(){
            Person_1 field = new Person_1("field", 20);
            field.setAge(12);
            System.out.println(field);

        }

    private static  class AddThread  extends Thread{

        private BigInteger result = BigInteger.ONE;

        private long num;

        public  AddThread(Long num){
            this.num = num;
        }

        @Override
        public void run() {

            System.out.println(Thread.currentThread().getName() + "开始计算" + num);

            add(num);

            System.out.println(Thread.currentThread().getName() + "执行完成");
        }

        // 累加计算
        public void add(long num){
            BigInteger f = new BigInteger("1");
            for (int i = 2 ; i <= num ; i++){
                f = f.add(BigInteger.valueOf(i));
            }
            result = f;
        }

        public BigInteger getResult() {
            return result;
        }
    }



    public static void main(String[] args) {
//        line();
//        detailLine();
//        method();
//        exception();
//        field();

        AddThread addThread1 = new AddThread(100L);
        AddThread addThread2 = new AddThread(1000L);

        addThread1.start();
        addThread2.start();


        try {
            addThread1.join();
            addThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        BigInteger result = addThread1.getResult().add(addThread2.getResult());
        System.out.println("两个线程的计算结果相加等于" + result);
    }

}

interface IService{
    public void excute();
}

class IServiceImpl implements  IService{

    @Override
    public void excute() {
        System.out.println("method  executed");
    }
}


class Person_1{
    private String name;
    private int age;

    public Person_1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person_1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}





