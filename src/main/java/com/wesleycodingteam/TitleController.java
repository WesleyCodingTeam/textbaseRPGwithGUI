package com.wesleycodingteam;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class TitleController {

    @FXML
    private void switchToIntro(ActionEvent event) throws IOException {
        App.setRoot("intro");
    }
}
