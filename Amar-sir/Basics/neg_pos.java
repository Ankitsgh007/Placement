import java.util.*;
// Check whether a number is positive or negative

/* pseudocode
 DECLARE num:Integer

 READ num

 IF num >= 0 THEN
    PRINT num + " is positive"
 ELSE
    PRINT num + " is negative"
 END IF
 */

//code
public class neg_pos {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int num= sc.nextInt();
        if(num>=0){
            System.out.println(num+ " is positive");
        }
        else{
            System.out.println(num + " is negative");
        }

        sc.close();
    }
}
