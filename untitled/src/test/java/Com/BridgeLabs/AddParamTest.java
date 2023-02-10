package Com.BridgeLabs;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)

public class AddParamTest {
    private int expected;
    private int first;
    private int second;
    demo cal =new demo();
    @Before
    public void setup(){
        cal=new demo();

    }
    public AddParamTest(int expected,int first,int second){
        this.expected=expected;
        this.first=first;
        this.second=second;

    }


    @Parameterized.Parameters
    public static Collection<Object[]> testData(){
        Object[][] data=new Object[][]{{6,2,4},{7,4,3},{10,5,5}};
        return Arrays.asList(data);


}
@Test
public  void testAdd(){
    Assert.assertEquals(expected,cal.add(first,second));
}

}
