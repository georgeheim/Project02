package Project02;
import Project02.People;
import Project02.World;
import Project02.Nation;
import java.util.*;

public class GeorgeDisplay implements Observer {
    private ArrayList<People> worldCreatedPeople;
    private World earth;
    private int numberOfRounds;

    public GeorgeDisplay(World earth) {
        this.earth = earth;
        earth.registerObserver(this);
    }

    public void update(ArrayList<People> worldCreatedPeople, int numberOfRounds){
        this.worldCreatedPeople = worldCreatedPeople;
        this.numberOfRounds = numberOfRounds;
        display();
    }

    public void display() {
        System.out.println("Round " + numberOfRounds);
        System.out.println("The current survivors from GFNation are: ");
        int peopleCount = 0;
        for(Integer i = 0; i < worldCreatedPeople.size(); i++){
            if(worldCreatedPeople.get(i).getNation().equals("GFNation")) {
                if(worldCreatedPeople.get(i).getLifePoints() > 0) {
                    System.out.println(worldCreatedPeople.get(i));
                    peopleCount++;
                }
            }
        }
        System.out.println("GFNation has " + peopleCount + " people left");
    }
}
