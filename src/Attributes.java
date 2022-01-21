

public class Attributes {  //class to handle attributes  
    int str = 10;          //character created with default 10/0 
    int dex = 10;          //racial bonuses decided later 
    int con = 10;
    int intel = 10;
    int wis = 10;
    int cha = 10;
    int strBonus = 0;
    int dexBonus = 0;
    int conBonus = 0;
    int intelBonus = 0;
    int wisBonus = 0;
    int chaBonus = 0;
    //series of public methods to invoke bonus calculation
    //plan is for methods to call the calc method when
    //modifying an attribute
    public void calcStrBonus(){
        strBonus = (int) Math.floor(str - 10);
    }

    public void calcDexBonus(){
        dexBonus = (int) Math.floor(dex - 10);
    }

    public void calcConBonus(){
        conBonus = (int) Math.floor(con -10);
    }

    public void calcIntelBonus(){
        intelBonus = (int) Math.floor(intel - 10);
    }

    public void calcWisBonus (){
        wisBonus = (int) Math.floor(wis - 10);
    }

    public void calcChaBonus (){
        chaBonus = (int) Math.floor(cha - 10);
    }
}
