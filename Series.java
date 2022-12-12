package lesson2; 
import java.util.Scanner;  
import static java.lang.Math.pow;  
public class Series {  

    public static void main(String[] args) {  

        Scanner input = new Scanner(System.in);  

        int n = input.nextInt();  
        int res;  

        if (n <= 2) {   	
            res = 1;  
        } else if (n == 3) {  
            res = 2;  
        } else if (n == 4) {  
            res = 3;  
        } else {  

            int r = n % 2;  
            n -= 4;  
            n /= 2;  
            System.out.println(n);  

            if (r == 0) {  
                res = (int) pow(3, n + 1);  
            } else {  
                res = (int) pow(2, n + 2);  
            }  
        }  
        System.out.println(res);  
    }  
} 