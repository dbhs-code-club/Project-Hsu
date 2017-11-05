package com.dbhscodeclub.hsu.views;

import com.dbhscodeclub.hsu.controllers.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class PeriodManagerView {

    public PeriodManagerController classManagerController;
    public Scene scene;

    public PeriodManagerView() throws Exception {
        classManagerController = new PeriodManagerController();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/views/PeriodManagerView.fxml"));
        Parent content = loader.load();
        scene = new Scene(content);

    }
}
