/*Program to perform  all opration which is Inserted by user.
1.Addition
2.subtraction
3.Multiplication
4.Divide
5.Modulous
*/

import java.util.*;
public class Calculator {
    public static void main(String[] args){
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter the First Integer:");
 int a=sc.nextInt();

 System.out.println("Enter the Second Integer:");
 int b=sc.nextInt();

System.out.println("we got Following Calculator:");

System.out.println("1. Addition:"+(a+b));
System.out.println("2. subtraction:"+(a-b));
System.out.println("3. Multiplication:"+(a*b));
System.out.println("4. Divide:"+(a/b));
System.out.println("5. Modulous:"+(a%b));

    }
}
