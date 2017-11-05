package com.dbhscodeclub.hsu.controllers;

import com.dbhscodeclub.hsu.models.*;

public class PeriodManagerController /*implements Initializable*/ {

    public PeriodManager model;
    private int periodCount;

//    @Override
//    public void initialize(URL location, ResourceBundle resources) {
//        System.out.println("loading user data");
//    }

    public PeriodManagerController() {
        model = new PeriodManager();
        periodCount = model.periodCount;
    }

    public void handleNewClassBtn() {
        if (periodCount == 0) {
            System.out.println("No classes, change classManager view");
        }
    }



}

