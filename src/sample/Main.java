package sample;

import controllers.TreeController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;

public class Main extends Application {
    TreeController treeController = new TreeController();

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../fxml/basicWindow.fxml"));
        primaryStage.setTitle("Hello World");
        Scene scene = new Scene(new Group(), 300, 300);
        VBox vbox = new VBox();

        TreeItem<File> root1 = treeController.createNode(new File("d:/"));
        TreeView treeView = new TreeView<>(root1);

        vbox.getChildren().add(treeView);
        ((Group) scene.getRoot()).getChildren().add(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();



       /* stage.setScene(scene);
        stage.show();*/
    }


    public static void main(String[] args) {
        launch(args);
    }
}
