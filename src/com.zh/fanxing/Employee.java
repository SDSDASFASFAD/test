package fanxing;

public class Employee  implements Comparable<Employee> {
    private String name ;
    private String sal ;
    private MyDate birthday ;

    public Employee(String name, String sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSal() {
        return sal;
    }

    public void setSal(String sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal='" + sal + '\'' +
                ", birthday=" + birthday +
                '}';
    }


    @Override
    public int compareTo(Employee o) {

        if (!this.name.equals(o.getName())) {
            return this.name.compareTo(o.getName());
        }else {
            return this.birthday.compareTo(o.getBirthday());
        }
    }
}
