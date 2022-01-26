
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Race_test {   
    @ParameterizedTest
    @CsvSource ({
        "HUMAN, 0, 0, 0, 0, 0, 0",
        "HALF_ELF, 0, 2, 0, 0, 0, 0",
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
    }

    void printRaceEnum() {
        for (Race race : Race.values()) {
            String[] attributeName = {"Strength", "Dexterity", "Constitution", "Intelligence", 
            "Wisdom", "Charisma"};
            int[] attributeValue = {race.getStr(), race.getDex(), race.getCon(), race.getIntel(),
            race.getWis(), race.getCha()};
            System.out.println(race + " Attribute Bonuses and Penalties");
            for (int i = 0; i < attributeName.length; i++){
                if (attributeValue[i] != 0) {
                    System.out.println(attributeName[i] + ": " + attributeValue[i]);
                }
            }
            System.out.println("");
        }
    }    
}
