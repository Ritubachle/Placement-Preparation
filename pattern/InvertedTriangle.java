/*Pattern no.04 (Inverted triangle)
  
  *****
  ****
  ***
  **
  * 

 */

import java.util.*;
public class InvertedTriangle {
    public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the Number of columns:");
     int n=sc.nextInt();

         for(int i=n;i>=1;i--){

            for(int j=1;j<=i;j++){

                System.out.print("*");
            }
            System.out.println();
         }
    }
}
