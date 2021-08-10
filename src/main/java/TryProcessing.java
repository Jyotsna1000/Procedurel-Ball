import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    public static final int HEIGHT_DIVIDER = 5;
    public static final int INCREMENT_BALL_TWO = 2;
    public static final int INCREMENT_BALL_THREE = 3;
    public static final int INCREMENT_BALL_FOUR = 4;

    int speedOfBallOne = 0;
    int paceOfBallTwo = 0;
    int paceOfBallThree = 0;
    int paceOfBallFour = 0;

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        ellipse(speedOfBallOne++, HEIGHT / HEIGHT_DIVIDER, DIAMETER, DIAMETER);
        ellipse(paceOfBallTwo, HEIGHT * INCREMENT_BALL_TWO / HEIGHT_DIVIDER, DIAMETER, DIAMETER);
        paceOfBallTwo += INCREMENT_BALL_TWO;
        ellipse(paceOfBallThree, HEIGHT * INCREMENT_BALL_THREE / HEIGHT_DIVIDER, DIAMETER, DIAMETER);
        paceOfBallThree += INCREMENT_BALL_THREE;
        ellipse(paceOfBallFour, HEIGHT * INCREMENT_BALL_FOUR / HEIGHT_DIVIDER, DIAMETER, DIAMETER);
        paceOfBallFour += INCREMENT_BALL_FOUR;

    }
}