/*pattern no.01 (solid rectangle.)
 
 *****
 *****
 *****
 *****
 
 */
import java.util.*;
public class Ractengle {
    public static void main(String[] args){
      Scanner sc= new Scanner(System.in);
    System.out.println("Enter Number of Rows:");//rows means number of stars
    int m=sc.nextInt();
    System.out.println("Enter Number of columns:");//column means number of lines
    int n=sc.nextInt();


    //outer loop--->column....total lines
    for(int i=1;i<=n;i++){
        
      //inner loop--->rows....no.of stars
        for(int j=1;j<=m;j++){
            System.out.print("*");

        }
        System.out.println();
    }
    }
}
