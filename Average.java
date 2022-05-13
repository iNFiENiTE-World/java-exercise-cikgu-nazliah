import java.util.Scanner;

class Average {
   public static void main (String[] args) {
      Scanner sc = new Scanner (System.in);
      double m1, m2, m3, avg;
      
      m1 = sc.nextDouble();
      m2 = sc.nextDouble();
      m3 = sc.nextDouble();
      
      avg = (m1 + m2 + m3) / 3;
      
      System.out.print(avg);
   }
}