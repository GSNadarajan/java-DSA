import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        System.out.print("Enter some basic operator:");
        Scanner in = new Scanner(System.in);
        char op = in.next().trim().charAt(0);  
        System.out.println("Enter the two input numbers:");
        
        if(op == '+' || op == '-' || op == '*' || op == '/' ) {
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            if(op == '+'){
               
                int add = num1+num2;
                System.out.println("The sum value is "+ add+"\n");
            }
            if(op == '-'){
                System.out.println("Enter the two input numbers:");
                int sub = num1-num2;
                System.out.print("The sub value is "+ sub +"\n");
            }
            if(op == '*'){
                System.out.println("Enter the two input numbers:");
                int product = num1*num2;
                System.out.print("The product value is "+ product +"\n");
            }
            if(op == '/'){ 
               if(num2 != 0 ){
                System.out.println("Enter the two input numbers:");
                int quotient = num1 /num2;
                System.out.print("The quotient value is "+ quotient +"\n");
               }
                
            }
           

        }
           
        else{
            System.out.print("Please enter some valid operator !");
          
        }

        }
            
    
       
        
    }
