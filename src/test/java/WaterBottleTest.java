import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;

    @Before
    public void before() {
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void hasDrink(){
        assertEquals(90, waterBottle.Drink());
    }

    @Test
    public void isEmpty(){
        waterBottle.Empty();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void isFill(){
        waterBottle.Empty();
        assertEquals(100, waterBottle.Fill());
    }
}
