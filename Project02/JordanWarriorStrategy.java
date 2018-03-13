package Project02;

import Project02.People;

public class JordanWarriorStrategy implements EncounterStrategy {

    public int strategy(People me, People otherPerson){
    {
        int lifePoints = 0;
        if(me.getNation() == otherPerson.getNation())
        {
            if(otherPerson.getLifePoints() < me.getLifePoints())
            {
                if(otherPerson.getTribe() == me.getTribe())
                {
                    lifePoints = -(int)((me.getLifePoints() - otherPerson.getLifePoints()) / 2);
                }
            }
        }
        else
        {
            int points;
            points = me.getLifePoints() - otherPerson.getLifePoints();
            if(otherPerson.getType() == PeopleType.wizard) {
              if(points > 0) { //all points of other person
                  lifePoints = otherPerson.getLifePoints();
              }
              else { //otherwise half points bc have less points
                    //divide four because still do twice as much damage as wizard
                  lifePoints = (int) me.getLifePoints() / 4;
              }
            }
            else {
              if(points > 0){ //all the other person's points
                  lifePoints = (int) otherPerson.getLifePoints();
              }
              else { //otherwise attack with less bc have less than them
                  lifePoints = (int) me.getLifePoints() / 4;
              }
            }
        }
        return lifePoints;
    }
  }
}
