import java.util.ArrayList;

public class Person<E> {
    // E表示s的数据类型，该数据类型在定义Person对象的时候指定，即在编译期间，就确定E是什么类型
    E s ;
    // E也可以是参数类型
    public Person(E s){
        this.s = s ;
    }
    //  返回类型也可以使用泛型
    public E f() {
        return s ;
    }


    public static void main(String[] args) {

        // 因为 E 指定了 A 类型 ，构造器传入了new A()
        // 再给泛型指定具体类型后，可以传入该类型或其子类类型
        Pig<A> aPig = new Pig<>(new A());
        Pig<A> bPig = new Pig<>(new B());

        // 如果这样写的话，泛型默认是 Object
        ArrayList<Object> objects = new ArrayList<>();
    }

}


class A{}
class B extends A{}

class Pig<E>{

    E e ;

    public Pig(E e) {
        this.e = e;
    }

}
