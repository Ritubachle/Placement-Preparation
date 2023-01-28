//Program to Cheak Elements From an Array are same front and back or not.
import java.util.*;
public class Prob08 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Elements:");
        int n=sc.nextInt();

        int Array[]=new int[n];
        boolean isSame=true;
        //Input
        System.out.println("Enter the "+n+" values:");
        for(int i=0;i<n;i++){
            Array[i]=sc.nextInt();
        }

        //Comparasion
        for(int i=0;i<n;i++){
            if(Array[i]!= Array[n-1-i])
            isSame=false;

        }
        if(isSame)
        System.out.println("This Array is Same from Front and Back.");
        else 
        System.out.println("This Array is Not same from Front and Back.");
    }
}
