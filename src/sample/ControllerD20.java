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

public class ControllerD20 implements Initializable {
    @FXML

    public void fecha(){
        Platform.exit();
        System.exit(0);
    }

    public void volta() throws Exception{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("jogadores.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void initialize(URL url, ResourceBundle rb) {
        if(valor < 10){
            lblValor.setText("0" + Integer.toString(valor));
        }
        else{
            lblValor.setText(Integer.toString(valor));
        }

        if(valor >= 1 && valor <= 2){
            lblResultado.setText("FALHA CRÍTICA");
        }

        if(valor > 3 && valor <= 10){
            lblResultado.setText("FALHOU");
        }

        if(valor > 11 && valor <= 18){
            lblResultado.setText("ACERTOU");
        }

<<<<<<< HEAD
        if(valor >= 19 && valor <= 20){
=======
        if(valor > 19 && valor <= 20){
>>>>>>> master
            lblResultado.setText("ACERTO CRÍTICO");
        }


    }

    public void setaleatorio(int x){

        valor = x;
    }

    public void cancela(ActionEvent event) throws Exception{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("jogadores.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void realizar(ActionEvent event) throws Exception{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("dado.fxml"));
        rootPane.getChildren().setAll(pane);
    }


    public static int valor;
    public Label lblValor = new Label();
    public Label lblResultado = new Label();


    public AnchorPane rootPane;


}
