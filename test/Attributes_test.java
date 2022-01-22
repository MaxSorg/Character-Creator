import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Attributes_test {
    private Attributes attTest = new Attributes();
    @Test
    void checkBonus() {
        assertEquals(0, attTest.calcStrBonus());
        attTest.str = 12;
        assertEquals(1, attTest.calcStrBonus());
        attTest.cha = 17;
        assertEquals(3, attTest.calcChaBonus());
    }
}
