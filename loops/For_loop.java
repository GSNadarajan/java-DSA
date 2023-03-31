package loops;

import java.util.Scanner;

public class For_loop {
    public static void main(String[] args){
        System.out.println("Enter the no of iterations:");
        Scanner n = new Scanner(System.in);
        int no = n.nextInt();
        //for loops syntax  for(datatype initialization ; condition ; increment/decrement){ condition}

        for(int i=1; i <= no; i++){
            System.out.println(i+")"+ "Hello world");
        }
         

    }
    
}
