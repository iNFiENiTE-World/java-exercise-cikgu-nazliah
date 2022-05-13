class SwapValue {
   public static void main (String[] args) {
      int val1 = 77, val2 = 99, temp;
      
      System.out.println("First value BEFORE swap: " + val1);
      System.out.println("Second value BEFORE swap: " + val2);
      
      temp = val1;
      val1 = val2;
      val2 = temp;
      
      System.out.println("First value AFTER swap: " + val1);
      System.out.println("Second value AFTER swap: " + val2);
   }
}