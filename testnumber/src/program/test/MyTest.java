import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import program.calc.Calculate;

import static org.junit.Assert.assertEquals;

/**
 * Created by Alexey on 27.01.2016.
 */
public class MyTest {

    @BeforeClass
    public static void testSetup() {
    }

    @AfterClass
    public static void testCleanup() {
        // Teardown for data used by the unit tests
    }

    @Test
    public void testEqualsTrue() {
        Calculate tester = new Calculate();
        assertEquals(true, tester.calc("4"));
    }

    @Test
    public void testEqualsFalse() {
        Calculate tester = new Calculate();
        assertEquals(false, tester.calc("5"));
    }

    @Test(expected = Exception.class)
    public void testException() {
        Calculate tester = new Calculate();
        assertEquals(true, tester.calc("6.33"));
    }
}