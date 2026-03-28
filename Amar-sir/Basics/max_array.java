import java.util.*;
// Java program to find the maximum element in an array

/* pseudocode
 DECLARE arr:Integer array
 DECLARE max:Integer
 SET max = Integer.MIN_VALUE

 FOR i = 0 to length of arr - 1
    IF arr[i] > max THEN
        SET max = arr[i]
    END IF
 END FOR

 PRINT max
 */

//code
public class max_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element in the array is: " + max);
    }
}
