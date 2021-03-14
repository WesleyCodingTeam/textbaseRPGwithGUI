package com.wesleycodingteam;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Intro {
    @FXML
    private Label dialogue;
    void setMessage(String str){
        dialogue.setText(str);
    }
}