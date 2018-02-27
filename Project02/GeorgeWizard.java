package Project02;

public class GeorgeWizard extends People {
    GeorgeWizard(String nation, String tribe, int lifePoints)
    {
        super(nation, tribe, PeopleType.wizard, lifePoints);
        myDescription = "\tGeorge Wizard";
    }

    public int encounterStrategy(People otherPerson) {
        int lifePoints = 0;
        if (this.getNation() != otherPerson.getNation()) {
            if (this.getType() != otherPerson.getType()) {
                if (this.getLifePoints() > otherPerson.getLifePoints()) {
                    lifePoints = otherPerson.getLifePoints();
                }
                else {
                    lifePoints = this.getLifePoints();
                }
            }
        }
        return lifePoints;
    }

}
