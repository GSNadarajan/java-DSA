package loops;

import java.util.Scanner;

public class While_loop {
    public static void main(String[] args){
        System.out.print("Enter any random number:");
        Scanner n = new Scanner(System.in);
        int no = n.nextInt();
        int i = 1;
        while(i<= no){
            System.out.println(i+") Hello world!");
            i++;
        }

    }
    
}
