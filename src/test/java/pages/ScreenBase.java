package pages;

import support.TestBase;

import javax.annotation.Resources;

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

    public JointWelcomeScreen jointPainWelcomeScreen;

    public MorningStiffnessScreen morningStiffnessScreen;
    public MeScreen meScreen;
    public ResourcesScreen resourcesScreen;


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

        jointPainWelcomeScreen = new JointWelcomeScreen();

        morningStiffnessScreen = new MorningStiffnessScreen();

        meScreen = new MeScreen();


        resourcesScreen = new ResourcesScreen();



    }


}
