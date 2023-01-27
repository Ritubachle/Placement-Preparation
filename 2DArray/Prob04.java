//Given a 2D Array , print it in spiral form.
import java.util.*;
public class Prob04 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Columns : ");
        int col=sc.nextInt();
        System.out.println("Enter Number of Rows : ");
        int row=sc.nextInt();

        int Array[][]= new int[row][col];


        //Input
        System.out.println("Total "+row*col+" Elements ! ");
        for(int i=0; i<row; i++){
            System.out.println("Enter " +col+" Elements in "+(i+1)+" th Row : ");
            for(int j=0; j<col; j++){ 
                Array[i][j]=sc.nextInt();
            }
        }


        //output
         System.out.println("Entered Matrix is : ");
         for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(Array[i][j]+" ");
            }
            System.out.println();
        }

        
       //Spiral    ------->
        System.out.println("Spiral Output is : ");

        int rowStart=0;
        int colStart=0;
        int rowEnd=row-1;
        int colEnd=col-1;

        
        while(rowStart<=rowEnd && colStart<=colEnd)
        {
        //1 i=rowstart, j=colstart to colEnd
        for(int j=colStart; j<=colEnd; j++){
            System.out.print(Array[rowStart][j]+" ");
        }
        rowStart++;

         //2 j=colend, i=1 to rowend
         for(int i=rowStart; i<=rowEnd; i++){
            System.out.print(Array[i][colEnd]+" ");
        }
        colEnd--;

        //3 i=rowend, j=colend-1 to 0
         for(int j=colEnd; j>=colStart; j--){
            System.out.print(Array[rowEnd][j]+" ");
        }
        rowEnd--;
    
         //4 j=colstart , i= rowend-1 to 1
         for(int i=rowEnd; i>=rowStart; i--){
            System.out.print(Array[i][colStart]+" ");
        }
        colStart++;

        System.out.println();
        }
    }
    
}
