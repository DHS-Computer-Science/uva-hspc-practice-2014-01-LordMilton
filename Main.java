//TODO: <name>
//TODO: <date>
//Practice 2014 - 01: !terces poT
import java.util.Scanner;

public class Main{
   public static void main(String[] args) throws Exception{
      Scanner scan = new Scanner(new java.io.File("in-out\\judging.in"));
      //Scanner scan = new Scanner(System.in);
   
      String code = scan.nextLine();
      do{
         for(int i = code.length()-1; i >= 0 ; i--)
            System.out.print(code.charAt(i));
         System.out.println();
         code = scan.nextLine();
      }
      while(!code.equals("END"));
      System.exit(0);
   }
}
