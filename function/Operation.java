//program to perform all arithmatic opration by using function

import java.util.*;
public class Operation {

    static float sum(float n,float m){
        return n+m;
    }
    static float sub(float n,float m){
        return n-m;
    }
    static float div(float n,float m){
        return n/m;
    }
    static float mul(float n,float m){
        return n*m;
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number ");
     float n=sc.nextFloat();
     System.out.println("Enter the Second Number:");
     float m=sc.nextFloat();
    
     System.out.println("sum:"+ sum(n,m));
     System.out.println("substraction:"+ sub(n,m));
     System.out.println("division:"+ div(n,m));
     System.out.println("multiplication:"+ mul(n,m));


    }
}
