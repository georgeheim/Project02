package Project02;

public class FrancisWarrior extends People {
    FrancisWarrior(String nation, String tribe, int lifePoints, EncounterStrategy strategy)
    {
        super(nation, tribe, PeopleType.warrior, lifePoints, strategy);
        myDescription = "\tFrancis Warrior";
    }

}
