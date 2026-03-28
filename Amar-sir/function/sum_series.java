
package function;

import java.util.Scanner;

// Calculate the sum of a series using function

/*  pseudocode
 DECLARE n:Integer
 DECLARE sum:Integer

 FUNCTION sumSeries(n:Integer): Integer
    DECLARE total:Integer
    total = 0
    FOR i FROM 1 TO n DO
        total = total + i
    END FOR
    RETURN total
 END FUNCTION

 READ n
 sum = sumSeries(n)
 PRINT "The sum of the series from 1 to " + n + " is: " + sum
 */
public class sum_series {
    
    public static int sumSeries(int n){
        int total=0;
        for(int i=1; i<=n; i++){
            total+= i;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();

        int sum= sumSeries(n);
        System.out.println("The sum of the series from 1 to " + n + " is: " + sum);
    }
}
