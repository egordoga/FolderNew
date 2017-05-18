package raznoe;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.io.File;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        File file = new File("D:\\Java\\Conspect.doc");

        Scene scene = new Scene(new Group());
        stage.setTitle("Label Sample");
        stage.setWidth(400);
        stage.setHeight(180);

        FileSystemView view = FileSystemView.getFileSystemView();
        Icon icon = view.getSystemIcon(file);

        HBox hbox = new HBox();
        Image image = new Image(getClass().getResourceAsStream("arrow.png"));
        Label label1 = new Label(file.getName());
        label1.setGraphic(new ImageView(image));

        hbox.setSpacing(10);
        hbox.getChildren().add((label1));
        ((Group) scene.getRoot()).getChildren().add(hbox);

        stage.setScene(scene);
        stage.show();
    }
}
