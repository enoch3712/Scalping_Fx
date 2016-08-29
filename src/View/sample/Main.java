package View.sample;

import View.sample.DynamicView.DynamicView;
import View.sample.StaticView.StaticView;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import View.sample.*;

public class Main extends Application {

    private static boolean IS_STATIC = false;
    private Parent View;
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        primaryStage.getIcons().add(new Image("http://static1.squarespace.com/static/55523bbae4b0cdb7d2cfedd3/t/55cce5a2e4b0ff38cd529c96/1439491491383/Stock+Market.png?format=300w"));
        View = IS_STATIC ? StaticView.generatePane(this.getClass(),primaryStage):DynamicView.generatePane(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);

    }
}
