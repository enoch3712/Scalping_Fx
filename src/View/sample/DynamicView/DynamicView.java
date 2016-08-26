package View.sample.DynamicView;

import javafx.scene.Parent;
import javafx.scene.control.ScrollPane;

/**
 * Created by john on 8/26/2016.
 */
public class DynamicView
{

    public static Parent generatePane() {
        Parent root = new ScrollPane();
        loadView(root);
        return root;
    }

    private static void loadView(Parent root) {

    }
}
