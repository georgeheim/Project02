package Project02;

public class GFNation extends Nation {
    public GFNation(String name, int lifePoints) {
        nationName = name;
        nationLifePoints = lifePoints;
        nationCount++;
        this.tribes.add(new GeorgeTribe(name, "GeorgeTribe", lifePoints / 2));
        this.tribes.add(new FrancisTribe(name, "FrancisTribe", lifePoints / 2));
        population.addAll(getNationPopulation());
        livingPopulation.addAll(population);
    }
}
