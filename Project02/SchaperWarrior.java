package Project02;

import Project02.People;
import Project02.PeopleType;


public class SchaperWarrior extends People
{
    SchaperWarrior(String nation, String tribe, int lifePoints, EncounterStrategy strategy)
    {
        super(nation, tribe, PeopleType.warrior, lifePoints, strategy);
        myDescription = "\tSchaper Warrior";
    }

}
