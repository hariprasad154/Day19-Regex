package Com.BridgeLabs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;
@RunWith(Parameterized.class)
public class UserRegistationTest {
    //    Scanner src = new Scanner(System.in);
   UserRegistation obj;//=new UserRegistation();
    //the True Values
    //        Hari -Valid
    //        Prasad -Valid
    //        abc.xyz@bl.co.in -Valid
    //        +91 9876243210 -Valid
    //        l1230*L9078l -Valid
//    @Test
//    public void userRegistationTestFirstname() {
//        System.out.println("The First Name Testing ");
////        System.out.println("enter the firstName");
////        String firstName = src.next();
//        //      obj.userFirstName(firstName);
//
//        boolean result=obj.userFirstName("Hari");
//        Assertions.assertTrue(result);
//
//    }
//
//    @Test
//    public void userRegistationTestLaststname() {
//        System.out.println("The last Name Testing ");
////        System.out.println("enter the lastName");
////        String lastName = src.next();
//        boolean result = obj.userLastName("Prasad");
//        Assertions.assertTrue(result);
//    }

    private String email;
    private boolean expectedvalue;
    @Before
    public void setup()
    {
        obj=new UserRegistation();
    }
    public UserRegistationTest(String email ,boolean expectedvalue ){
        this.expectedvalue=expectedvalue;
        this.email=email;
    }
    @Parameterized.Parameters
    public static Collection testData(){
      return Arrays.asList( new Object[][]{{"abc@yahoo.com",true},{"abc.xyz@bl.co.in",true},{"abc.com",false}});

    }
   @Test
    public void userRegistationTestEmail() {
        System.out.println("The Email Testing ");
//        System.out.println("enter the email");
//        String email = src.next();
//        obj.userEmail(email);
//        boolean result = obj.userEmail("abc.xyz@bl.co.in");
//        Assertions.assertTrue(result);
        Assert.assertEquals(expectedvalue,obj.userEmail(email));
    }

//    @Test
//    public void userRegistationTestPhone() {
//        System.out.println("The Phon number Testing ");
////        System.out.println("enter the phoneNumber");
////        String phoneNum = src.next();
////        obj.phoneNumber(phoneNum);
//        boolean result = obj.phoneNumber("91 9866817259");
//        Assertions.assertTrue(result);
//
//   }
//
//    @Test
//    public void userRegistationTestPassword() {
//        System.out.println("The Password Testing ");
////        System.out.println("enter the Password");
////        String password = src.next();
////        obj.password(password);
//        boolean result = obj.password("l1230*L9078l");
//        Assertions.assertTrue(result);
//
//
//    }
}
