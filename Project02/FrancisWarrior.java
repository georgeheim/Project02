package Project02;

public class FrancisWarrior extends People {
    FrancisWarrior(String nation, String tribe, int lifePoints)
    {
        super(nation, tribe, PeopleType.warrior, lifePoints);
        myDescription = "\tFrancis Warrior";
    }

    public int encounterStrategy(People otherPerson) {
        int lifePoints = 0;
        if (this.getNation() != otherPerson.getNation()) {
            if (this.getType() == otherPerson.getType()) {
                if (this.getLifePoints() > otherPerson.getLifePoints()) {
                    lifePoints = otherPerson.getLifePoints()/2;
                }
                else {
                    lifePoints = this.getLifePoints()/4;
                }
            }
            else {
                if (this.getLifePoints() > otherPerson.getLifePoints()) {
                    lifePoints = -otherPerson.getLifePoints()/2;
                } else {
                    lifePoints = -this.getLifePoints()/2;
                }
            }
        }
        return lifePoints;
    }
}