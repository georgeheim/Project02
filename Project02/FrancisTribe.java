package Project02;

public class FrancisTribe extends Tribe {

    public FrancisTribe(String nation, String tribe, int lifePoints)
    {
        nationName = nation;
        tribeName = tribe;
        tribeLifePoints = lifePoints;
        for(int i = 0; i < 20; i++)
            if(i % 2 == 0)
                members.add(new FrancisWarrior(nationName, tribeName, tribeLifePoints / 20));
            else
                members.add(new FrancisWizard(nationName, tribeName, tribeLifePoints / 20));
        for(int i = 0; i < members.size(); i++)
            livingMembers.addAll(members);
    }
}