package lesson2;

public class LongestOnes {
   public static void main(String strings[]) {
      int num = 15;
      int count = 0;
      while (num!=0) {
         num = (num & (num << 1));
         count++;
      }
      System.out.println("The length of the longest consecutive 1's is: " + count);
   }
}
