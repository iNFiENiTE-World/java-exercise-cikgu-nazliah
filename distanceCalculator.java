import java.util.Scanner;

class distanceCalculator {
   public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
      
      double s_in, t_in, d_out;
      
      log("Speed: ");
      s_in = sc.nextDouble();
      
      log("Time: ");
      t_in = sc.nextDouble();
      
      d_out = s_in * t_in;
      
      log("Distance travelled is " + d_out + " km");
      
      sc.close();
   }
   
   static void log (String message) {
      System.out.print(message);
   }
}