package function;
import java.util.Scanner;
// Add two numbers using function

/*  pseudocode

 FUNCTION add(a:Integer, b:Integer): Integer
    RETURN a + b
 END FUNCTION

 DECLARE result:Integer
 result = add(num1, num2)

 PRINT "The sum of " + num1 + " and " + num2 + " is: " + result
 */
public class addition {
    
    public static int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1= sc.nextInt();
        System.out.print("Enter second number: ");
        int num2= sc.nextInt();

        int result= add(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
    }
}
