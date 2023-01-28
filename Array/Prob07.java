//Program to initialize and Print all Element of 2D Array.
import java.util.*;
public class Prob07 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Number of Rows:");
    int row=sc.nextInt();
    System.out.println("Enter the Number of columns:");
    int col=sc.nextInt();

        int Array[][]=new int[row][col];

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
    }
}
