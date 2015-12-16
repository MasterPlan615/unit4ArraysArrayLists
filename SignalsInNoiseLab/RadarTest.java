

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class RadarTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RadarTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class RadarTest
     */
    public RadarTest()
    {
        // initialise instance variables
        x = 0;
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testIt()
    {
        Radar dish = new Radar(8,8);
        dish.setMonsterLocation(4,5);
        for(int i = 40; i > 0; i--)
        {
            dish.scan();
        }
        assertEquals(dish.getAccumulatedDetection(4,5),40);
    }
    
    @Test
    public void testIt_2()
    {
        Radar dish = new Radar(100,100);
        dish.setMonsterLocation(20,76);
        for(int i = 1000; i > 0; i--)
        {
            dish.scan();
        }
        assertEquals(dish.getAccumulatedDetection(20,76),1000);
    }
}
