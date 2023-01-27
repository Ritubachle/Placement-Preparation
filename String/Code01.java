//Program to create a string builder an set a alphabet with perticular index.
import java.util.*;
public class Code01 {
    public static void main(String[] args){

        StringBuilder sb= new StringBuilder("ritu ");
        System.out.println("Orignal string is: "+ sb);
        

        sb.setCharAt(0, 's');
        System.out.println("The change string is "+sb);
        
    }
}
