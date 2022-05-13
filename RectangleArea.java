import java.util.Scanner;

class RectangleArea {
   public static void main (String[] args) {
      Scanner sc = new Scanner (System.in);
      double l, w, area;
      
      l = sc.nextDouble();
      w = sc.nextDouble();
      
      area = l * w;
      
      System.out.print(area);
   }
}