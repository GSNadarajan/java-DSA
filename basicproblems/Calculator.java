import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        System.out.print("Enter some op:");
        Scanner x = new Scanner(System.in);
        // int num1, num2;
        String op = x.next().trim().charAt(0);
        System.out.print(op);
        if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%' ){
            System.out.print("welcome");
           //get two values from the user as input
        //    num1 = x.nextInt();
        //    num2 = x.nextInt();
        //    if(op == '+'){
        //      int add = num1 + num2;
        //      System.out.print(add);
        //    }
        //    else{
        //     System.out.print("Please enter some valid op such as +,-,*,/");
        //    }
        }
        else{
            System.out.print("go out");

        }


           
        }
    }
