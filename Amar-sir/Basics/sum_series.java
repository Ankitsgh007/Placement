import java.util.*;
// sum of series 1 to n

/* pseudocode
 DECLARE n:Integer
 DECLARE sum:Integer
 SET sum = 0
 FOR i = 1 to n
    sum = sum + i
 END FOR
 PRINT sum
 */

//code
public class sum_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
        sc.close();
    }
}
