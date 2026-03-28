import java.util.*;

// Swap two number using temperory variable

/* pseudocode
 DECLARE a:Integer
 DECLARE b:Integer
 DECLARE temp:Integer

 READ a
 READ b

 SET temp = a
 SET a = b
 SET b = temp

 PRINT a
 PRINT b
 */

//code
public class swap_with {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int a= sc.nextInt();
        int b= sc.nextInt();
        int temp;

        temp=a;
        a=b;
        b=temp;

        System.out.println("a= "+a+ " & b= "+b);

        sc.close();
    }
}
