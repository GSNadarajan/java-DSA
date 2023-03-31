package con_stmts;

import java.util.Scanner;

// Eligible to vote or not

public class Age {
    public static void main(String[] args){
        System.out.print("Enter your age:");
        Scanner c = new Scanner(System.in);  // This is scanner class used to get input through keyboard
        int age = c.nextInt();
        if(age > 18){
            System.out.println("Your age is " + age + "and you are eligible to vote !");
        }
        else{
            System.out.println("Your age is " + age + " and you are not eligible to vote !");

        }
      }
}