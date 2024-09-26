import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumTest {

    NumPrinter printer = new NumWordPrinter();


    @Test
    public void testDivisibleBy2() {
        assertEquals("Even", printer.printWord(4, false));
    }

    @Test
    public void testDivisibleBy11() {
        assertEquals("EvenPrimeEleven", printer.printWord(22, false));
    }


    @Test
    public void testDivisibleBy13() {
        assertEquals("EVEN", printer.printWord(30, true));
    }

    @Test
    public void testDivisibleBy2And11() {
        assertEquals("EvenPrimeEleven", printer.printWord(22, false));
    }

    @Test
    public void testDivisibleBy2And11And13() {
        assertEquals("EvenPrimeLucky", printer.printWord(286, false));
    }


    @Test
    public void testNotDivisibleByAny() {
        assertEquals("OddOneOut", printer.printWord(7, false));
    }


    @Test
    public void testUppercaseResult() {
        assertEquals("EVEN", printer.printWord(4, true));
    }

}
