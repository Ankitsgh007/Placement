import java.util.*;

// Swap two number without using temperory variable

/* pseudocode
 DECLARE a:Integer
 DECLARE b:Integer

 READ a
 READ b

 SET a = a + b
 SET b = a - b
 SET a = a - b

 PRINT a
 PRINT b
 */

//code
public class swap_without {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int a= sc.nextInt();
        int b= sc.nextInt();

        
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a= "+a+ " & b= "+b);

        sc.close();
    }
}