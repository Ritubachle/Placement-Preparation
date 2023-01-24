//Program to calculate Average of three Number using Function.

import java.util.*;
public class Average {



    static float average(float a,float b,float c){

        return ( (a+b+c)/3);
    }

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the First Number:");
        int a=sc.nextInt();
        System.out.println("Enter the Second Number:");
        int b=sc.nextInt();
        System.out.println("Enter the third Number:");
        int c=sc.nextInt();

    System.out.println("Average:"+ average(a,b,c));

    }
}
