package com.example.mariokartrandomcombo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class MarioKartRandomComboApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MarioKartRandomComboApplication.class.getResource("randomCombo-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.getIcons().add(new Image("C:/Users/alexa/IdeaProjects/MarioKartRandomCombo/src/main/resources/png/icons8-tony-kart-16.png"));
        stage.setTitle("Mario Kart Random Combo Generator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}