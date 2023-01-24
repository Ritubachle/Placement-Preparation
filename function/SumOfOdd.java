//program to do sum of all odd number till  n using function.

import java.util.*;
public class SumOfOdd {

    static int oddsum(int n){
        int sum=0;
        for(int i=1; i<=n; i++){
            if((i%2)!=0)
            sum= sum+i;
         }
         return sum;
        }
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n=sc.nextInt();
        System.out.println("Sum of all odd Number till  is : "+ oddsum(n));

    }
}
