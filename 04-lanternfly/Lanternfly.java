
/**
 * Write a description of class Lanternfly here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Lanternfly
{
   public static void main(String [] args){
       Scanner input = new Scanner(System.in);
       
       System.out.println("What Did You Score On Your Test?");
       int num = input.nextInt();
       if (num < 65){
           System.out.println("You Failed That Test :(, Better Luck Next Time");
       }
       else {
           System.out.println("Yaya You Passed!");
       }
   }
}
