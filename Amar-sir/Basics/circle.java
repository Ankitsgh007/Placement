package Basics;
import java.util.*;

// area and circumfarance of circle

/* pseudocode
 DECLARE radius:Double
 DECLARE pi:Double
 DECLARE area:Double
 DECLARE circumfarance:Double

 SET pi = 3.14
 READ radius
 SET area = pi * radius * radius
 SET circumfarance = 2 * pi * radius

 PRINT area
 PRINT circumfarance
 */

//code
public class circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius= sc.nextDouble();
        double pi= 3.14;

        double circumfarance = 2*pi*radius;
        double area = pi*radius*radius;

        System.out.println("Area = "+ area);
        System.out.println("Circumference = "+ circumfarance);

        sc.close();
    }
}
