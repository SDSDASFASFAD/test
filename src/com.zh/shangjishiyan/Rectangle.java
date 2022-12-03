package shangjishiyan;

public class Rectangle implements Shape{

    Double length ;

    Double width ;

    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String getname() {
        return "长方形";
    }

    @Override
    public String get_infomation() {
        return "长方形:长为"+length+"宽为"+width;
    }

    @Override
    public Double calculate_area() {
        return length*width;
    }

    @Override
    public Double Calculate_perimeter() {
        return (length+width)*2;
    }
}
