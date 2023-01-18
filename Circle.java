//program to cheak the area of circle.
import java.util.Scanner;
public class Circle {
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the radius:");//Input from user
int r=sc.nextInt();
//Constant 
final float PI= 3.14f;
//Perimeter
float p= 2*PI*r;
//Area
float a= PI*PI*r;

System.out.println("perimeter: "+p);
System.out.println("Area: "+ a);


    }
}
