package com.example.se302;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ListCell;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 660);
        stage.setTitle("Syllabus App");
        stage.setScene(scene);
        Controllers.loadSyllabusFromFile();
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}