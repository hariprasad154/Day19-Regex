package Com.BridgeLabs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistation {
	public void UserFirstName(String Firstname) {
		Pattern FirstNamepattern = Pattern.compile("^[A-Z]+[a-z]{2,}$");
		Matcher matcher = FirstNamepattern.matcher(Firstname);
        if (matcher.matches()) {
            System.out.println(Firstname +" -Valid");
        } else {
            System.out.println(Firstname +" is Invalid");
        }
	}


}
