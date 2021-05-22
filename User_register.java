
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User_register {

   private static Pattern usrNamePtrn = Pattern.compile("^[a-z0-9_-]{6,14}$");
    
   public static boolean validateUserName(String userName){
        
       Matcher mtch = usrNamePtrn.matcher(userName);
       if(mtch.matches()){
           return true;
       }
       return false;
   }
    
   public static void main(String a[]){
       System.out.println("Is 'com2puter' a valid user name? "
                       +validateUserName("com2puter"));
       System.out.println("Is 'helo' a valid user name? "
                       +validateUserName("helo"));
       System.out.println("Is 'COMPUTER24SYSTEM' a valid user name? "
                       +validateUserName("COMPUTER24SYSTEM"));
       System.out.println("Is 'computer.2.novice' a valid user name? "
                       +validateUserName("computer.2.novice"));
       System.out.println("Is 'computer_2-novice' a valid user name? "
                       +validateUserName("computer_2-novice"));
   }
}
