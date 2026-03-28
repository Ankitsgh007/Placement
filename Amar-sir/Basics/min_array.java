package Basics;
import java.util.*;

// Java program to find the minimum element in an array

/* pseudocode
 DECLARE arr:Integer array
 DECLARE min:Integer
 SET min = Integer.MAX_VALUE

 FOR i = 0 to length of arr - 1
    IF arr[i] < min THEN
        SET min = arr[i]
    END IF
 END FOR

 PRINT min
 */

//code
public class min_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum element in the array is: " + min);
    }
}
