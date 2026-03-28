
package function;

import java.util.Scanner;

// Calculate the area of a circle using function

/*  pseudocode
 DECLARE radius:Real
 DECLARE area:Real

 FUNCTION calculateArea(r:Real): Real
    RETURN 3.14 * r * r
 END FUNCTION

 READ radius
 area = calculateArea(radius)
 PRINT "The area of the circle with radius " + radius + " is: " + area
 */

public class AOC {
    
    public static double calculateArea(double r){
        return 3.14 * r * r;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius= sc.nextDouble();

        double area= calculateArea(radius);
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }
}
