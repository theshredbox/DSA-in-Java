package lesson2; 
import java.util.Scanner;  
import java.util.regex.Matcher;  
import java.util.regex.Pattern;  
public class RegularExpressions {  
 

    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);  
        String sample_input = input.nextLine();  
        String reg_expression = input.nextLine();  
        Pattern pattern = Pattern.compile(reg_expression, Pattern.CASE_INSENSITIVE);  
        Matcher matcher = pattern.matcher(sample_input);  
        boolean matchFound = matcher.find();  

        if (matchFound) {  

            System.out.println("Matched");  

        } else {  

            System.out.println("Does not match");  

        }  

    }  

} 