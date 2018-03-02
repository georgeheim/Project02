package Project02;

public class GeorgeWizard extends People {
    GeorgeWizard(String nation, String tribe, int lifePoints)
    {
        super(nation, tribe, PeopleType.wizard, lifePoints);
        myDescription = "\tGeorge Wizard";
    }

    public int encounterStrategy(People otherPerson) {
        int lifePoints = 0;
        int difference = this.getLifePoints - otherPerson.getLifePoints;
        if (this.getNation() != otherPerson.getNation()) { // If from enemy nation
            if (this.getType() != otherPerson.getType()) { // If opponent is warrior
                if (points > 0) { // If I have more health
                    lifePoints = otherPerson.getLifePoints();
                }
                else {
                    lifePoints = this.getLifePoints()/2;
                }
            }
            else { // If opponent is wizard
                if (points > 0) { // If I have more health
                    lifePoints = otherPerson.getLifePoints
                }
            }
        }
        return lifePoints;
    }

}
