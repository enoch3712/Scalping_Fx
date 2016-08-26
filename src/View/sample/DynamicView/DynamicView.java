package View.sample.DynamicView;

import Model.Settings;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;
import Model.Settings.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by enoch3712. doesn't matter the date
 */

public class DynamicView
{

    public static Parent generatePane(Stage primaryStage) {
        Parent root = new ScrollPane();
        loadView(root);
        primaryStage.setTitle("Spike Detector v0.0.1");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        return root;
    }

    private static void loadView(Parent root) {
        List list = Arrays.asList(Pair.values());
        list.forEach(elem -> {root});
    }
}
