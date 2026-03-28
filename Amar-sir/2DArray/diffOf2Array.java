import java.util.Scanner;

// Calculate the difference of two 2D arrays

/*  pseudocode
 DECLARE rows:Integer
 DECLARE cols:Integer
 DECLARE arr1: Array[rows][cols] of Integer
 DECLARE arr2: Array[rows][cols] of Integer
 DECLARE diffArr: Array[rows][cols] of Integer

 READ rows
 READ cols

 FOR i FROM 0 TO rows-1 DO
    FOR j FROM 0 TO cols-1 DO
        Print "Enter element for arr1[" + i + "][" + j + "]: "
        READ arr1[i][j]
        Print "Enter element for arr2[" + i + "][" + j + "]: "
        READ arr2[i][j]
    END FOR
 END FOR

 FOR i FROM 0 TO rows-1 DO
    FOR j FROM 0 TO cols-1 DO
        diffArr[i][j] = arr1[i][j] - arr2[i][j]
    END FOR
 END FOR

 PRINT "Difference of corresponding elements in the two arrays:"
 FOR i FROM 0 TO rows-1 DO
    FOR j FROM 0 TO cols-1 DO
        PRINT diffArr[i][j] + " "
    END FOR
    PRINT NEWLINE
 END FOR
 */
public class diffOf2Array {
    
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter the number of rows: ");
            int rows= sc.nextInt();
            System.out.print("Enter the number of columns: ");
            int cols= sc.nextInt();
    
            int[][] arr1= new int[rows][cols];
            int[][] arr2= new int[rows][cols];
            int[][] diffArr= new int[rows][cols];
    
            for(int i=0; i<rows; i++){
                for(int j=0; j<cols; j++){
                    System.out.print("Enter element for arr1[" + i + "][" + j + "]: ");
                    arr1[i][j]= sc.nextInt();
                    System.out.print("Enter element for arr2[" + i + "][" + j + "]: "); 
                    arr2[i][j]= sc.nextInt();
                }
            }
    
            for(int i=0; i<rows; i++){
                for(int j=0; j<cols; j++){
                    diffArr[i][j]= arr1[i][j]- arr2[i][j];
                }
            }
    
            System.out.println("Difference of corresponding elements in the two arrays:");
            for(int i=0; i<rows; i++){
                for(int j=0; j<cols; j++){
                    System.out.print(diffArr[i][j]+ " ");
                }
                System.out.println();
            }
        }
}
