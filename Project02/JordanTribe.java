package Project02;

import Project02.Tribe;

public class JordanTribe extends Project02.Tribe {

    public JordanTribe(String nation, String tribe, int lifePoints)
    {
        nationName = nation;
        tribeName = tribe;
        tribeLifePoints = lifePoints;
        for(int i = 0; i < 40; i++)
            if(i % 2 == 0)
                members.add(new JordanWarrior(nationName, tribeName, tribeLifePoints / 40, new JordanWarriorStrategy()));
            else
                members.add(new JordanWizard(nationName, tribeName, tribeLifePoints / 40, new JordanWizardStrategy()));
        for(int i = 0; i < members.size(); i++)
            livingMembers.addAll(members);
    }
}
