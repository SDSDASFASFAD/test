package homework02;

import java.util.HashMap;
import java.util.HashSet;

public class FrockTest {
    public static void main(String[] args) {
        Frock frock = new Frock();
        Frock frock1 = new Frock();
        Frock frock2 = new Frock();

        System.out.println(frock.getSerialNumber());
        System.out.println(frock1.getSerialNumber());
        System.out.println(frock2.getSerialNumber());
        HashSet<Integer> integers = new HashSet<>();
        integers.add(2);
        HashMap integerHashMap = new HashMap<Integer,Integer>();
        integerHashMap.put(1,1);
    }
}
