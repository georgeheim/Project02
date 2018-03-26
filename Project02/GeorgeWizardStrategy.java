package Project02;
import Project02.People;

public class GeorgeWizardStrategy implements EncounterStrategy {

    public int strategy(People me, People otherPerson) {
      int lifePoints = 0;
      int difference = me.getLifePoints() - otherPerson.getLifePoints();
      if (me.getNation() != otherPerson.getNation()) { // Is from enemy nation
          if (me.getType() != otherPerson.getType()) { // Is a warrior
              if (difference > 0) { // I have more health
                  lifePoints = otherPerson.getLifePoints();
              }
              else { // They have more health
                  lifePoints = me.getLifePoints();
              }
          }
          else { // Is a wizard
              if (difference > 0) { // I have more health
                  lifePoints = otherPerson.getLifePoints();
              }
          }
      }
      else { // Is from my nation
          if (difference > 0) { // I have more health
              if (me.getTribe() == otherPerson.getTribe()) { // Is from my tribe
                  lifePoints = -(difference)/2; // Balance life totals
              }
          }
      }
      return lifePoints;
  }
}
