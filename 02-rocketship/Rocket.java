
/**
 * Write a description of class Rocket here.
 *
 * @author (Diamond)
 * @version (a version number or a date)
 */
public class Rocket
{
      public static void main(String[] args) {
   triangle();
   base();
   usa();
   base();
   triangle();
  }
  public static void triangle(){
    System.out.println("   /\\" );
    System.out.println("  /  \\");
    System.out.println(" /    \\");
    System.out.println("/      \\");
}
  public static void base(){
    System.out.println("+------+");
    System.out.println("|      |");
    System.out.println("|      |");
    System.out.println("+------+");
  }
    public static void usa(){
    System.out.println("|United|");
    System.out.println("|States|");
  }
}
