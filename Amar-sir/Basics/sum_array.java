
package Basics;

import java.util.*;

// Java program to find the sum of elements in an array

/* pseudocode
 DECLARE a:Array[5] of Integer
 DECLARE sum:Integer
   SET sum = 0
   FOR i = 0 to 4
      READ a[i]
    END FOR
    FOR i = 0 to 4
      sum = sum + a[i]
    END FOR
    PRINT sum

 */

//code
public class sum_array {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of elements in the array is: " + sum);
    }

}
