package Project02;
import Project02.People;
import Project02.World;
import Project02.Nation;

import java.util.*;

public class FrancisDisplay implements Observer {
    private ArrayList<People> worldCreatedPeople;
    private World earth;
    private int numberOfRounds;

    public FrancisDisplay(World earth) {
        this.earth = earth;
        earth.registerObserver(this);
    }

    public void update(ArrayList<People> worldCreatedPeople, int numberOfRounds){
        this.worldCreatedPeople = worldCreatedPeople;
        this.numberOfRounds = numberOfRounds;
        display();
    }

    public void display() {
        int count = 0;
        for(Integer i = 0; i < worldCreatedPeople.size(); i++){
            if(worldCreatedPeople.get(i).getNation().equals("GFNation")) {
                if(worldCreatedPeople.get(i).getLifePoints() > 0) {
                    System.out.println(worldCreatedPeople.get(i));
                    count++;
                }
            }
        }
        System.out.println("GFNation has " + count + " people left" + );
    }


}