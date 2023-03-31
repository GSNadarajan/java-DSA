package con_stmts;

import java.util.Scanner;

public class Number {
    public static void main(String[] args){
        System.out.print("Enter any random number:");
        Scanner n = new Scanner(System.in);
        int no =  n.nextInt();
        if(no > 0){
            System.out.println("The number " + no +" is positive");
        }
        else if(no < 0){
            System.out.println("The number " + no +" is negative");
        }
        else{
            System.out.println("The number " + no +" is zero");

        }
    }
    
}
