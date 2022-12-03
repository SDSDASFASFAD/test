package homework02;

public class Frock {

    private static int currentNum = 100000 ;

    private int serialNumber ;

    public int getSerialNumber(){
        return serialNumber;
    }

    public static int getNextNum(){
        return currentNum+=100;
    }

    public Frock(){
        serialNumber = getNextNum();
    }



}
