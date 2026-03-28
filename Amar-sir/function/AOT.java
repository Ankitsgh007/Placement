
package function;

import java.util.Scanner;

// Calculate the area of a triangle using function

/*  pseudocode
 DECLARE base:Real
 DECLARE height:Real
 DECLARE area:Real

 FUNCTION calculateArea(b:Real, h:Real): Real
    RETURN 0.5 * b * h
 END FUNCTION

 READ base
 READ height
 area = calculateArea(base, height)
 PRINT "The area of the triangle with base " + base + " and height " + height + " is: " + area
 */
public class AOT {
    
    public static double calculateArea(double b, double h){
        return 0.5 * b * h;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        double base= sc.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height= sc.nextDouble();

        double area= calculateArea(base, height);
        System.out.println("The area of the triangle with base " + base + " and height " + height + " is: " + area);
    }
}
