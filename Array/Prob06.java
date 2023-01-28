//Program to find the sum and Product of all elements of array.
import java.util.*;
public class Prob06 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int n=sc.nextInt();

        int sum=0,pro=1;

        int Array[]=new int[n];
        
        //Input 
        
        System.out.println("Enter all " +n+ " values :");
        for(int i=0;i<n;i++){
            Array[i]=sc.nextInt();
        }
        //calculation 
        for(int i=0;i<n;i++){
            sum=sum+Array[i];
            pro=pro*Array[i];
        }
        System.out.println("Sum of all Elements of the Array is:"+sum);
        System.out.println("Product of all Elements of the Array is:"+pro);
    }
}
