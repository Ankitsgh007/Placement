import java.util.*;

// find area and perimeter of rectangle

/* pseudocode
 DECLARE length:Double
 DECLARE breadth:Double
 DECLARE area:Double
 DECLARE perimeter:Double

 READ length
 READ breadth

 SET area = length * breadth
 SET perimeter = 2 * (length + breadth)

 PRINT area
 PRINT perimeter
 */

//code
public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double length= sc.nextDouble();
        double breadth= sc.nextDouble();

        double area = length*breadth;
        double perimeter = 2*(length+breadth);

        System.out.println("Area of the rectangle whose length = "+ length+" and breadth = "+ breadth+ " is "+ area);
        System.out.println("Perimeter of the rectangle whose length = "+ length+" and breadth = "+ breadth+ " is "+ perimeter);

        
        sc.close();
    }
}
