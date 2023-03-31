package loops;

import java.util.Scanner;

public class Oddno {
    public static void main(String[] args){
        System.out.print("Enter the number:");
        Scanner n = new Scanner(System.in);
        int no = n.nextInt();
        if(no % 2 == 0){
            System.out.println("The given number "+no+" is even");
        }
        else{
            System.out.println("The given number "+no+" is odd");

        }
    }
    
}
