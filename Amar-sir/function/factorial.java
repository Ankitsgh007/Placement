
package function;

import java.util.Scanner;

// Calculate the factorial of a number using function

/*  pseudocode
 DECLARE num:Integer
 DECLARE result:Integer

 FUNCTION factorial(n:Integer): Integer
    IF n == 0 THEN
        RETURN 1
    ELSE
        RETURN n * factorial(n - 1)
    END IF
 END FUNCTION

 READ num
 result = factorial(num)
 PRINT "The factorial of " + num + " is: " + result
 */

public class factorial {
    
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= sc.nextInt();

        int result= factorial(num);
        System.out.println("The factorial of " + num + " is: " + result);
    }
}
