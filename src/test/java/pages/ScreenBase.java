package pages;

import support.TestBase;

/**
 * Created by ochesnokova on 2/16/16.
 */
public class ScreenBase extends TestBase {


    public WelcomeScreen welcomeScreen;

    public MainMenuScreen mainMenuScreen;

    public BigPictureScreen bigPictureScreen;

    public TrackBar trackBar;

    public FatigueScreen fatigueScreen;

    public JointPainScreen jointPainScreen;

    public JointPainWelcomeScreen jointPainWelcomeScreen;


    public ScreenBase(){

        System.out.println("ScreenBase constructor executing...");
    }

    public void initialize(){

        mainMenuScreen = new MainMenuScreen();

        welcomeScreen = new WelcomeScreen();

        bigPictureScreen = new BigPictureScreen();

        trackBar = new TrackBar();

        fatigueScreen = new FatigueScreen();

        jointPainScreen = new JointPainScreen();

        jointPainWelcomeScreen = new JointPainWelcomeScreen();




    }


}
