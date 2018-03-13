package Project02;

public class FrancisWarrior extends People {
    FrancisWarrior(String nation, String tribe, int lifePoints)
    {
        super(nation, tribe, PeopleType.warrior, lifePoints);
        myDescription = "\tFrancis Warrior";
        strategy = new FrancisWarriorStrategy();
    }

}
