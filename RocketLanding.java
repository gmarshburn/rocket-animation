package cartoon;

import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

/**
 * This class creates all the shapes for the rocket that
 * lands in the ocean, as well as the sky and stars that
 * are part of the background. The method for moving each
 * shape during the landing sequence and key interaction
 * for the stars is also here.
 */

public class RocketLanding {

    private Rectangle sky;
    private Ellipse star1;
    private Ellipse star2;
    private Ellipse star3;
    private Ellipse star4;
    private Ellipse star5;
    private Ellipse bigWaterLeft;
    private Ellipse bigWaterRight;
    private Ellipse littleWater1;
    private Ellipse littleWater2;
    private Ellipse littleWater3;
    private Rectangle landingBody;
    private Polygon landingTop;
    private Polygon landingTriangle;
    private Ellipse leftParachuteBottom;
    private Ellipse rightParachuteBottom;
    private Arc leftParachuteTop;
    private Arc rightParachuteTop;
    private Line leftTether;
    private Line rightTether;

    public RocketLanding(Pane rocketPane){
        this.sky = new Rectangle(Constants.SKY_WIDTH, Constants.SKY_HEIGHT);
        this.star1 = new Ellipse(Constants.STAR_1_RADIUS_X, Constants.STAR_1_RADIUS_Y);
        this.star2 = new Ellipse(Constants.STAR_2_RADIUS_X, Constants.STAR_2_RADIUS_Y);
        this.star3 = new Ellipse(Constants.STAR_3_RADIUS_X, Constants.STAR_3_RADIUS_Y);
        this.star4 = new Ellipse(Constants.STAR_4_RADIUS_X, Constants.STAR_4_RADIUS_Y);
        this.star5 = new Ellipse(Constants.STAR_5_RADIUS_X, Constants.STAR_5_RADIUS_Y);
        this.bigWaterLeft = new Ellipse(Constants.BIG_WATER_LEFT_RADIUS_X,Constants.BIG_WATER_LEFT_RADIUS_Y );
        this.bigWaterRight = new Ellipse(Constants.BIG_WATER_RIGHT_RADIUS_X, Constants.BIG_WATER_RIGHT_RADIUS_Y);
        this.littleWater1 = new Ellipse(Constants.LITTLE_WATER_1_RADIUS_X, Constants.LITTLE_WATER_1_RADIUS_Y);
        this.littleWater2 = new Ellipse(Constants.LITTLE_WATER_2_RADIUS_X, Constants.LITTLE_WATER_2_RADIUS_Y);
        this.littleWater3 = new Ellipse(Constants.LITTLE_WATER_3_RADIUS_X, Constants.LITTLE_WATER_3_RADIUS_Y);
        this.landingBody = new Rectangle(Constants.LANDING_BODY_WIDTH, Constants.LANDING_BODY_HEIGHT);
        this.landingTop = new Polygon(Constants.OG_LANDING_TOP_LEFT_X, Constants.OG_LANDING_TOP_LEFT_Y,
                Constants.OG_LANDING_TOP_RIGHT_X, Constants.OG_LANDING_TOP_RIGHT_Y, Constants.OG_LANDING_TOP_MIDDLE_X,
                Constants.OG_LANDING_TOP_MIDDLE_Y);
        this.landingTriangle = new Polygon(Constants.OG_LANDING_TRIANGLE_LEFT_X, Constants.OG_LANDING_TRIANGLE_LEFT_Y,
                Constants.OG_LANDING_TRIANGLE_RIGHT_X, Constants.OG_LANDING_TRIANGLE_RIGHT_Y,
                Constants.OG_LANDING_TRIANGLE_MIDDLE_X, Constants.OG_LANDING_TRIANGLE_MIDDLE_Y);
        this.leftParachuteBottom = new Ellipse(Constants.LEFT_PARACHUTE_BOTTOM_RADIUS_X,
                Constants.LEFT_PARACHUTE_BOTTOM_RADIUS_Y);
        this.rightParachuteBottom = new Ellipse(Constants.RIGHT_PARACHUTE_BOTTOM_RADIUS_X,
                Constants.RIGHT_PARACHUTE_BOTTOM_RADIUS_Y);
        this.leftParachuteTop = new Arc();
        this.rightParachuteTop = new Arc();
        this.leftTether = new Line();
        this.rightTether = new Line();
        rocketPane.getChildren().addAll(this.sky, this.star1, this.star2, this.star3, this.star4, this.star5,
                this.leftParachuteTop, this.rightParachuteTop, this.leftParachuteBottom, this.rightParachuteBottom,
                this.leftTether, this.rightTether, this.landingBody, this.landingTop, this.landingTriangle,
                this.bigWaterLeft, this.bigWaterRight, this.littleWater1, this.littleWater2, this.littleWater3);
        this.setupSky();
        this.setupWaterSplash();
        this.setupDragon();
        this.setupParachutes();
    }

    /**
     * This method helps create all the stars in
     * the sky and add them to the scene.
     */
    private void setupSky(){
        this.sky.setX(Constants.SKY_X);
        this.sky.setY(Constants.SKY_Y);
        this.sky.setFill(Color.MIDNIGHTBLUE);
        this.star1.setCenterX(Constants.OG_STAR_1_CENTER_X);
        this.star1.setCenterY(Constants.OG_STAR_1_CENTER_Y);
        this.star1.setFill(Color.GOLD);
        this.star2.setCenterX(Constants.OG_STAR_2_CENTER_X);
        this.star2.setCenterY(Constants.OG_STAR_2_CENTER_Y);
        this.star2.setFill(Color.GOLD);
        this.star3.setCenterX(Constants.OG_STAR_3_CENTER_X);
        this.star3.setCenterY(Constants.OG_STAR_3_CENTER_Y);
        this.star3.setFill(Color.GOLD);
        this.star4.setCenterX(Constants.OG_STAR_4_CENTER_X);
        this.star4.setCenterY(Constants.OG_STAR_4_CENTER_Y);
        this.star4.setFill(Color.GOLD);
        this.star5.setCenterX(Constants.OG_STAR_5_CENTER_X);
        this.star5.setCenterY(Constants.OG_STAR_5_CENTER_Y);
        this.star5.setFill(Color.GOLD);
    }

    /**
     * This method helps create the water splash in
     * the ocean and add them to the scene.
     */
    private void setupWaterSplash(){
        this.bigWaterLeft.setCenterX(Constants.OG_BIG_WATER_LEFT_CENTER_X);
        this.bigWaterLeft.setCenterY(Constants.OG_BIG_WATER_LEFT_CENTER_Y);
        this.bigWaterLeft.setRotate(Constants.BIG_WATER_LEFT_ROTATE);
        this.bigWaterLeft.setFill(Color.CORNFLOWERBLUE);
        this.bigWaterRight.setCenterX(Constants.OG_BIG_WATER_RIGHT_CENTER_X);
        this.bigWaterRight.setCenterY(Constants.OG_BIG_WATER_RIGHT_CENTER_Y);
        this.bigWaterRight.setRotate(Constants.BIG_WATER_RIGHT_ROTATE);
        this.bigWaterRight.setFill(Color.CORNFLOWERBLUE);
        this.littleWater1.setCenterX(Constants.OG_LITTLE_WATER_1_CENTER_X);
        this.littleWater1.setCenterY(Constants.OG_LITTLE_WATER_1_CENTER_Y);
        this.littleWater1.setFill(Color.CORNFLOWERBLUE);
        this.littleWater2.setCenterX(Constants.OG_LITTLE_WATER_2_CENTER_X);
        this.littleWater2.setCenterY(Constants.OG_LITTLE_WATER_2_CENTER_Y);
        this.littleWater2.setFill(Color.CORNFLOWERBLUE);
        this.littleWater3.setCenterX(Constants.OG_LITTLE_WATER_3_CENTER_X);
        this.littleWater3.setCenterY(Constants.OG_LITTLE_WATER_3_CENTER_Y);
        this.littleWater3.setFill(Color.CORNFLOWERBLUE);
    }

    /**
     * This method helps create all the parts of the Dragon
     * capsule that lands and add them to the scene.
     */
    private void setupDragon(){
        this.landingBody.setX(Constants.OG_LANDING_BODY_X);
        this.landingBody.setY(Constants.OG_LANDING_BODY_Y);
        this.landingBody.setFill(Color.BLANCHEDALMOND);
        this.landingTop.setScaleX(Constants.LANDING_TOP_SCALE_X);
        this.landingTop.setScaleY(Constants.LANDING_TOP_SCALE_Y);
        this.landingTop.setFill(Color.BLANCHEDALMOND);
        this.landingTriangle.setScaleX(Constants.LANDING_TRIANGLE_SCALE_X);
        this.landingTriangle.setScaleY(Constants.LANDING_TRIANGLE_SCALE_Y);
        this.landingTriangle.setFill(Color.BLACK);
    }

    /**
     * This method helps create all the parachutes that are part
     * of the Dragon capsule in that lands and add them to the scene.
     */
    private void setupParachutes(){
        this.leftParachuteBottom.setCenterX(Constants.OG_LEFT_PARACHUTE_BOTTOM_CENTER_X);
        this.leftParachuteBottom.setCenterY(Constants.OG_LEFT_PARACHUTE_BOTTOM_CENTER_Y);
        this.leftParachuteBottom.setFill(Color.WHITE);
        this.rightParachuteBottom.setCenterX(Constants.OG_RIGHT_PARACHUTE_BOTTOM_CENTER_X);
        this.rightParachuteBottom.setCenterY(Constants.OG_RIGHT_PARACHUTE_BOTTOM_CENTER_Y);
        this.rightParachuteBottom.setFill(Color.WHITE);
        this.leftParachuteTop.setCenterX(Constants.OG_LEFT_PARACHUTE_TOP_CENTER_X);
        this.leftParachuteTop.setCenterY(Constants.OG_LEFT_PARACHUTE_TOP_CENTER_Y);
        this.leftParachuteTop.setRadiusX(Constants.LEFT_PARACHUTE_TOP_RADIUS_X);
        this.leftParachuteTop.setRadiusY(Constants.LEFT_PARACHUTE_TOP_RADIUS_Y);
        this.leftParachuteTop.setStartAngle(Constants.LEFT_PARACHUTE_TOP_START_ANGLE);
        this.leftParachuteTop.setLength(Constants.LEFT_PARACHUTE_TOP_LENGTH);
        this.leftParachuteTop.setType(ArcType.CHORD);
        this.leftParachuteTop.setFill(Color.DARKORANGE);
        this.rightParachuteTop.setCenterX(Constants.OG_RIGHT_PARACHUTE_TOP_CENTER_X);
        this.rightParachuteTop.setCenterY(Constants.OG_RIGHT_PARACHUTE_TOP_CENTER_Y);
        this.rightParachuteTop.setRadiusX(Constants.RIGHT_PARACHUTE_TOP_RADIUS_X);
        this.rightParachuteTop.setRadiusY(Constants.RIGHT_PARACHUTE_TOP_RADIUS_Y);
        this.rightParachuteTop.setStartAngle(Constants.RIGHT_PARACHUTE_TOP_START_ANGLE);
        this.rightParachuteTop.setLength(Constants.RIGHT_PARACHUTE_TOP_LENGTH);
        this.rightParachuteTop.setType(ArcType.CHORD);
        this.rightParachuteTop.setFill(Color.DARKORANGE);
        this.leftTether.setStartX(Constants.OG_LEFT_TETHER_START_X);
        this.leftTether.setStartY(Constants.OG_LEFT_TETHER_START_Y);
        this.leftTether.setEndX(Constants.OG_LEFT_TETHER_END_X);
        this.leftTether.setEndY(Constants.OG_LEFT_TETHER_END_Y);
        this.leftTether.setFill(Color.BLACK);
        this.rightTether.setStartX(Constants.OG_RIGHT_TETHER_START_X);
        this.rightTether.setStartY(Constants.OG_RIGHT_TETHER_START_Y);
        this.rightTether.setEndX(Constants.OG_RIGHT_TETHER_END_X);
        this.rightTether.setEndY(Constants.OG_RIGHT_TETHER_END_Y);
        this.rightTether.setFill(Color.BLACK);
    }

    /**
     * This method moves the composite shape of the Dragon
     * and its parachutes down the screen by incrementing
     * each individual shape's y-location on screen.
     */
    public void setLandingY(){
        double landingBodyLoc = this.landingBody.getY();
        double landingTopLoc = this.landingTop.getLayoutY();
        double landingTriangleLoc = this.landingTriangle.getLayoutY();
        double leftParachuteBottomLoc = this.leftParachuteBottom.getCenterY();
        double rightParachuteBottomLoc = this.leftParachuteBottom.getCenterY();
        double leftParachuteTopLoc = this.leftParachuteTop.getCenterY();
        double rightParachuteTopLoc = this.rightParachuteTop.getCenterY();
        double leftTetherStartLoc = this.leftTether.getStartY();
        double leftTetherEndLoc = this.leftTether.getEndY();
        double rightTetherStartLoc = this.rightTether.getStartY();
        double rightTetherEndLoc = this.rightTether.getEndY();
        this.landingBody.setY(landingBodyLoc + Constants.LANDING_SPEED);
        this.landingTop.setLayoutY(landingTopLoc + Constants.LANDING_SPEED);
        this.landingTriangle.setLayoutY(landingTriangleLoc + Constants.LANDING_SPEED);
        this.leftParachuteBottom.setCenterY(leftParachuteBottomLoc + Constants.LANDING_SPEED);
        this.rightParachuteBottom.setCenterY(rightParachuteBottomLoc + Constants.LANDING_SPEED);
        this.leftParachuteTop.setCenterY(leftParachuteTopLoc + Constants.LANDING_SPEED);
        this.rightParachuteTop.setCenterY(rightParachuteTopLoc + Constants.LANDING_SPEED);
        this.leftTether.setStartY(leftTetherStartLoc + Constants.LANDING_SPEED);
        this.leftTether.setEndY(leftTetherEndLoc + Constants.LANDING_SPEED);
        this.rightTether.setStartY(rightTetherStartLoc + Constants.LANDING_SPEED);
        this.rightTether.setEndY(rightTetherEndLoc + Constants.LANDING_SPEED);
    }

    /**
     * This method moves the water splashes up and into
     * view by decrementing each individual splash
     * shape's y-location on screen.
     */
    public void setWaterSplashY(){
        double bigWaterLeftLoc = this.bigWaterLeft.getCenterY();
        double bigWaterRightLoc = this.bigWaterRight.getCenterY();
        double littleWater1Loc = this.littleWater1.getCenterY();
        double littleWater2Loc = this.littleWater2.getCenterY();
        double littleWater3Loc = this.littleWater3.getCenterY();
        this.bigWaterLeft.setCenterY(bigWaterLeftLoc - Constants.WATER_SPLASH_SPEED);
        this.bigWaterRight.setCenterY(bigWaterRightLoc - Constants.WATER_SPLASH_SPEED);
        this.littleWater1.setCenterY(littleWater1Loc - Constants.WATER_SPLASH_SPEED);
        this.littleWater2.setCenterY(littleWater2Loc - Constants.WATER_SPLASH_SPEED);
        this.littleWater3.setCenterY(littleWater3Loc - Constants.WATER_SPLASH_SPEED);
    }

    /**
     * This method creates the key interaction for the stars'
     * movement so that when the left arrow is pressed, the
     * stars move left, when the right arrow is pressed, the
     * stars move right, and when the space bar is pressed,
     * the stars disappear and come back into view.
     * @param: the key event with which to be interacted
     */
    public void moveStars(KeyEvent e){
        KeyCode keyEvent = e.getCode();
        double star1Loc = this.star1.getCenterX();
        double star2Loc = this.star2.getCenterX();
        double star3Loc = this.star3.getCenterX();
        double star4Loc = this.star4.getCenterX();
        double star5Loc = this.star5.getCenterX();
        if (keyEvent == KeyCode.RIGHT) {
            this.star1.setCenterX(star1Loc + Constants.MOVE_STARS_X);
            this.star2.setCenterX(star2Loc + Constants.MOVE_STARS_X);
            this.star3.setCenterX(star3Loc + Constants.MOVE_STARS_X);
            this.star4.setCenterX(star4Loc + Constants.MOVE_STARS_X);
            this.star5.setCenterX(star5Loc + Constants.MOVE_STARS_X);
        }
        if (keyEvent == KeyCode.LEFT) {
            this.star1.setCenterX(star1Loc - Constants.MOVE_STARS_X);
            this.star2.setCenterX(star2Loc - Constants.MOVE_STARS_X);
            this.star3.setCenterX(star3Loc - Constants.MOVE_STARS_X);
            this.star4.setCenterX(star4Loc - Constants.MOVE_STARS_X);
            this.star5.setCenterX(star5Loc - Constants.MOVE_STARS_X);
        }
        if (keyEvent == KeyCode.SPACE) {
            if(this.star1.getOpacity() == Constants.STAR_APPEAR) {
                this.star1.setOpacity(Constants.STAR_DISAPPEAR);
                this.star2.setOpacity(Constants.STAR_DISAPPEAR);
                this.star3.setOpacity(Constants.STAR_DISAPPEAR);
                this.star4.setOpacity(Constants.STAR_DISAPPEAR);
                this.star5.setOpacity(Constants.STAR_DISAPPEAR);
            } else {
                this.star1.setOpacity(Constants.STAR_APPEAR);
                this.star2.setOpacity(Constants.STAR_APPEAR);
                this.star3.setOpacity(Constants.STAR_APPEAR);
                this.star4.setOpacity(Constants.STAR_APPEAR);
                this.star5.setOpacity(Constants.STAR_APPEAR);
            }
        }
        e.consume();
    }

    /**
     * This method returns the current y-location of the
     * composite shape of the Dragon capsule by returning
     * the y-location of the main triangle in the composite
     * shape, so the Cartoon class can use the value.
     * @return: the double for the location of the main
     * triangle in the composite shape
     */
    public double getLayoutY(){
        return this.landingTriangle.getLayoutY();
    }
}