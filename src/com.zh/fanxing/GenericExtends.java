package fanxing;

import java.util.ArrayList;
import java.util.List;

public class GenericExtends {

    public static void printCollection(List<?> c){
        for (Object o : c) {
            System.out.println(o);
        }
    }

    // 表示上限可以接受AA或者AA的子类
    public static void printCollection1(List<? extends AA> c){
        for (Object aa : c) {
            System.out.println(aa);
        }
    }

    // 表示上限可以接受AA以及AA的父类，不限于直接父类
    public static void printCollection2(List<? super AA> c){
        for (Object aa : c) {
            System.out.println(aa);
        }
    }


    public static void main(String[] args) {

        ArrayList<Object> list1 = new ArrayList<>();

        ArrayList<String> list2 = new ArrayList<>();

        ArrayList<AA> list3 = new ArrayList<>();

        ArrayList<BB> list4 = new ArrayList<>();

        ArrayList<CC> list5 = new ArrayList<>();



        printCollection(list1);
        printCollection(list2);
        printCollection(list3);
        printCollection(list4);
        printCollection(list5);

//        printCollection1(list1);
//        printCollection1(list2);
        printCollection1(list3);
        printCollection1(list4);
        printCollection1(list5);


        printCollection2(list1);
//        printCollection2(list2);
        printCollection2(list3);
//        printCollection2(list4);
//        printCollection2(list5);
    }
}


class AA {

}

class BB extends AA{

}

class CC extends BB {

}
