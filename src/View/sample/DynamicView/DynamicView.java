package View.sample.DynamicView;

import Model.Settings.Pair;
import javafx.beans.binding.Bindings;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.util.Arrays;

/**
 * Created by enoch3712. doesn't matter the date
 */

public class DynamicView
{
    private final static int NUMBER_OF_COLUMNS = 2;
    private final static String FIRST_COLUMN_NAME = "Pair";
    private final static String SECOND_COLUMN_NAME = "Info";
    private final static String BUTTO_TEXT = "see";
    private final static String VERSION = "Scalping Detector v0.0.1";

    public static Parent generatePane(Stage primaryStage) {
        Parent root = new ScrollPane();
        primaryStage.setTitle(VERSION);
        primaryStage.setScene(loadTable(root, primaryStage));
        primaryStage.show();
        return root;
    }

    private static Scene loadTable(Parent root,Stage stage) {

        ObservableList<Pair> list = FXCollections.observableList(Arrays.asList(Pair.values()));

        TableView table = new TableView();
        Scene scene = new Scene(new Group());
        stage.setWidth(300);
        stage.setHeight(300);

        final Label label = new Label("List of Pairs");
        label.setFont(new Font("Arial", 20));

        table.setEditable(true);

        TableColumn firstNameCol = new TableColumn(FIRST_COLUMN_NAME);
        TableColumn<Pair, Pair> btnCol = new TableColumn<>(SECOND_COLUMN_NAME);
        btnCol.setMinWidth(75);
        btnCol.setSortable(false);
        btnCol.setCellValueFactory(features -> new ReadOnlyObjectWrapper(features.getValue()));
        firstNameCol.setCellValueFactory(new PropertyValueFactory<Pair,String>("name"));

        btnCol.setCellFactory(btnCol1 -> new TableCell<Pair, Pair>() {
            Button button = new Button();
            @Override
            protected void updateItem(Pair item, boolean empty) {
                super.updateItem(item, empty);
                button.setMinWidth(75);
                button.setText(BUTTO_TEXT);
                setGraphic(button);
            }
        });

        table.setItems(list);
        table.getColumns().addAll(firstNameCol,btnCol);
        table.setFixedCellSize(35);
        table.prefHeightProperty().bind(Bindings.size(table.getItems()).multiply(table.getFixedCellSize()).add(30));

        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(20, 20, 20, 20));
        vbox.getChildren().addAll(label, table);
        ((Group) scene.getRoot()).getChildren().addAll(vbox);

        stage.setScene(scene);
        return scene;
    }

}
