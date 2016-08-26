package View.sample;

import View.sample.DynamicView.DynamicView;
import View.sample.StaticView.StaticView;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.stage.Stage;
import View.sample.*;

public class Main extends Application {

    private static boolean IS_STATIC = false;

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        //Parent root = FXMLLoader.load(getClass().getResource("StaticView/sample.fxml"));
        Parent root = IS_STATIC? DynamicView.generatePane(): StaticView.generatePane(this.getClass());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
