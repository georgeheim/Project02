package Project02;

public class GeorgeWarrior extends People {
    GeorgeWarrior(String nation, String tribe, int lifePoints)
    {
        super(nation, tribe, PeopleType.warrior, lifePoints);
        myDescription = "\tGeorge Warrior";
    }

    public int encounterStrategy(People otherPerson) {
        int lifePoints = 0;
        int points = this.getLifePoints - otherPerson.getLifePoints;
        if (this.getNation() != otherPerson.getNation()) { // If from another nation
            if (this.getType() == otherPerson.getType()) { // If warrior
                if (points > 0) { // If I have more health
                    lifePoints = otherPerson.getLifePoints()/2;
                }
                else { // If they have more health
                    lifePoints = this.getLifePoints()/2;
                }
            }
            else { // If wizard
                if (points > 0) { // If I have more health
                    lifePoints = otherPerson.getLifePoints();
                }
                else { // If they have more health
                    lifePoints = this.getLifePoints();
                }
            }
        }
        return lifePoints;
    }
}
