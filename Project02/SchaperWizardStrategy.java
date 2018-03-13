package Project02;

public class SchaperWizardStrategy implements EncounterStrategy {

    public int strategy(People me, People otherPerson){
      int lifePoints = 0;
      if (me.getNation() != otherPerson.getNation())
      {
          if (otherPerson.getLifePoints() < me.getLifePoints())
          {
              if (otherPerson.getType() == PeopleType.warrior) // run away
              {
                  lifePoints = -me.getLifePoints();
              }
              else // attack a wizard
              {
                  lifePoints = (int) (me.getLifePoints()/2);
              }
          }
      }
      else
      {
          if (otherPerson.getLifePoints() < me.getLifePoints()) // heal a friend
          {
              lifePoints = (int) (me.getLifePoints() - otherPerson.getLifePoints() / 2);
          }
          else
          {
              lifePoints = 0;
          }
      }
      return lifePoints;
  }

}
