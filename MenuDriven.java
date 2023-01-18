//Program to make a menu that user do-while loop.

import java.util.*;
import javax.lang.model.util.ElementScanner14;
public class MenuDriven {
    public static void main(String[] args){
Scanner sc= new Scanner(System.in);

int n;
do{
   System.out.println("Enter the Marks");
   int marks=sc.nextInt();

   if(marks>=90)
    System.out.println("this is Good");
   else if (marks<=89 && marks>=60)
   System.out.println("this is also Good");
   else if(marks<=59 && marks>=0)
   System.out.println("this is Good as Well");
   else 
   System.out.println("Marks don't matter but our efforts does");

 System.out.println("You can enter either 1 or 0 Enter your choice");

   n=sc.nextInt();
}while(n==1);

 }
}
