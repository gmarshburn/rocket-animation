package cartoon;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

/**
 * This class creates all the shapes for the rocket that
 *  launches from the ground, as well as the ground and the
 *  water of the earth and the launch tower and its arm.
 */

public class RocketLaunch {

    private Rectangle rocketBody;
    private Polygon rocketTop;
    private Rectangle rocketSquare;
    private Polygon rocketTriangle;
    private Ellipse rocketWindow;
    private Polygon rocketBooster;
    private Ellipse water;
    private Ellipse ground;
    private Rectangle tower;
    private Rectangle arm;

    public RocketLaunch(Pane rocketPane){
        this.rocketBody = new Rectangle(Constants.ROCKET_BODY_WIDTH, Constants.ROCKET_BODY_HEIGHT);
        this.rocketTop = new Polygon(Constants.OG_ROCKET_TOP_LEFT_X, Constants.OG_ROCKET_TOP_LEFT_Y,
                Constants.OG_ROCKET_TOP_RIGHT_X, Constants.OG_ROCKET_TOP_RIGHT_Y, Constants.OG_ROCKET_TOP_MIDDLE_X,
                Constants.OG_ROCKET_TOP_MIDDLE_Y);
        this.rocketSquare = new Rectangle(Constants.ROCKET_SQUARE_WIDTH, Constants.ROCKET_SQUARE_HEIGHT);
        this.rocketTriangle = new Polygon(Constants.OG_ROCKET_TRIANGLE_LEFT_X, Constants.OG_ROCKET_TRIANGLE_LEFT_Y,
                Constants.OG_ROCKET_TRIANGLE_RIGHT_X, Constants.OG_ROCKET_TRIANGLE_RIGHT_Y,
                Constants.OG_ROCKET_TRIANGLE_MIDDLE_X, Constants.OG_ROCKET_TRIANGLE_MIDDLE_Y);
        this.rocketWindow = new Ellipse(Constants.ROCKET_WINDOW_RADIUS_X, Constants.ROCKET_WINDOW_RADIUS_Y);
        this.rocketBooster = new Polygon(Constants.OG_ROCKET_BOOSTER_LEFT_TOP_X, Constants.OG_ROCKET_BOOSTER_LEFT_TOP_Y,
                Constants.OG_ROCKET_BOOSTER_RIGHT_TOP_X, Constants.OG_ROCKET_BOOSTER_RIGHT_TOP_Y,
                Constants.OG_ROCKET_BOOSTER_RIGHT_BOTTOM_X, Constants.OG_ROCKET_BOOSTER_RIGHT_BOTTOM_Y,
                Constants.OG_ROCKET_BOOSTER_LEFT_BOTTOM_X, Constants.OG_ROCKET_BOOSTER_LEFT_BOTTOM_Y);
        this.water = new Ellipse(Constants.WATER_RADIUS_X, Constants.WATER_RADIUS_Y);
        this.ground = new Ellipse(Constants.GROUND_RADIUS_X, Constants.GROUND_RADIUS_Y);
        this.tower = new Rectangle(Constants.TOWER_WIDTH, Constants.TOWER_HEIGHT);
        this.arm = new Rectangle(Constants.ARM_WIDTH, Constants.ARM_HEIGHT);
        rocketPane.getChildren().addAll(this.water, this.ground, this.rocketBody, this.rocketTop, this.rocketSquare,
                this.rocketTriangle, this.rocketWindow, this.rocketBooster, this.tower, this.arm);
        this.setupGround();
        this.setupRocket();
        this.setupTower();
    }

    /**
     * This method helps create all the parts of the Falcon 9
     * rocket that launches and add them to the scene.
     */
    private void setupRocket(){
        this.rocketBody.setX(Constants.OG_ROCKET_BODY_X);
        this.rocketBody.setY(Constants.OG_ROCKET_BODY_Y);
        this.rocketBody.setFill(Color.ALICEBLUE);
        this.rocketTop.setScaleX(Constants.ROCKET_TOP_SCALE_X);
        this.rocketTop.setScaleY(Constants.ROCKET_TOP_SCALE_Y);
        this.rocketTop.setFill(Color.ALICEBLUE);
        this.rocketSquare.setX(Constants.OG_ROCKET_SQUARE_X);
        this.rocketSquare.setY(Constants.OG_ROCKET_SQUARE_Y);
        this.rocketSquare.setFill(Color.BLACK);
        this.rocketTriangle.setScaleX(Constants.ROCKET_TRIANGLE_SCALE_X);
        this.rocketTriangle.setScaleY(Constants.ROCKET_TRIANGLE_SCALE_Y);
        this.rocketTriangle.setFill(Color.BLACK);
        this.rocketWindow.setCenterX(Constants.OG_ROCKET_WINDOW_CENTER_X);
        this.rocketWindow.setCenterY(Constants.OG_ROCKET_WINDOW_CENTER_Y);
        this.rocketWindow.setFill(Color.BLACK);
        this.rocketBooster.setScaleX(Constants.ROCKET_BOOSTER_SCALE_X);
        this.rocketBooster.setScaleY(Constants.ROCKET_BOOSTER_SCALE_Y);
        this.rocketBooster.setFill(Color.BLACK);
    }

    /**
     * This method helps create all the parts of the
     * ground and water and add them to the scene.
     */
    private void setupGround(){
        this.water.setCenterX(Constants.WATER_CENTER_X);
        this.water.setCenterY(Constants.WATER_CENTER_Y);
        this.water.setFill(Color.CORNFLOWERBLUE);
        this.ground.setCenterX(Constants.GROUND_CENTER_X);
        this.ground.setCenterY(Constants.GROUND_CENTER_Y);
        this.ground.setFill(Color.GREEN);
    }

    /**
     * This method helps create all the parts of
     * the launch tower and add them to the scene.
     */
    private void setupTower(){
        this.tower.setX(Constants.TOWER_X);
        this.tower.setY(Constants.TOWER_Y);
        this.tower.setFill(Color.DARKGRAY);
        this.arm.setX(Constants.ARM_X);
        this.arm.setY(Constants.ARM_Y);
        this.arm.setFill(Color.DIMGRAY);
    }

    /**
     * This method moves the composite shape of the Falcon 9
     * up the screen by decrementing each individual shape's
     * y-location on screen.
     */
    public void setLaunchY(){
        double rocketBodyLoc = this.rocketBody.getY();
        double rocketTopLoc = this.rocketTop.getLayoutY();
        double rocketSquareLoc = this.rocketSquare.getY();
        double rocketTriangleLoc = this.rocketTriangle.getLayoutY();
        double rocketWindowLoc = this.rocketWindow.getCenterY();
        double rocketBoosterLoc = this.rocketBooster.getLayoutY();
        this.rocketBody.setY(rocketBodyLoc - Constants.LAUNCH_SPEED);
        this.rocketTop.setLayoutY(rocketTopLoc - Constants.LAUNCH_SPEED);
        this.rocketSquare.setY(rocketSquareLoc - Constants.LAUNCH_SPEED);
        this.rocketTriangle.setLayoutY(rocketTriangleLoc - Constants.LAUNCH_SPEED);
        this.rocketWindow.setCenterY(rocketWindowLoc - Constants.LAUNCH_SPEED);
        this.rocketBooster.setLayoutY(rocketBoosterLoc - Constants.LAUNCH_SPEED);
    }

    /**
     * This method returns the current y-location of the
     * composite shape of the Falcon 9 rocket by returning
     * the y-location of the main rectangle in the composite
     * shape, so the Cartoon class can use the value.
     * @return: the double for the location of the main
     * rectangle in the composite shape.
     */
    public double getLayoutY(){
        return this.rocketBooster.getLayoutY();
    }
}