/*Pattern no.02 (hollow rectangle) 
    
*****
*   *
*   *
*****

*/
import java.util.*;
public class HollowRectangle {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Number of columns:");
    int n=sc.nextInt();
    System.out.println("Enter the Number of Rows:");
    int m=sc.nextInt();

    for(int i=1;i<=n;i++){

        for(int j=1;j<=m;j++){
            if(i==1 || i==n || j==1 || j==m ){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        

        }System.out.println();
    }
    }
}
