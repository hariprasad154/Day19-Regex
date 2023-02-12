package Com.BridgeLabs;


import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserMain {
	public static void main(String[] args) {



//        Predicate<Integer> ref1 = x-> {
//
//            return x;
//
//        };

//        UserRegistation obj=(a)->{
//            Pattern FirstNamepattern = Pattern.compile("^[A-Z]+[a-z]{2,}$");
//        Matcher matcher = FirstNamepattern.matcher(a);
//        Boolean result=matcher.matches();
//
// };
        UserRegistation obj =new UserRegistation();
        obj.User();
    	
    }
}
