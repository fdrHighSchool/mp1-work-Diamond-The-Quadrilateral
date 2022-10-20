
/**
 * Write a description of class Rng here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
import java.util.Scanner;
public class Rng
{
   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
    int Max = 0;
    
    //Testing Extra(Hints)
    System.out.println("Would You Like Hints On?  \nY/N:");
    String Hints = input.nextLine();
    //Testing Extra(Hints)
    
    //ask diff
    System.out.println("Choose A Difficulty ");
    System.out.println("Easy = (1-25)");
    System.out.println("Medium = (1-50)");
    System.out.println("Hard = (1-100)");
    String Diff = input.nextLine();
    
    //Diff Intervals
    if(Diff.equals("Easy")){
      Max = 25;
    } else if(Diff.equals("Medium")){
        Max = 50;
    } else{if(Diff.equals("Hard")){
      Max = 100;
    }}

    
    // Generate Random #
    Random random = new Random();
    int number = random.nextInt(Max) + 1;

    // HElp Decoding
   System.out.println("The Number Was "+number);
    //Helpdfjdf

    //looping
    int loop;
    loop = 1;
   while(loop == 1){
       System.out.println("I Am Thinking Of A Number Between 1-"+Max);
       System.out.println("Take A Guess: ");
       //Input
        int guess = input.nextInt();
       if(number == guess) { //If Guess Is Right
        System.out.println("Congrats! You Guessed It");
         System.out.println("The Number Was "+number);
          System.out.println("You Guessed "+guess);
          break;
        } else{ //If Guess Is Wrong
       //Testing Extra(Hints)
       if(Hints.equals("Y")){
           System.out.println("Your Guess Was Off By "+Math.abs(number- guess));
       }
       //Testing Extra(Hints)
      System.out.println("Guess Again");
      System.out.println("");
     }
   }// looping closes
  }// main close
}// class close

