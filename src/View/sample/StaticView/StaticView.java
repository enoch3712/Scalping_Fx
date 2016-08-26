package View.sample.StaticView;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by enoch3712. doesnt matter the date
 */

public class StaticView {
    public static Parent generatePane(Class app,Stage primaryStage) {
        Parent root;
        try {
            root = FXMLLoader.load(app.getResource("StaticView/sample.fxml"));
            primaryStage.setTitle("Spike Detector v0.0.1");
            primaryStage.setScene(new Scene(root, 300, 275));
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
        return null;
    }
}
