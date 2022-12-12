package lesson2;

import java.util.Scanner;

public class SwappingNumbers {
  static byte swapTwoNibbles(byte val) {
    byte num;
    num = (byte)((val & 0x0F) << 4 | (val & 0xF0) >> 4);
    return num;
  }

  public static void main(String[] args) {
    Scanner SC = new Scanner(System.in);

    byte num = 0;
    byte res = 0;

    System.out.printf("Enter number: ");
    num = SC.nextByte();

    res = swapTwoNibbles(num);

    System.out.printf("\nNumber after swapping nibbles : %d\n", res);
  }
}
