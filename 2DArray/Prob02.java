//Program to Sharch an Element in a 2D Array .
import java.util.*;
public class Prob02 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of rows :");
        int row =sc.nextInt();
        System.out.println("Enter Number of columns :");
        int col =sc.nextInt();

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
              System.out.print(Array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter an Element to be Searched :");
        int x=sc.nextInt();
        int count =0;

        //Searching...
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(Array[i][j]==x)
                {System.out.print("Enter Found at index"+ "(" +i+" , "+j+").");
                    count=count+1;
                }
                
            }
            System.out.println();
            }  
            if(count==0){
                System.out.println("Element Not found!");
        }
    }
}
