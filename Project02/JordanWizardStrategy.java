package Project02;

import Project02.People;

public class JordanWizardStrategy implements EncounterStrategy {

    public int strategy(People me, People otherPerson){
    int lifePoints = 0;
    if (me.getNation() == otherPerson.getNation()) {
      if(otherPerson.getTribe() == me.getTribe()) {
        if (otherPerson.getLifePoints() < me.getLifePoints()) {
            lifePoints = (int) -(me.getLifePoints() - otherPerson.getLifePoints() / 2);
          } //from my tribe, give them things
        }
      else {
        if (otherPerson.getLifePoints() < me.getLifePoints()) {
          //wizard is nicer, so gives lifePoints to person from another tribe
          lifePoints = -(int) (me.getLifePoints() - otherPerson.getLifePoints() / 4);
        }
      }
    }
    //if from another nation, want to do something else
    else {
        int points;
        points = me.getLifePoints() - otherPerson.getLifePoints();
        if(points > 0) {
           if(otherPerson.getType() == PeopleType.warrior) {
              lifePoints =  (int) otherPerson.getLifePoints(); //attack bc have more points
           }                                      // even though warrior
           else {
              lifePoints = (int) me.getLifePoints(); //attack with all points
           }                                     // bc same type, so do same
        }                                        //damage to each other
        else {
          if (otherPerson.getType() == PeopleType.warrior)
            {
                lifePoints = -me.getLifePoints() / 2; //run away bc
            }                                    //have less points
            else
            {
                lifePoints = (int) (me.getLifePoints() / 2);
            }  //attack a wizard with half my points that has more lifepoints than me
        }
    }

      return lifePoints;
  }
}
