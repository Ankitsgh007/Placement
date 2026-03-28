import java.util.Scanner;

// Calculate the sum of all elements in a 2D array

/*  pseudocode
 DECLARE rows:Integer
 DECLARE cols:Integer
 DECLARE arr: Array[rows][cols] of Integer
 DECLARE sum:Integer

 READ rows
 READ cols

 FOR i FROM 0 TO rows-1 DO
    FOR j FROM 0 TO cols-1 DO
        READ arr[i][j]
    END FOR
 END FOR

 sum = 0

 FOR i FROM 0 TO rows-1 DO
    FOR j FROM 0 TO cols-1 DO
        sum = sum + arr[i][j]
    END FOR
 END FOR

 PRINT "Sum of all elements: " + sum
 */
public class elementSum {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int rows= sc.nextInt();
        int cols= sc.nextInt();

        int[][] arr= new int[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j]= sc.nextInt();
            }
        }

        int sum=0;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                sum+= arr[i][j];
            }
        }

        System.out.println("Sum of all elements: " + sum);
    }
}
