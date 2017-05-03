import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by leenos on 03.05.2017.
 */
public class BerlinClockTest {

    private BerlinClock berlinClock;

    @Before
    public void init(){
        berlinClock=new BerlinClock();
    }


    @Test
    public void testYellowLampBlinking(){
        assertEquals("Y",berlinClock.getSecond(2));
        assertEquals("O",berlinClock.getSecond(19));
        assertEquals("Y",berlinClock.getSecond(0));
    }
    @Test
    public void testHourRowShouldHave4Lamps(){
        assertEquals(4,berlinClock.getHours(12).length());


    }
    @Test
    public void testRedLampEvery5hours(){
        assertEquals("YOOO", berlinClock.getHours(5));
        assertEquals("YYOO", berlinClock.getHours(10));
        assertEquals("YYYO", berlinClock.getHours(15));
        assertEquals("YYYY", berlinClock.getHours(20));
        assertEquals("YYYY", berlinClock.getHours(23));


    }

}
