import java.util.Scanner;
import java.util.Random;
public class UserName {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);

    // get String input from user
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();
    System.out.print("Enter your favrite number:");
    String favNum = s.nextLine();
    System.out.print("Are You A Student or a Teacher?: ");
    String whichRole = s.nextLine().toLowerCase();
    
    
    if(whichRole.equals("teacher")){
        System.out.print("Your Username Is " + firstLetter(firstName) + (lastName) + favNum+"@schools.nyc.gov");
        genPassword();
    } else if (whichRole.equals("student")){
      System.out.println("Your Username Is " + (firstName) + firstLetter(lastName) + favNum+"@nycstudents.net");
       genPassword();
    }else{
        System.out.println("I Don't Quite Understand "+ whichRole);
    }
    
    s.close();
}// end main MO
public static void genPassword(){
       Random rand = new Random();
        String randomPassword = ("");
      for(int i = 0; i<10; i++){
     String characterBank = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
 
      
     int grabOne = rand.nextInt(36);
       String randomLetter = characterBank.substring(grabOne, grabOne+1);
     randomPassword = (randomPassword + randomLetter);
    
    }
  System.out.println("Randomly Genned Password: " + randomPassword);
   
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