package cartoon;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * This class creates the stage and scene in which my rocket
 * launch and landing takes place. I titled it Crew 3 because
 * my dad is the pilot for the Crew 3 mission from SpaceX.
 */

public class App extends Application {

    @Override
    public void start(Stage stage) {
        PaneOrganizer organizer = new PaneOrganizer();
        Scene scene = new Scene(organizer.getRoot(), Constants.SCENE_WIDTH, Constants.SCENE_HEIGHT);
        stage.setScene(scene);
        stage.setTitle("Crew 3");
        stage.show();
    }

    public static void main(String[] argv) {
        launch(argv);
    }
}