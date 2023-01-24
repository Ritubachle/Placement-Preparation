//Program to create Fibonacci Series.(0 1 1 2 3 5 8 13.......)

import java.util.*;
public class Fibonacci {

    static int fibonacci(int n){

        int a=0,b=1;
        int c;
        System.out.print(a+ " "+b+ " ");

        for(int i=1;i<=(n-2);i++){
            c=a+b;
            System.out.print(c+ " ");
            a=b;
            b=c;
        }
        return 0;

    }
public static void main(String[] args){

    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Number :");
    int n=sc.nextInt();
    System.out.println("Febonacci series is : ");
    fibonacci(n);

}
    
}
