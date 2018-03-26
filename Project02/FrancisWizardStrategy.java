package Project02;

import Project02.People;

public class FrancisWizardStrategy implements EncounterStrategy {

    public int strategy(People me, People otherPerson){
      int lifePoints = 0;
      if (me.getNation() != otherPerson.getNation()) {
          if (me.getType() != otherPerson.getType()) {
              if (me.getLifePoints() < otherPerson.getLifePoints())
                 {
                      lifePoints = -me.getLifePoints()/10;
                 }
              else {
                  lifePoints = (int) (me.getLifePoints()/2);
              }
          }
          else {
              if(me.getLifePoints() < otherPerson.getLifePoints()) {
                    lifePoints = -me.getLifePoints()/4;
              }
              else {
                  lifePoints = me.getLifePoints();
              }
          }
      }
      else
      {
         if (otherPerson.getLifePoints() < me.getLifePoints())
          {
             lifePoints = (int) -((me.getLifePoints() - otherPerson.getLifePoints()) / 4);
          }
         else
          {
             lifePoints = 0;
          }
      }
      return lifePoints;

   }
}
