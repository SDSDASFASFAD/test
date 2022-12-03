package fanxing;

import java.util.*;

public class test {
    public static void main(String[] args) {
        Employee zhangsan = new Employee("3", "man", new MyDate(12, 1, 2002));
        Employee ww = new Employee("3", "man", new MyDate(12, 2, 2002));
        Employee lisi = new Employee("2", "man", new MyDate(12, 1, 2001));
        Employee lisan = new Employee("2", "man", new MyDate(12, 2, 2001));
        Employee wangwu = new Employee("1", "man", new MyDate(12, 1, 2001));

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(zhangsan);
        employees.add(lisi);
        employees.add(wangwu);
        employees.add(ww);
        employees.add(lisan);

//        employees.sort(new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                if (o2.getName().equals(o1.getName())){
//                    if (o1.getBirthday().getYear() > o2.getBirthday().getYear()){
//                        return 1;
//                    }else if (o1.getBirthday().getYear() == o2.getBirthday().getYear()){
//                        return 0;
//                    }else {
//                        return -1;
//                    }
//                }
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

        Collections.sort(employees);
        System.out.println(employees);

    }
}
