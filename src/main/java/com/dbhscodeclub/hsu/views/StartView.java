package com.dbhscodeclub.hsu.views;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartView extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/views/StartView.fxml"));
        Parent content = loader.load();
        primaryStage.setTitle("Project Hsu");
        primaryStage.setScene(new Scene(content));
        primaryStage.show();

    }

}