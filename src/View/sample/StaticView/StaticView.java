package View.sample.StaticView;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.IOException;

/**
 * Created by john on 8/26/2016.
 */
public class StaticView {
    public static Parent generatePane(Class app) {
        Parent root;
        try {
            root = FXMLLoader.load(app.getResource("StaticView/sample.fxml"));
            return root;
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
        return null;
    }
}
