package Project02;

import Project02.People;
import Project02.PeopleType;


public class JordanWarrior extends People
{
    JordanWarrior(String nation, String tribe, int lifePoints)
    {
        super(nation, tribe, PeopleType.warrior, lifePoints);
        myDescription = "\tJordan Warrior";
    }


    public int encounterStrategy(People otherPerson)
    {
        int lifePoints = 0;
        if(this.getNation() == otherPerson.getNation())
        {
            if(otherPerson.getLifePoints() < this.getLifePoints())
            {
                if(otherPerson.getTribe() == this.getTribe())
                {
                    lifePoints = -(int)((this.getLifePoints() - otherPerson.getLifePoints()) / 4);
                }
            }
        }
        else
        {
            int points;
            points = this.getLifePoints() - otherPerson.getLifePoints();
            if(otherPerson.getType() == PeopleType.wizard) {
              if(points > 0) { //all points of other person
                  lifePoints = otherPerson.getLifePoints();
              }
              else { //otherwise half points bc have less points
                    //divide four because still do twice as much damage as wizard
                  lifePoints = (int) this.getLifePoints() / 4;
              }
            }
            else {
              if(points > 0){ //all the other person's points
                  lifePoints = (int) otherPerson.getLifePoints();
              }
              else { //otherwise attack with less bc have less than them
                  lifePoints = (int) this.getLifePoints() / 4;
              }
            }
        }
        return lifePoints;
    }

}
