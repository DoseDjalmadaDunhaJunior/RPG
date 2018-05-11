package sample;

import com.jfoenix.controls.JFXTextField;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;


public class ControllerDado {
    @FXML

    public void fecha(){
        Platform.exit();
        System.exit(0);
    }

    public void volta() throws Exception{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("jogadores.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void confirmaDado(ActionEvent event){
        if(Integer.parseInt(txtDado.getText()) > 6 || Integer.parseInt(txtDado.getText()) < 1){
            lblVerifica.setVisible(true);
        }
        else{
            qtdDados = Integer.parseInt(txtDado.getText());
            lblTexto.setText("ESCOLHA O DADO QUE DESEJA JOGAR");
        }


    }

    public static int qtdDados;
    public JFXTextField txtDado = new JFXTextField();
    public Label lblVerifica = new Label();
    public Label lblTexto = new Label();

    public AnchorPane rootPane;
}
