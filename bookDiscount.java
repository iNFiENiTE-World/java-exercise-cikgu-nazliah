import java.util.Scanner;

class bookDiscount {
   public static void main (String[] args) {
      Scanner sc = new Scanner (System.in);
      
      double price, sale_price;
      
      log("The price of book (RM): ");
      price = sc.nextDouble();
      
      sale_price = price * 0.65;
      
      log("Sale price of book is RM " + sale_price);
      
      sc.close();
   }
   
   static void log (String message) {
      System.out.print(message);
   }
}