package Project02;

import Project02.People;

public class GeorgeWarriorStrategy implements EncounterStrategy {

    public int strategy(People me, People otherPerson){
      int lifePoints = 0;
      int points = me.getLifePoints() - otherPerson.getLifePoints();
      if (me.getNation() != otherPerson.getNation()) { // If from another nation
          if (me.getType() == otherPerson.getType()) { // If warrior
              if (points > 0) { // If I have more health
                  lifePoints = otherPerson.getLifePoints()/2;
              }
              else { // If they have more health
                  lifePoints = me.getLifePoints()/2;
              }
          }
          else { // If wizard
              if (points > 0) { // If I have more health
                  lifePoints = otherPerson.getLifePoints();
              }
              else { // If they have more health
                  lifePoints = me.getLifePoints();
              }
          }
      }
      return lifePoints;
    }
}
