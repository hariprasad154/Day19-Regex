package Com.BridgeLabs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserMain {
	static Pattern pattern = Pattern.compile("^[a-z0-9]?[a-z]{2,}$");

    public static void main(String[] args) {
        
        Matcher matcher = pattern.matcher("bcc");
        if (matcher.matches()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

    }
}
