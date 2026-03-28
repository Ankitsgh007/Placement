package function;

import java.util.Scanner;

// Check whether a number is palindrome using function

/*  pseudocode
 DECLARE num:Integer
 DECLARE reversed:Integer

 FUNCTION reverseNumber(n:Integer): Integer
    DECLARE rev:Integer
    rev = 0
    WHILE n > 0 DO
        rev = rev * 10 + n % 10
        n = n / 10
    END WHILE
    RETURN rev
 END FUNCTION

 FUNCTION isPalindrome(n:Integer): Boolean
    DECLARE reversed:Integer
    reversed = reverseNumber(n)
    IF n = reversed THEN
        RETURN true
    ELSE
        RETURN false
    END IF
 END FUNCTION

 READ num
 IF isPalindrome(num) THEN
    PRINT "The number " + num + " is a palindrome."
 ELSE
    PRINT "The number " + num + " is not a palindrome."
 END IF
 */
public class checkPalindrome {
    
    public static int reverseNumber(int n){
        int rev=0;
        while(n>0){
            rev= rev*10 + n%10;
            n= n/10;
        }
        return rev;
    }

    public static boolean isPalindrome(int n){
        int reversed= reverseNumber(n);
        return n == reversed;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= sc.nextInt();

        if(isPalindrome(num)){
            System.out.println("The number " + num + " is a palindrome.");
        }
        else{
            System.out.println("The number " + num + " is not a palindrome.");
        }

        sc.close();
    }
}
