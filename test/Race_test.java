
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Race_test {   
    @ParameterizedTest
    @CsvSource ({
        "HUMAN, 0, 0, 0, 0, 0, 0",
        "HALF_ELF, 0, 0, 0, 0, 0, 0",
        "ELF, 0, 2, -2, 0, 0, 0",
        "DWARF, 0, 0, 2, 0, 0, -2",
        "HALFLING, -2, 2, 0, 0, 0, 0",
    })
    void testRaceEnum(Race race, int str, int dex, int con, int intel, int wis, int cha) {
        assertEquals(str, race.getStr());
        assertEquals(dex, race.getDex());
        assertEquals(con, race.getCon());
        assertEquals(intel, race.getIntel());
        assertEquals(wis, race.getWis());
        assertEquals(cha, race.getCha());
        race.printRaceFull();
    }
    @Test
    void testPrintBonus() {
        Race.printBonuses();
    }
}
