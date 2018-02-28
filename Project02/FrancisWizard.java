package Project02;

public class FrancisWizard extends People {
    FrancisWizard(String nation, String tribe, int lifePoints)
    {
        super(nation, tribe, PeopleType.wizard, lifePoints);
        myDescription = "\tFrancis Wizard";
    }

    public int encounterStrategy(People otherPerson) {
        int lifePoints = 0;
        if (this.getNation() != otherPerson.getNation()) {
            if (this.getType() != otherPerson.getType()) {
                if (this.getLifePoints() < otherPerson.getLifePoints())
			             {
			                  lifePoints = -this.getLifePoints()/4;
                   }
                else {
                    lifePoints = (int) (this.getLifePoints()/2);
                }
            }
            else {
                if(this.getLifePoints() < otherPerson.getLifePoints()) {
                      lifePoints = -this.getLifePoints()/2;
                }
                else {
                    lifePoints = this.getLifePoints();
                }
            }
        }
        else
       	{
	         if (otherPerson.getLifePoints() < this.getLifePoints())
	          {
	             lifePoints = (int) -(this.getLifePoints() - otherPerson.getLifePoints() / 4);
            }
	         else
	          {
	     	       lifePoints = 0;
            }
        }
        return lifePoints;

 }
}
