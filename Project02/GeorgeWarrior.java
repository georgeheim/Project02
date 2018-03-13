package Project02;

public class GeorgeWarrior extends People {
    GeorgeWarrior(String nation, String tribe, int lifePoints)
    {
        super(nation, tribe, PeopleType.warrior, lifePoints);
        myDescription = "\tGeorge Warrior";
        strategy = new GeorgeWarriorStrategy();
    }

}
