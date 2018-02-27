package Project02;
import Project02.Nation;
import java.util.*;

public class JordanNation extends Nation {
    public JordanNation(String name, int lifePoints) {
        nationName = name;
        nationLifePoints = lifePoints;
        nationCount++;
        this.tribes.add(new JordanTribe(name, "JordanTribe", lifePoints));
        population.addAll(getNationPopulation());
        livingPopulation.addAll(population);
    }
}
