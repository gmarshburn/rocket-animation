package cartoon;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

/**
 * This class creates the panes for my cartoon program.
 */

public class PaneOrganizer {

    private BorderPane root;

    public PaneOrganizer() {
        this.root = new BorderPane();
        Cartoon cartoon = new Cartoon();
        this.root.setCenter(cartoon.getCartoonPane());
    }

    /**
     * This method acts as a getter for the root pane of the
     * program the App class can access the variable.
     * @return: the root pane
     */
    public Pane getRoot() {
        return this.root;
    }

}