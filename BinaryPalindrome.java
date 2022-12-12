package lesson2;
import java.util.Scanner;
public class BinaryPalindrome {

	public static void main(String[] args) {
		long num = 34, n1;
	      long reverse = 0;
	      n1 = num;
	      while (n1 > 0) {
	         reverse <<= 1;
	         if ((n1 & 1) == 1)
	            reverse ^= 1;
	         n1 >>= 1;
	      }
	      if(num == reverse) {
	         System.out.println(num + " is palindrome");
	      }else {
	         System.out.println(num + " is not palindrome");
	      }
	   }
	}
