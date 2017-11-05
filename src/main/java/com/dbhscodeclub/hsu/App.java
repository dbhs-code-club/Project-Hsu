package com.dbhscodeclub.hsu;

import com.dbhscodeclub.hsu.views.*;
import com.dbhscodeclub.hsu.models.*;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

    public PeriodManagerView classManagerView;

    public static void main(String[] args) {
        PeriodManager pdManager = new PeriodManager();
        System.out.println("pdManager created");
        launch(args);
    }

    /*
    create GUI that lists all classes
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        classManagerView = new PeriodManagerView();
        primaryStage.setTitle("Project Hsu");
        primaryStage.setScene(classManagerView.scene);
        primaryStage.show();
        System.out.println("primaryStage shown");

    }

}