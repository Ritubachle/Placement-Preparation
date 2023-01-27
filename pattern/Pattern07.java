import java.util.Scanner;

import java.util.*;
public class Pattern07 {
    public static void main(String[] args){
 Scanner sc= new Scanner(System.in);
 System.out.println("enter the number of colunm(inverted number)");
 int m= sc.nextInt();

for(int i=m;i>=1;i--){
    for( int j=1; j<=i;j++){
        System.out.print(j);

    }
    System.out.println();
}
 }
}
