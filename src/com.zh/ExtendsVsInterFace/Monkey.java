package ExtendsVsInterFace;

public abstract class Monkey {
    private String name ;

    public Monkey(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        littleMonkey wukong = new littleMonkey("wukong");

        wukong.climb();
        wukong.flying();
        wukong.swimming();
    }

}

interface Fishable{
    void swimming();
}

interface Bridable{
    void flying();
}



class littleMonkey extends Monkey implements Fishable,Bridable{

    public littleMonkey(String name) {
        super(name);
    }

    public void climb(){
        System.out.println("猴子会爬树");
    }

    @Override
    public void swimming() {
        System.out.println("猴子努力学习学会了游泳");
    }

    @Override
    public void flying() {
        System.out.println("猴子努力学习学会了飞");
    }
}

