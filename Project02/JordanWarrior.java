package Project02;

import Project02.People;
import Project02.PeopleType;


public class JordanWarrior extends People
{
    JordanWarrior(String nation, String tribe, int lifePoints)
    {
        super(nation, tribe, PeopleType.warrior, lifePoints);
        myDescription = "\tJordan Warrior";
        strategy = new JordanWarriorStrategy();
        }
    }
}
