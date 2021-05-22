import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Email_pattren {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      System.out.println("Enter your name: ");
      String name = scan.nextLine();

      System.out.println("Enter your email id: ");
      String email = scan.next();

      //Here the logic is Regular expression to accept valid email id
      String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";

      //Creating a pattern object
      Pattern pattern = Pattern.compile(regex);

      //Creating a Matcher object
      Matcher matcher = pattern.matcher(email);

      //Verifying whether given phone number is valid
      if(matcher.matches()) {
         System.out.println("Given the email id is valid");
      } else {
         System.out.println("Given the email id is not valid");
      }
   }
}
