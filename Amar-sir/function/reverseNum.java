
package function;

import java.util.Scanner;

// Reverse a number using function

/*  pseudocode

 FUNCTION reverseNumber(n:Integer): Integer
    DECLARE rev:Integer
    rev = 0
    WHILE n > 0 DO
        rev = rev * 10 + n % 10
        n = n / 10
    END WHILE
    RETURN rev
 END FUNCTION

 PRINT "The reverse of " + num + " is: " + reverseNumber(num)
 */
public class reverseNum {
    
    public static int reverseNumber(int n){
        int rev=0;
        while(n>0){
            rev= rev*10 + n%10;
            n= n/10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= sc.nextInt();

        System.out.println("The reverse of " + num + " is: " + reverseNumber(num));
    }
}
