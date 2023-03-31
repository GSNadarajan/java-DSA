package con_stmts;

import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args){
      System.out.print("Enter any character or word:");
      Scanner n = new Scanner(System.in);
      char x = n.next().trim().charAt(0);
      if(x >= 'a' && x <= 'z' ){
        System.out.println(x +"is in small case letter");
      }
      else{
        System.out.println(x +" is in upper case letter");

      }

    }
    
}
