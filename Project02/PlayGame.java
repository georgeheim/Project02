package Project02;
import Project02.World;


public class PlayGame
{
    //private Random generator;

    public PlayGame()
    {
        World earth = new World();
        JordanNationDisplay jordanNationDisplay = new JordanNationDisplay(earth);
        earth.war();
    }


}
