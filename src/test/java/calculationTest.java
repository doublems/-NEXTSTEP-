import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by jerry on 2016-12-04.
 */
public class calculationTest {

    //private  StringCalculator stringCalculator;
    private  StringCalculator stringCalculator = new StringCalculator();

    /*@Before
    public void setup(){
        stringCalculator = new StringCalculator();
        System.out.println("Before");
    }*/

    @Test
    public void stringCaluaterSumTestByComma(){
        Assert.assertEquals(10,stringCalculator.add("7,3"));
    }

    @Test
    public void stringCaluaterSumTestByColon(){
        Assert.assertEquals(10,stringCalculator.add("7:3"));
    }

    @Test
    public void stringCaluaterSumNullTest(){
        Assert.assertEquals(0,stringCalculator.add(""));
    }
    @Test
    public void stringCaluaterSumSingleTest(){
        Assert.assertEquals(10,stringCalculator.add("10"));
    }
    @Test
    public void stringCaluaterSumTestbyCustomTag(){
        Assert.assertEquals(73,stringCalculator.add("//%\\n3%67%3"));
    }

    @Test(expected=RuntimeException.class)
    public void stringCaluaterRuntimeException(){
        stringCalculator.add("10,-3");
    }

    @After
    public void end(){
        System.out.println("테스트 끝");
    }
}
