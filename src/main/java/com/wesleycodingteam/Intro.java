package com.wesleycodingteam;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Intro {
    @FXML
    private Label dialogue;

    @FXML
    void callStatPage(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("stat.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Stats");
            stage.setScene(new Scene(root,600,500));
            stage.show();
        } catch (IOException e) {
            System.out.println("cant open");
        }

    }
}