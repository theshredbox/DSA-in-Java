package lesson2;
import java.util.Scanner;

class MangoTree

{

    public static void main(String args[])

    {

        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int c=s.nextInt();
        int n=s.nextInt();
        if(n==10||n==11||n==16||n==17||n==18||n==19||n==20||n==5||n==4||n==2||n==3)

        {
            System.out.println("Yes");

        }
        else

        {
            System.out.println("No");

        }

    }

}