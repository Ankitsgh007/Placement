
package Basics;

import java.util.*;

// Read x and y coordinates and find the quardant

/* pseudocode
 DECLARE x:Integer
 DECLARE y:Integer

 READ x
 READ y

 IF x>0 AND y>0 THEN
    PRINT "1st quardant"
 ELSE IF x<0 AND y>0 THEN
    PRINT "2nd quardant"
 ELSE IF x<0 AND y<0 THEN
    PRINT "3rd quardant"
 ELSE IF x>0 AND y<0 THEN
    PRINT "4th quardant"
 ELSE
    PRINT "origin"
 END IF
 */

//code
public class quardant {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        int x= sc.nextInt();
        int y= sc.nextInt();

        if(x>0 && y>0){
            System.out.println("1st quardant");
        }
        else if(x<0 && y>0){
            System.out.println("2nd quardant");
        }
        else if(x<0 && y<0){
            System.out.println("3rd quardant");
        }
        else if(x>0 && y<0){
            System.out.println("4th quardant");
        }
        else{
            System.out.println("origin");
        }

        sc.close();
    }
}
