package Project02;

import Project02.People;
import Project02.PeopleType;


public class JordanWizard extends Project02.People
{
    SchaperWizard(String nation, String tribe, int lifePoints)
    {
        super(nation, tribe, PeopleType.wizard, lifePoints);
        myDescription = "\tJordan Wizard";
    }

    public int encounterStrategy(Project02.People otherPerson) {
        int lifePoints = 0;
        if (this.getNation() == otherPerson.getNation()) {
          if(otherPerson.getTribe() == this.getTribe()) {
            if (otherPerson.getLifePoints() < this.getLifePoints()) {
                lifePoints = (int) -(this.getLifePoints() - otherPerson.getLifePoints() / 2);
              } //from my tribe, give them things
            else
              { //if i have less life points, don't want to give any
                lifePoints = 0;
              }
            }
          else {
            if (otherPerson.getLifePoints() < this.getLifePoints()) {
              //wizard is nicer, so gives lifePoints to person from another tribe
              lifePoints = -(int) (this.getLifePoints() - otherPerson.getLifePoints() / 4);
            }
            else
            { //if i have less points, don't want to give any
              lifePoints = 0;
            }
          }
        }
        //if from another nation, want to do something else
        else {
            int points;
            int points = this.getLifePoints() - otherPerson.getLifePoints();
            if(points > 0) {
               if(otherPerson.getType() == PeopleType.warrior) {
                  lifePoints =  (int) otherPerson.getLifePoints(); //attack bc have more points
               }                                      // even though warrior
               else {
                  lifePoints = (int) this.getLifePoints(); //attack with all points
               }                                     // bc same type, so do same
            }                                        //damage to each other
            else {
              if (otherPerson.getType() == PeopleType.warrior)
                {
                    lifePoints = -this.getLifePoints() / 2; //run away bc
                }                                    //have less points
                else
                {
                    lifePoints = (int) (this.getLifePoints() / 2);
                }  //attack a wizard with half my points that has more lifepoints than me
            }
        }

        return lifePoints;
    }

}

