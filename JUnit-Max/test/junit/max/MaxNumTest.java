
package junit.max;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @Jonni
 */
public class MaxNumTest {

    public MaxNumTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of max method, of class MaxNum.
     */
    @Test
    public void testMax() {
        System.out.println("Pruebas del numero maximo");
        assertEquals(3, MaxNum.max(new int [] {3}));
        assertEquals(5, MaxNum.max(new int [] {3, 4, 5}));
        assertEquals(5, MaxNum.max(new int [] {4, 3, 5}));
        assertEquals(5, MaxNum.max(new int [] {5, 4, 3}));
        assertEquals(-3, MaxNum.max(new int [] {-5, -4, -3}));
        assertEquals(0, MaxNum.max(new int [] {}));
        assertEquals(0, MaxNum.max(null));
    }
    
    @Test(timeout=1000)
    public void maxTiempo() {
        System.out.println("Pruebas de tiempo");
        assertEquals(66666666, MaxNum.max(new int [] {3,4,5,6,7,8,9,11,12,13,14,15,66666666,3333333}));
    }

}
