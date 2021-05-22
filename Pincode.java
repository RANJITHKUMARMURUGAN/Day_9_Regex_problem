import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pincode {

	 // Function to validate 
    public static boolean Validate_function(String pinCode)
    {
        String regex = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$"; 
        
        Pattern p = Pattern.compile(regex); 
        if (pinCode == null) {
            return false;
        }
  
        Matcher m = p.matcher(pinCode);
        return m.matches();
    }
  
    public static void main(String args[]) {
        // Start Test Case 1:
        String num1 = "400088";
        System.out.println( num1 + ": " + Validate_function(num1));
  
        // Start Test Case 2:
        String num2 = "A400088";
        System.out.println( num2 + ": " + Validate_function(num2));
  
        // Start Test Case 3:
        String num3 = "400088B";
        System.out.println( num3 + ": " + Validate_function(num3));
  
        // Start Test Case 4:
        String num4 = "400 088";
        System.out.println(num4 + ": " + Validate_function(num4));
        

       
    }
}
