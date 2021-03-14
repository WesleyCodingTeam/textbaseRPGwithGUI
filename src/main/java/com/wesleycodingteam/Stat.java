package com.wesleycodingteam;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import java.net.URL;
import java.util.ResourceBundle;

public class Stat {
    //TODO: connect maincharacter.java with this class so that all updates properly
    @FXML
    private Label Name;

    @FXML
    private Label Lv;

    @FXML
    private Label Class;

    @FXML
    private Label Agi;

    @FXML
    private Label Wis;

    @FXML
    private Label Str;

    @FXML
    private Label coin;

    @FXML
    private ProgressBar HPbar;

    @FXML
    private ProgressBar MPbar;
    @FXML
    public void initialize() {
        updateProgressBar();
        Name.setText(MainCharacter.name);
    }
    @FXML
    private void updateProgressBar(){
        HPbar.setProgress(MainCharacter.hpNow/(double)MainCharacter.hpMax);
        MPbar.setProgress(MainCharacter.mpNow/(double)MainCharacter.mpMax);
    }


}