package Basics;
import java.util.*;
// Check whether a number is even or odd

/*  pseudocode
 DECLARE num:Integer

 READ num

 IF num % 2 == 0 THEN
    PRINT num + " is even"
 ELSE
    PRINT num + " is odd"
 END IF
 */

//code
public class even_odd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int num= sc.nextInt();
        if(num%2==0){
            System.out.println(num+ " is even");
        }
        else{
            System.out.println(num + " is odd");
        }
    }
}
