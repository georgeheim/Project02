package Project02;

public class GeorgeTribe extends Tribe {

    public GeorgeTribe(String nation, String tribe, int lifePoints)
    {
        nationName = nation;
        tribeName = tribe;
        tribeLifePoints = lifePoints;
        for(int i = 0; i < 10; i++)
            if(i % 2 == 0)
                members.add(new GeorgeWarrior(nationName, tribeName, tribeLifePoints / 10, new GeorgeWarriorStrategy()));
            else
                members.add(new GeorgeWizard(nationName, tribeName, tribeLifePoints / 10, new GeorgeWizardStrategy()));
        for(int i = 0; i < members.size(); i++)
            livingMembers.addAll(members);
    }
}
