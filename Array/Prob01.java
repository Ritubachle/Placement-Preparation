//Program to take and print all name using array.
import java.util.*;
public class Prob01 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Names :");
        int n=sc.nextInt();
        
        String name[]= new String[n];
        //Input
        System.out.println("Enter all the Names :");
        for(int i =0;i<n;i++){
            name[i]=sc.next();
        }

        //Output
        System.out.println("Entered Names are :");
        for(int i=0;i<name.length;i++){
            System.out.println(name[i]);
        }
    }
}
