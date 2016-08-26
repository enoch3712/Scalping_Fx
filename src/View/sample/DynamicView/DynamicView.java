package View.sample.DynamicView;

import javafx.scene.Parent;
import javafx.scene.control.ScrollPane;

/**
 * Created by enoch3712. doesnt matter the date
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
