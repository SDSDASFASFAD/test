package shangjishiyan;


import java.util.LinkedList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        LinkedList<Shape> shapes = new LinkedList<>();


        do {
            System.out.println("***图形类对象的管理****");
            System.out.println("-----------------------");
            System.out.println("1.创建一个矩形");
            System.out.println("2.创建一个正方体");
            System.out.println("3.显示已创建的图形");
            System.out.println("4.求各图形的面积之和");
            System.out.println("5.退出");

            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            if ("1".equals(s)){
                System.out.println("请输入长和宽");
                double length = Double.parseDouble(scanner.nextLine());
                double width = Double.parseDouble(scanner.nextLine());
                Rectangle rectangle = new Rectangle(length, width);
                shapes.add(rectangle);
            }
            if("2".equals(s)){

            }
            if("3".equals(s)){
                for (Shape shape : shapes) {
                    System.out.println(shape.get_infomation());
                }
            }
            if("4".equals(s)){
                Double total = 0.0 ;

                for (Shape shape : shapes) {
                    total += shape.calculate_area();
                }
                System.out.println(total);
            }
            if ("5".equals(s)) {
                break;
            }
        }while(true);




    }
}
