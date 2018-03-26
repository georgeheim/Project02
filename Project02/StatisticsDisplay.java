package Project02;

import java.util.*;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxworldLifePoints = 4000;
    private float maxnumberofRounds = 40;
    private int numReadings;

    public StatisticsDisplay(WeatherData weatherData) {
	this.weatherData = weatherData;
	weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
	tempSum += temp;
	numReadings++;

	if (temp > maxTemp) {
	    maxTemp = temp;
	}
 
	if (temp < minTemp) {
	    minTemp = temp;
	}

	display();
    }

    public void display() {
	System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
			   + "/" + maxTemp + "/" + minTemp);
    }
}