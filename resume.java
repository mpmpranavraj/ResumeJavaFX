package org.example.resumegui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class resume extends Application {
    @Override
    public void start(Stage stage) throws IOException {
      Parent root = FXMLLoader.load(getClass().getResource("Resume.fxml"));
      FXMLLoader fxmlLoader = new FXMLLoader(resume.class.getResource("resume.fxml"));

        stage.setTitle("RESUME");
      stage.setScene(new Scene(root));
        stage.setResizable(true); // Ensure the stage is resizable

      stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}