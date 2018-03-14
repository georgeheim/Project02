package Project02;

import Project02.People;

public class FrancisWarriorStrategy implements EncounterStrategy {

    public int strategy(People me, People otherPerson){
    int lifePoints = 0;
    if (me.getNation() != otherPerson.getNation()) {
        if (me.getType() == otherPerson.getType()) {
            if (me.getLifePoints() > otherPerson.getLifePoints()) {
                lifePoints = otherPerson.getLifePoints();
            }
            else {
                lifePoints = me.getLifePoints()/2;
            }
        }
        else {
            if (me.getLifePoints() > otherPerson.getLifePoints()) {
                lifePoints = otherPerson.getLifePoints()/2;
            } else {
                lifePoints = -me.getLifePoints()/2;
            }
        }
    }
    return lifePoints;
  }
}
