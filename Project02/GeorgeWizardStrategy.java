package Project02;

import Project02.People;

public class GeorgeWizardStrategy implements EncounterStrategy {

    public int strategy(People me, People otherPerson){
      int lifePoints = 0;
      int points = me.getLifePoints() - otherPerson.getLifePoints();
      if (me.getNation() != otherPerson.getNation()) { // If from enemy nation
          if (me.getType() != otherPerson.getType()) { // If opponent is warrior
              if (points > 0) { // If I have more health
                  lifePoints = otherPerson.getLifePoints();
              }
              else {
                  lifePoints = me.getLifePoints()/2;
              }
          }
          else { // If opponent is wizard
              if (points > 0) { // If I have more health
                  lifePoints = otherPerson.getLifePoints();
              }
          }
      }
      return lifePoints;
  }

}
