package org.example.resumegui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ResourceBundle;

public class resumecontroller implements Initializable {

    @FXML
    private Button LinkedIn;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialization code can go here
    }

    @FXML
    private void LinkedIn(ActionEvent event) throws IOException {
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.browse(new URI("https://www.linkedin.com/in/mpmpranavaraj"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
