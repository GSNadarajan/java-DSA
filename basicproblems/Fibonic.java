import java.util.Scanner;

public class Fibonic {
    public static void main(String[] args){
        System.out.print("Enter the number of iterations:");
        Scanner x = new Scanner(System.in);
        int a = 0 , b = 1, i, c;
        int no = x.nextInt();
        System.out.print(a+" "+b);
        for(i=2;i<=no;i++){
            c = a+b;
            System.out.print(" "+c);
            a = b;
            b = c;
        }
    }
    
}
