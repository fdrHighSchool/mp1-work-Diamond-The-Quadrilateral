import java.util.Scanner;
import java.lang.Math;
public class UserName {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);

    // get String input from user
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();
    System.out.print("Enter your favorite number:");
    String favNum = s.nextLine();
    System.out.print("Are You A Student or a Teacher?: ");
    String whichRole = s.nextLine().toLowerCase();
    
    if(whichRole.equals("teacher")){
        System.out.println("Your Username Is " + firstLetter(firstName) + (lastName) + favNum+"@schools.nyc.gov");
        System.out.println("How Long Would You Like Your Randomly Generated password to be?");
        int length = s.nextInt();
         System.out.println("Here's Your Randomly Generated Password: " + genPassword(length));
    } else if (whichRole.equals("student")){
      System.out.println("Your Username Is " + (firstName) + firstLetter(lastName) + favNum+"@nycstudents.net");
      System.out.println("How Long Would You Like Your Randomly Generated password to be?");
      int length = s.nextInt();
       System.out.println("Here's Your Randomly Generated Password: " + genPassword(length));
    }else{
        System.out.println("I Don't Quite Understand "+ whichRole);
    }
    
    s.close();
}// end main MO

public static String genPassword(int length){
         
        //Placeholder
        String randomPassword = ("");
        int max = 0;
        int min = 0;
        for(int i = length; i>0; i--){
      //MO 1
      
      //String characterBank = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
      //int grabOne = rand.nextInt(35);
      //String randomLetter = characterBank.substring(grabOne, grabOne+1);
      //randomPassword = (randomPassword + randomLetter);
      
      //MO1
     
      //ASCI MO
      int whichList = (int)(Math.random()*3);
      if (whichList ==0){ //Capital Letters
      min = 65;
      max = 90;
       }else if(whichList==1){ //Lowercase Letters
       min = 97;
       max = 122;
       }else{//Symbols
        min =33;
        max = 47;
       }//Extra Random End
    
       int rand = (int)(Math.random()*(max-min)+min); 
       char addPass = (char)rand;
       randomPassword +=addPass;
       
   }// loop end
      //ASCI MO
   System.out.println("Randomly Genned Password: " + randomPassword);
   return randomPassword;
  }// end genPass

  /*
   * Name: firstLetter
   * Purpose: send back the first character (inital) of a name
   * Input: a name (String)
   * Return: a single character (String)
   */
  public static String firstLetter(String n) {
    return n.substring(0, 1);
    
  } // end initialize method
} // end class