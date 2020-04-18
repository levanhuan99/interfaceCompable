package comparator;

import java.util.Arrays;
import java.util.Comparator;


public class Test {
    public static void main(String[] args) {
        comparator.Circle[] circle=new comparator.Circle[3];
        circle[0]=new comparator.Circle(10);
        circle[1]=new comparator.Circle();
        circle[2]=new Circle(20,"red",true);

        System.out.println("unsorted array");
        for (Circle circle1: circle){
            System.out.println(circle1);
        }
        Comparator circleComparator=new CircleComparator();
        Arrays.sort(circle,circleComparator);  //ok a  làm ăn sẵn mà còn k hiểu???thì lms làm bt được
        // thắc mắc là tại sao cần phương thức compare(class CircleComparator) mà trong khi đó ta  dùng Arrays.sort?

        System.out.println("sorted array");
        for (Circle circle1:circle){
            System.out.println(circle1);
        }

    }
}
