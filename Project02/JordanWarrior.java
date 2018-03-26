package Project02;

import Project02.People;
import Project02.PeopleType;


public class JordanWarrior extends People
{
    JordanWarrior(String nation, String tribe, int lifePoints, EncounterStrategy strategy)
    {
        super(nation, tribe, PeopleType.warrior, lifePoints, strategy);
        myDescription = "\tJordan Warrior";
    }

}
