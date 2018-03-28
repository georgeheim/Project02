package Project02;
import Project02.World;


public class PlayGame
{
    //private Random generator;

    public PlayGame()
    {
        World earth = new World();
        JordanNationDisplay jordanNationDisplay = new JordanNationDisplay(earth);
        FrancisDisplay francisDisplay = new FrancisDisplay(earth);
        GeorgeDisplay georgeDisplay = new GeorgeDisplay(earth);
        earth.war();
    }


}
