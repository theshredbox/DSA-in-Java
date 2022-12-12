package lesson2;
import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the 1st String:");
        String s1= in.nextLine();
        System.out.println("Enter the 2nd String:");
        String s2 = in.nextLine();


        if(s1.length() == s2.length()) {

            char[] charArray1 = s1.toCharArray();
            char[] charArray2 = s2.toCharArray();


            Arrays.sort(charArray1);
            Arrays.sort(charArray2);


            boolean result = Arrays.equals(charArray1, charArray2);

            if(result) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        else {
            System.out.println("NO");
        }
    }
}