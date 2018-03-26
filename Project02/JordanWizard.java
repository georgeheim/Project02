package Project02;

import Project02.People;
import Project02.PeopleType;


public class JordanWizard extends Project02.People
{
    JordanWizard(String nation, String tribe, int lifePoints, EncounterStrategy strategy)
    {
        super(nation, tribe, PeopleType.wizard, lifePoints, strategy);
        myDescription = "\tJordan Wizard";
    }
}
