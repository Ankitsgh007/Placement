import java.util.Scanner;

// Count the number of even and odd elements in a 2D array
/*  pseudocode
 DECLARE rows:Integer
 DECLARE cols:Integer
 DECLARE arr: Array[rows][cols] of Integer
 DECLARE evenCount:Integer
 DECLARE oddCount:Integer

 READ rows
 READ cols

 FOR i FROM 0 TO rows-1 DO
    FOR j FROM 0 TO cols-1 DO
        READ arr[i][j]
    END FOR
 END FOR

 evenCount = 0
 oddCount = 0

 FOR i FROM 0 TO rows-1 DO
    FOR j FROM 0 TO cols-1 DO
        IF arr[i][j] % 2 == 0 THEN
            evenCount = evenCount + 1
        ELSE
            oddCount = oddCount + 1
        END IF
    END FOR
 END FOR

 PRINT "Number of even elements: " + evenCount
 PRINT "Number of odd elements: " + oddCount
 */
public class countEvenOdd {
    
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

        int evenCount=0;
        int oddCount=0;

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(arr[i][j]%2==0){
                    evenCount++;
                }
                else{
                    oddCount++;
                }
            }
        }

        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);
    }
}
