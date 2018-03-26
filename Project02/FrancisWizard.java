package Project02;

public class FrancisWizard extends People {
    FrancisWizard(String nation, String tribe, int lifePoints, EncounterStrategy strategy)
    {
        super(nation, tribe, PeopleType.wizard, lifePoints, strategy);
        myDescription = "\tFrancis Wizard";
    }

}
