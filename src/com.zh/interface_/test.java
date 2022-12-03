package interface_;

public class test {
    public static void main(String[] args) {

        //IDEA SpringBoot + Gradle 运行TestClass时 Execution failed for task ‘:test‘错误问题解决
        //https://blog.csdn.net/Bibibibiii/article/details/128080147
        Computer computer = new Computer();
        computer.working(new Phone());
        computer.working(new Camera());

    }
}
