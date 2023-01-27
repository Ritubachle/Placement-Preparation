//Program to Print Transpose of a Matrix.
import java.util.*;
public class Prob03 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of Rows :");
        int row=sc.nextInt();
        System.out.println("Enter Number of column :");
        int col=sc.nextInt();

        int Array[][] =new int[row][col];

        //Input
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                Array[i][j]=sc.nextInt();
            }
        }
        //Output
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(Array[i][j]+ " ");
            }
            System.out.println();
       
        }
        //Output
        System.out.println("Transpose Matrix is : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(Array[j][i]+ " ");
            }
            System.out.println();
       
        }  
    }
   
 }
