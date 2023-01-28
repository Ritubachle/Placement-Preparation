//Program to cheak if an array is sorting in ascending order or not.
import java.util.*;
public class Prob02 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int n=sc.nextInt();

        boolean isSorted= true;
        int Array[]=new int[n];

        //Input 
        System.out.println("Enter the Values: ");
        for(int i=0;i<n;i++){
            Array[i]=sc.nextInt();

        }
        //cheak Ascending----->Increasing order ex.(1,2,3,4.....)
        for(int i=0;i<n;i++){
            if(Array[i]<Array[i]-1)
           isSorted=false;
        }
        if(isSorted)
        System.out.println(" Sorted in Ascending Order.");
        else 
        System.out.println(" NOT Sorted in Ascending Order.");
    }
}
