package Project02;

public class GeorgeWizard extends People {
    GeorgeWizard(String nation, String tribe, int lifePoints)
    {
        super(nation, tribe, PeopleType.wizard, lifePoints);
        myDescription = "\tGeorge Wizard";
        strategy = new GeorgeWizardStrategy();
    }

}
