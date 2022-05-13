import java.util.Scanner;

class passOrNot {
   public static void main (String[] args) {

      Scanner sc = new Scanner (System.in);
      
      double mark;
      
      log ("Mark: ");
      mark = sc.nextDouble();
      sc.close();
      
      if (mark <= 40) {
         return;
      }
      
      log ("PASS");
      
   }
   
   static void log (String message) {
      System.out.print(message);
   }
}