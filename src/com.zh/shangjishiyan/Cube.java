package shangjishiyan;

public class Cube implements Shape{

    Double length ;

    public Cube(Double length) {
        this.length = length;
    }

    @Override
    public String getname() {
        return "正方体";
    }

    @Override
    public String get_infomation() {
        return "正方体:边长为"+length;
    }

    @Override
    public Double calculate_area() {
        return Math.pow(length,3);
    }

    @Override
    public Double Calculate_perimeter() {
        return length*12;
    }
}
