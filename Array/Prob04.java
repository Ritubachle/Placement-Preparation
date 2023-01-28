//Program to Find Total No. of Positive , Negative ,Even ,Odd and Zeros in an Array.
import java.util.*;
public class Prob04 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        float Array[]=new float[10];
        int pos, neg, even, odd, zero;
         pos=neg=even=odd=zero=0;
        //Input
        System.out.println("Enter tan Values");
            for(int i=0;i<10;i++){
                Array[i]=sc.nextFloat();
            }
        //cheak
        for(int i=0;i<10;i++){
            //positive
            if(Array[i]>0)
            pos++;
            if(Array[i]<0)
            neg++;
            if(Array[i]==0)
            zero++;
            if(Array[i]%2==0)
            even++;
            else 
            odd++;
        } 
        System.out.println("Total Number of Positive Values : "+ pos);
        System.out.println("Total Number of Negative Values :"+ neg);
        System.out.println("Total Number of Even Values :"+ even);
        System.out.println("Total Number of Odd Values :"+ odd);
        System.out.println("Total Number of Zeros :" +zero);                                                                       
    }
}
