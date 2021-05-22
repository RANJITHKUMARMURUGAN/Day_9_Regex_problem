
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class Password_register {
 
private static Pattern pswNamePtrn = Pattern.compile("^((?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,20})$");
    public static boolean validatePassword(String userName){
        Matcher mtch = pswNamePtrn.matcher(userName);
        if(mtch.matches()){
            return true;
        }
        return false;
    }
     
    public static void main(String a[]){
        System.out.println("Is 'Comput@portal20' a valid password? " +validatePassword("Comput@portal20"));
        System.out.println("Is 'Computersystem' a valid password? "+validatePassword("computersystem"));
        System.out.println("Is 'Comput@ portal20' a valid password? "+validatePassword("Comput@ portal20"));
        System.out.println("Is '1234' a valid password? "+validatePassword("1234"));
    }
}
