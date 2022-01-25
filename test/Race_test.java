import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Race_test {
    @Test
    void testElfEnum() {        
        assertEquals(0, Race.ELF.getStr());
        assertEquals(2, Race.ELF.getDex());
        assertEquals(-2,Race.ELF.getCon());
        assertEquals(0, Race.ELF.getIntel());
        assertEquals(0, Race.ELF.getWis());
        assertEquals(0, Race.ELF.getCha());
    }    
}
