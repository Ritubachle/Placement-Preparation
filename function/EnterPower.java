//Program to Enter x and n and printing x raise to the power n.

import java.util.*;
public class EnterPower {

    static int power(int x,int n){

        int ans=1;

        for(int i=1;i<=n;i++){

            ans=ans*x;
        }
        return ans;

    }
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Value of x :");
        int x=sc.nextInt();
    System.out.println("Enter the Value of n :");
        int n=sc.nextInt();

        System.out.println("Value of " +x+ "  raise to the power of  "+n+ "  is: "+power(x,n));


    }
}
