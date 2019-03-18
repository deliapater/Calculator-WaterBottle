import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before() {
       printer = new Printer(50, 20);

    }

    @Test
    public void hasPaperLeft() {
        assertEquals(50, printer.getPaperLeft());
    }

    @Test
    public void hasTonerLeft(){
        assertEquals(20, printer.getToner());
    }

    @Test
    public void wontPrintIfNotEnoughPages() {
        printer.print(100, 5);
        assertEquals(50, printer.getPaperLeft());
    }

    @Test
    public void canRefill() {
        printer.refill(100);
        assertEquals(150, printer.getPaperLeft());
    }

    @Test
    public void hasToner() {
        printer.print(2, 5);
        assertEquals(10, printer.getToner());
    }
}
