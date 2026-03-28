
package function;

import java.util.Scanner;

 // sum of series 1+1/2+1/3+...+1/n using function

 /*  pseudocode
 DECLARE n:Integer
 DECLARE sum:Real

 FUNCTION sumSeriesReal(n:Integer): Real
    DECLARE total:Real
    total = 0
    FOR i FROM 1 TO n DO
        total = total + 1.0 / i
    END FOR
    RETURN total
 END FUNCTION

 READ n
 sum = sumSeriesReal(n)
 PRINT "The sum of the series from 1 to " + n + " is: " + sum
 */
public class sum_seriesReal {
    
    public static double sumSeriesReal(int n){
        double sum=0;
        for(int i=1; i<=n; i++){
            sum+= 1.0/i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();

        double sum= sumSeriesReal(n);
        System.out.println("The sum of the series from 1 to " + n + " is: " + sum);
        sc.close();
    }

}
