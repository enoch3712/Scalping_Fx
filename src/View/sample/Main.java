package View.sample;

import View.sample.DynamicView.DynamicView;
import View.sample.StaticView.StaticView;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.stage.Stage;
import View.sample.*;

public class Main extends Application {

    private static boolean IS_STATIC = false;
    private Parent View;
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        View = IS_STATIC ? StaticView.generatePane(this.getClass(),primaryStage):DynamicView.generatePane(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
