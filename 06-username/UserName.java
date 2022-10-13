import java.util.Scanner;

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
    String whichRole = s.nextLine();
    
    
    // test output
    System.out.print("Your Username Is " + (firstName) + firstLetter(lastName) + favNum);
    if(whichRole.equals("Teacher")){
        
        System.out.println("@schools.nyc.gov");
    } else{
      System.out.println("@nycstudents.net");
    }
    

    s.close();
  }// end main method

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