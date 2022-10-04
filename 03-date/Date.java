
/**
 * Write a description of class Date here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Date
{
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        // Testing Around
        //String tea = input.nextLine();
        // System.out.println(tea);
        // Testing Around
        
        //day
        System.out.println("Insert Day:");
        String day = input.nextLine();
        
        //month
        System.out.println("Insert Month:");
        String month = input.nextLine();
        
         // date
        System.out.println("Insert Date:");
        int date; 
        date = input.nextInt();
        
        //year 
        System.out.println("Insert Year:");
        int year;
        year = input.nextInt();
        
        input.close();//close scanner
        
    System.out.println("American Format: "+day+ ", "+month+" "+date+", "+year);
    System.out.println("European Format: "+day+" "+date+" "+month+" "+year );
    }
    }
