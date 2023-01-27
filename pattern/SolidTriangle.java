/*pattern no. 03 (Solid left triangle) 
 
*
**
***
****
*****

*/

import java.util.*;
public class SolidTriangle {
  public static void main(String[] args){
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the Number of columns:");
  int n=sc.nextInt();
  

  //no. of lines--->columns
  for(int i=1;i<=n;i++){

     //no. of stars--->Rows 
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
  }
}  
}
