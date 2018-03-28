package Project02;
import Project02.People;
import Project02.World;
import Project02.Nation;

import java.util.*;

public class JordanNationDisplay implements Observer {
  private ArrayList<People> worldCreatedPeople;
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
    int count = 0;
    ArrayList strongPeople = new ArrayList<People>();
    ArrayList weakPeople = new ArrayList<People>();
    for(Integer i = 0; i < worldCreatedPeople.size(); i++){
      if(worldCreatedPeople.get(i).getNation().equals("JordanNation")) {
          if(worldCreatedPeople.get(i).getLifePoints() > 0) {
            if(worldCreatedPeople.get(i).getLifePoints() > 25) {
              strongPeople.add(worldCreatedPeople.get(i));
            }
            else {
              weakPeople.add(worldCreatedPeople.get(i));
            }
              count++;
          }
      }
    }
    if(strongPeople.size() > 0){
      System.out.println("Jordan's Tribe Members that are strong:");
      for(Integer i = 0; i < strongPeople.size(); i++){
        System.out.println(strongPeople.get(i));
      }
    }
    if(weakPeople.size() > 0){
      System.out.println("Jordan's Tribe Members that are weak:");
      for(Integer i = 0; i < weakPeople.size(); i++){
        System.out.println(weakPeople.get(i));
      }
    }
    System.out.println("JordanNation has a total of " + count + " people left");
  }


}
