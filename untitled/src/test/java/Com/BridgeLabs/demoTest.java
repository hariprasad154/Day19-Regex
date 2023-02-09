package Com.BridgeLabs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class demoTest {
    static demo calc;
    @Test
    public void givenNumMUltiplyWhenCallMultiplyMethod(){
        System.out.println("Test");
        int mul=calc.multiply(9,10);
        Assertions.assertEquals(90,mul);

    }

//    @Test
//    public void givenNumAddedWhenCallSumMethod(){
//        System.out.println("Test");
//        calc = new demo();
//        boolean sum=calc.sum();
//        Assertions.assertTrue(sum);
//
//    }
}
