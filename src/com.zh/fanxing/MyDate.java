package fanxing;

public class MyDate implements Comparable<MyDate>{
    private int year ;
    private int month ;
    private int day ;


    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public int compareTo(MyDate o) {
//        if(this.year > o.getYear()){
//            return 1;
//        }else if (this.year < o.getYear()){
//            return -1;
//        }else {
//            if(this.month > o.getMonth()){
//                return 1;
//            }else if (this.month < o.getMonth()){
//                return  -1;
//            }else {
//                if (this.day > o.getDay()){
//                    return 1;
//                }else if (this.day < o.getDay()){
//                    return -1;
//                }else {
//                    return 0;
//                }
//            }
//        }
        int yearMinus = this.year - o.getYear();

        if (yearMinus != 0){
            return yearMinus;
        }

        int monthMinus = this.month - o.getMonth();

        if (monthMinus != 0){
            return monthMinus;
        }

        return this.day - o.getDay() ;
    }
}
