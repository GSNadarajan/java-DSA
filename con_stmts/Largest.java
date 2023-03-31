package con_stmts;

import java.util.Scanner;

public class Largest {
    //let us find the largest no of given three numbers
    public static void main(String[] args){
        System.out.print("Enter the Three numbers:");
        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        int b = n.nextInt();
        int c = n.nextInt();
        int max;
        if(a>b){
            System.out.println(a+" is largest number");
        }
        else if(b>c){
            System.out.println(b+" is largest number");
        }
        else{
            System.out.println(c+" is largest number");
        }

        // max = a;

        // if(b > max){
        //     max = b;
        // }

        // else if(c > max){
        //     max = c;
        // }
        // else{
        //     max = a ;
        // }

        // System.out.println(max);



        
    }
    
}
