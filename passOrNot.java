import java.util.Scanner;

class passOrNot {
   public static void main (String[] args) {

      Scanner sc = new Scanner (System.in);
      
      double mark;
      
      log ("Mark: ");
      mark = sc.nextDouble();
      
      if (mark <= 40) {
         return;
      }
      
      log ("PASS");
      
      sc.close();
   }
   
   static void log (String message) {
      System.out.print(message);
   }
}