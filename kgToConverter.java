import java.util.Scanner;

class kgToConverter {
   public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
         
      double kg, g;
      
      log("Please input value of kg: ");
      kg = sc.nextDouble();
      
      g = kg * 1000;
      
      log(g + " g");
         
      sc.close();
   }
   
   static void log (String message) {
      System.out.print(message);
   }
}  