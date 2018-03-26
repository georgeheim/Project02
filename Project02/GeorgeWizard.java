package Project02;

public class GeorgeWizard extends People {
    GeorgeWizard(String nation, String tribe, int lifePoints, EncounterStrategy strategy)
    {
        super(nation, tribe, PeopleType.wizard, lifePoints, strategy);
        myDescription = "\tGeorge Wizard";
    }

}
