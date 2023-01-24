//Program to Enter the Numbers and at end give total positive,negative and zeros.


import java.util.*;
public class TotalNumber {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int pos=0,neg=0,zer=0;
        int choice;

        do{
            System.out.println("Enter the Number:");
            float n=sc.nextInt();

            if(n>0)
            pos++ ;
            else if(n<0)
            neg++ ;
            else 
            zer++ ;

            System.out.println("Do you want to Enter More Number:");
            System.out.println("yes=1 ; and No=0 ");
            choice=sc.nextInt();

        }while(choice==1);

        System.out.println("Total Positive Number are:" +pos);
        System.out.println("Total Negative Number are:"+neg);
        System.out.println("Total Zeros are:"+zer);

    
    }
}
