package Project02;

import java.util.*;

public class JordanNationDisplay implements Observer {
  private ArrayList worldCreatedPeople;
  private World earth;
  private int numberOfRounds;

  public JordanNationDisplay(World earth) {
    this.earth = earth;
    earth.registerObserver(this);
  }

  public void update(ArrayList<People> worldCreatedPeople, int numberOfRounds){
    this.worldCreatedPeople = worldCreatedPeople;
    this.numberOfRounds = numberOfRounds;
    display();
  }

  public void display() {
    for(int i = 0; i < worldCreatedPeople.size(); i++){
      if(worldCreatedPeople.get(i).getNation.equals("JordanNation")) {
          if(worldCreatedPeople.get(i).getLifePoints() > 0) {
              System.out.println(worldCreatedPeople.get(i));
          }
      }
    }
  }


}
