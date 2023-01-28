//Program to copy Element of an Array to another array in Reverse Order.
import java.util.*;
public class Prob05 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int Array[]=new int[10];
        int ReverseArray[]=new int[10];

        System.out.println("Enter tan Values :");
        for(int i=0;i<10;i++){
            Array[i]=sc.nextInt();
        }
        System.out.println("The Original Array is:");
        for(int i=0;i<10;i++){
            System.out.print(Array[i]+ " ");
        }
        System.out.println();

        System.out.println("Reversed Array is :");
        for(int i=0;i<10;i++){
            ReverseArray[i]=Array[9-i];
            System.out.print(ReverseArray[i]+ " ");
        }
    }
}
