import java.util.Scanner;
// Print a 2D array

/*  pseudocode
 DECLARE rows:Integer
 DECLARE cols:Integer
 DECLARE arr: Array[rows][cols] of Integer
 READ rows
 READ cols

 FOR i FROM 0 TO rows-1 DO
    FOR j FROM 0 TO cols-1 DO
        READ arr[i][j]
    END FOR
 END FOR

 FOR i FROM 0 TO rows-1 DO
    FOR j FROM 0 TO cols-1 DO
        PRINT arr[i][j] + " "
    END FOR
    PRINT NEWLINE
 END FOR
 */
public class print2DArray {
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

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
