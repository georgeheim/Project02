package Project02;

public class GeorgeWarrior extends People {
    GeorgeWarrior(String nation, String tribe, int lifePoints)
    {
        super(nation, tribe, PeopleType.warrior, lifePoints);
        myDescription = "\tGeorge Warrior";
    }

    public int encounterStrategy(People otherPerson) {
        int lifePoints = 0;
        if (this.getNation() != otherPerson.getNation()) {
            if (this.getType() == otherPerson.getType()) {
                if (this.getLifePoints() > otherPerson.getLifePoints()) {
                    lifePoints = otherPerson.getLifePoints()/2;
                }
                else {
                    lifePoints = this.getLifePoints()/2;
                }
            }
            else {
                if (this.getLifePoints() > otherPerson.getLifePoints()) {
                    lifePoints = otherPerson.getLifePoints();
                } else {
                    lifePoints = this.getLifePoints();
                }
            }
        }
        return lifePoints;
    }
}
