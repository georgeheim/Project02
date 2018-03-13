package Project02;

import Project02.People;
import Project02.PeopleType;


public class SchaperWizard extends Project02.People
{
    SchaperWizard(String nation, String tribe, int lifePoints)
    {
        super(nation, tribe, PeopleType.wizard, lifePoints);
        myDescription = "\tSchaper Wizard";
        strategy = new SchaperWizardStrategy();
    }

}
