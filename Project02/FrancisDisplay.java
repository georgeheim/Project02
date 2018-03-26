package Project02;

import java.util.*;

public class FrancisDisplay implements Observer, DisplayElement {
    private float temp;
    private WeatherData weatherData;

    public FrancisDisplay(WeatherData weatherData) {
	this.weatherData = weatherData;
	weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
	this.temp = temp;
	display();
    }

    public void display() {
	if(temp < 35){
            System.out.println("There may be a chance of snow!");
        }
        else if(temp >= 35 < 50){
            System.out.println("It's getting warmer out.");
        }
        else {
            System.out.println("No need for longsleeves!");
        }
    }

}