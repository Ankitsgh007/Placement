import java.util.*;
// sum of series 1+1/2^2+1/3^3+...+1/n^n

/* pseudocode
 DECLARE n:Integer
 DECLARE sum:Double
 SET sum = 0
 FOR i = 1 to n
    sum = sum + 1/i^i
 END FOR
 PRINT sum
 */

//code
public class sum_series_power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / Math.pow(i, i);
        }
        System.out.println(sum);
        sc.close();

    }
}
