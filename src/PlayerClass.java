public enum PlayerClass {
    
    BARBARIAN(12, "Light", "Berserker Rage", "Wildling"),
    FIGHTER(10, "Heavy & Shields", "Adrenaline", "Second Wind"),
    PALADIN(10, "Heavy & Shields", "Smite", "Lay on Hands"),
    CLERIC(8, "Heavy & Shields", "Turn Undead", "Invoke Divinity"),
    DRUID(8, "Medium & Shields", "Animal Companion", "Formshift"),
    RANGER(8, "Medium", "Tactical Mastery", "Heart Piercer"),
    ROGUE(6, "Light", "Backstab", "Evasion"),    
    WIZARD(4, "None", "Presence of Mind", "Mirror Image"); 

    final private int hitPoints;
    final private String armorProf;
    final private String abilityOne;
    final private String abilityTwo;

    PlayerClass(int hitPoints, String armorProf, String abilityOne, String abilityTwo) {
        this.hitPoints = hitPoints;
        this.armorProf = armorProf;
        this.abilityOne = abilityOne;
        this.abilityTwo = abilityTwo;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public String getArmorProf() {
        return armorProf;
    }

    public String getAbilityOne() {
        return abilityOne;
    }

    public String getAbilityTwo() {
        return abilityTwo;
    }

}
