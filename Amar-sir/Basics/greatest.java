import java.util.*;

// greatest of two number

/* pseudocode
 DECLARE num1:Integer
 DECLARE num2:Integer

 READ num1
 READ num2

 IF num1 > num2 THEN
    PRINT num1 + " is greater than " + num2
 ELSE IF num1 < num2 THEN
    PRINT num2 + " is greater than " + num1
 ELSE
    PRINT num1 + " is equal to " + num2
 END IF
 */

//code
public class greatest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int num1=sc.nextInt();
        int num2=sc.nextInt();

        if(num1>num2){
            System.out.println(num1+ " is greater then "+ num2);
        }
        else if(num1<num2){
            System.out.println(num2+ " is greater then "+ num1);
        }
        else{
            System.out.println(num1+ " is equal to "+ num2);
        }

        sc.close();
    }
}
