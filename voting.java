import java.util.Scanner;

class voting {
   public static void main (String[] args) {
      Scanner sc = new Scanner (System.in);
      
      int age;
      
      log ("What is your age? \n");
      age = sc.nextInt();
      
      if (age <= 20) {
         return;
      }
      
      log ("You're entitle to vote");
   }
   
   static void log (String message) {
      System.out.print(message);
   }
}