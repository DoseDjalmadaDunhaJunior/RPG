package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerAtaque {
    @FXML

    public void fecha(){
        Platform.exit();
        System.exit(0);
    }

    public void volta() throws Exception{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("dado.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public AnchorPane rootPane;
}
