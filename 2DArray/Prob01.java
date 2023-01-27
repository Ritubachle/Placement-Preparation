//Program to Create a 2D Array by taking Input From the User.
import java.util.*;
public class Prob01 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number of columns :");
        int col=sc.nextInt();

        System.out.println("Enter number of rows :");
        int row=sc.nextInt();

        int Number [][]=new int[row][col];

        //Input 
        System.out.println(" Total "+ row*col +" Element ! ");

       for(int i=0;i<row;i++){
    
        for(int j=0;j<col;j++){
            Number[i][j]=sc.nextInt();
        }
       }
       //Output
       System.out.println("Enter Matrix is:");
       for(int i=0;i<row;i++){

        for(int j=0;j<col;j++){
            System.out.print(Number[i][j]+ " ");
        }
        System.out.println();
       }

    }
}
