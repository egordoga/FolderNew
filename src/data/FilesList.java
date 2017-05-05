package data;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.File;

public class FilesList {
    ObservableList<File> dirs = FXCollections.observableArrayList();
    ObservableList<File> files = FXCollections.observableArrayList();

    public void addListFiles(String path) {
        File file = new File(path);
        File[] fileArr = file.listFiles();
        for (File file1 : fileArr) {
            if (file1.isDirectory()){
                dirs.add(file1);
            } else {
                files.add(file1);
            }
        }
    }

}
