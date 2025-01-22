package cartoon;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.util.Duration;

/**
* This class handles the execution of the RocketLaunch and
* RocketLanding scenes with the use of a Timeline. This
* class also activates the key press interaction to move stars,
* the quit button functionality, and the label that continuously
* updates to show the rocket's altitude.
 */

public class Cartoon {

    private BorderPane cartoonPane;
    private Pane rocketPane;
    private VBox cornerBox;
    private Button quit;
    private Label label;
    private RocketLanding rocketLanding;
    private RocketLaunch rocketLaunch;

    public Cartoon(){
        this.label = new Label();
        this.cartoonPane = new BorderPane();
        this.cartoonPane.setFocusTraversable(true);
        this.rocketPane = new Pane();
        this.cornerBox = new VBox();
        this.cartoonPane.setCenter(this.rocketPane);
        this.rocketLanding = new RocketLanding(this.rocketPane);
        this.rocketLaunch = new RocketLaunch(this.rocketPane);
        this.setupTimeline();
        this.setupButtonAndLabel();
        this.updateStars();
    }

    public BorderPane getCartoonPane(){
        return this.cartoonPane;
    }

    /**
     * This method sets up the quit button and the continuously updating label.
     */
    private void setupButtonAndLabel() {
        this.quit = new Button("Quit");
        this.quit.setFocusTraversable(false);
        this.cartoonPane.setRight(this.cornerBox);
        this.cornerBox.getChildren().addAll(this.label, this.quit);
        this.cornerBox.setSpacing(Constants.CORNER_BOX_SPACING);
        this.cornerBox.setPrefWidth(Constants.CORNER_BOX_WIDTH);
        this.label.setTextFill(Color.WHITE);
        this.label.setPrefSize(200.0, 50.0);
        this.cornerBox.setAlignment(Pos.TOP_RIGHT);
        this.cornerBox.setAlignment(Pos.TOP_CENTER);
        this.quit.setOnAction((ActionEvent e) -> System.exit(0));
    }

    /**
     * This method creates and runs the Timeline for the animation.
     */
    private void setupTimeline() {
        KeyFrame kf = new KeyFrame(Duration.millis(Constants.DURATION), (ActionEvent e) -> this.updateRocket());
        Timeline timeline = new Timeline(kf);
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

    /**
     * This method specifies what should happen for each key
     * frame of the Timeline. In each key frame, the launching
     * rocket moves upwards until it reaches the top of the screen,
     * after which the landing rocket begins to land. The water
     * splash also occurs when the landing rocket has reached
     * a certain y-location.
     */
    private void updateRocket() {
        if (this.rocketLaunch.getLayoutY() >= Constants.TOP_OF_SCREEN) {
            this.rocketLaunch.setLaunchY();
            this.label.setText("Rocket Altitude: " + this.rocketLaunch.getLayoutY()*Constants.ALTITUDE_MULTIPLIER);
        } else {
            this.rocketLanding.setLandingY();
            if(this.rocketLanding.getLayoutY() < Constants.LABEL_CORRECTOR) {
                this.label.setText("Rocket Altitude: " + (Constants.LABEL_CORRECTOR - this.rocketLanding.getLayoutY()));
            }
        }
        if (this.rocketLanding.getLayoutY() >= Constants.WATER_SPLASH_TOP && this.rocketLanding.getLayoutY() <= Constants.WATER_SPLASH_BOTTOM){
            this.rocketLanding.setWaterSplashY();
        }
    }

    /**
     * This method activates the key functionality for the movement
     * of the stars, which is defined in the RocketLanding class.
     */
    private void updateStars() {
        this.cartoonPane.setOnKeyPressed((KeyEvent e) -> this.rocketLanding.moveStars(e));
        this.cartoonPane.setFocusTraversable(true);
    }
}