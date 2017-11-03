package com.dbhscodeclub.hsu.views;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ClassesView extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/views/ClassesView.fxml"));
        Parent content = loader.load();
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(content, 300, 275));
        primaryStage.show();
    }

}