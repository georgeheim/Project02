package Project02;

public class GeorgeWarrior extends People {
    GeorgeWarrior(String nation, String tribe, int lifePoints, EncounterStrategy strategy)
    {
        super(nation, tribe, PeopleType.warrior, lifePoints, strategy);
        myDescription = "\tGeorge Warrior";
    }

}
