package pages;

import support.TestBase;

/**
 * Created by ochesnokova on 2/16/16.
 */
public class ScreenBase extends TestBase {


    public MainScreen mainScreen;

    public MainMenuScreen mainMenuScreen;

    public BigPictureScreen bigPictureScreen;

    public TrackBar trackBar;

    //public VeryGood veryGood;



    public ScreenBase(){

        System.out.println("ScreenBase constructor executing...");
    }

    public void initialize(){

        mainMenuScreen = new MainMenuScreen();

        mainScreen = new MainScreen();

        bigPictureScreen = new BigPictureScreen();

        trackBar = new TrackBar();

        //veryGood = new VeryGood();


    }


}
