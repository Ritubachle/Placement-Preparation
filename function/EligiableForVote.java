//program to cheak if a persion is Eligiable to vote or not.

import java.util.*;
public class EligiableForVote {

    static int cheakforvote(int age){
     
        if(age>=18){
            System.out.println("You are Eligiable to Vote:");

        }else{
            System.out.println("You are Not Eligiable to Vote:");

        }
        return 0;

    }
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Age:");

        int age=sc.nextInt();

        cheakforvote(age);
    }
}
