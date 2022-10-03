
/**
 * Write a description of class MessingAround here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class MessingAround
{
   public static void main(String [] args){
       Scanner input = new Scanner(System.in);
       
       System.out.println("e");
       
       System.out.println("Insert Username:");
       String name = input.nextLine();
       System.out.println("");
       System.out.println("Insert Password:");
       String password = input.nextLine();
       if (password.equals("Pass")){
           System.out.println("Welcome Back, "+name);
       }
       else {
           System.out.println("Access Denied :(");
       }
       System.out.println("");
       System.out.println("Would You Line To Play The Local Custom Command Line Hidden Treasure?");
       String CommandLine = input.nextLine();
       if(CommandLine.equals("Yes")){
           System.out.println("Good!");
       }
       else if(CommandLine.equals("No")){
       System.out.println("Too Bad, This Is All I Know How To Make :')");
       }
       comline();
}
public static void comline(){
     System.out.println("Too Bad, Work In Progress Or Something ");
     System.out.println("Desk       Laptop Cart       ");
 }
}
