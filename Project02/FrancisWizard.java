package Project02;

public class FrancisWizard extends People {
    FrancisWizard(String nation, String tribe, int lifePoints)
    {
        super(nation, tribe, PeopleType.wizard, lifePoints);
        myDescription = "\tFrancis Wizard";
        strategy = new FrancisWizardStrategy();
    }

}
