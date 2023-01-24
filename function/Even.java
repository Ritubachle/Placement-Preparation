//Function --->Program to cheak if a number is even or not.
import java.util.*;
public class Even {

    static int checkeven(int n){
        if(n%2==0)
            System.out.println("It is a Even Number:");

        else
            System.out.println("It is not a Even Number");
        

        return 0;

    }
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n=sc.nextInt();
        checkeven(n);
    }
}
