package lesson3;
import java.util.Scanner;

public class MinimumNumber
{
    public static void main(String args[])
    {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int x = 100;
        for (int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i)>=48 && s.charAt(i)<=57)
            {
                int num=0;
                while(i<s.length() && s.charAt(i)>=48 && s.charAt(i)<=57)
                {
                    num = num*10 + s.charAt(i)-'0';
                    i++;
                }
                if(num < x) x = num;
            }

        }

        System.out.println(x);
    }
}