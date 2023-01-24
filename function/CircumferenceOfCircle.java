//program to calculate the Area of circumference of circle using Function.

import java.util.*;
public class CircumferenceOfCircle {

    static float circumference(float r){
        final float PI=3.14F;
        return 2*PI*r;  //circumference of circle 2*pi*r( r=radius)

    }
    static float area(float r){
    
        final float PI=3.14F;
        return PI*r*r; //Area of circle= pi*radius*radius.
    }

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Radius of Circle:");
       
        float r=sc.nextInt();

       System.out.println("Circumference :"+ circumference(r));
       System.out.println("Area :"+ area(r));
    }
}