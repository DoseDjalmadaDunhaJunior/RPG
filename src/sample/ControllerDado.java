package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.util.Random;


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
            txtDado.setDisable(true);
            txtDado.setVisible(false);
            imgDado.setDisable(true);
            imgDado.setVisible(false);

            btn4.setDisable(false);
            btn4.setVisible(true);
            btn6.setDisable(false);
            btn6.setVisible(true);
            btn8.setDisable(false);
            btn8.setVisible(true);
            btn10.setDisable(false);
            btn10.setVisible(true);
            btn12.setDisable(false);
            btn12.setVisible(true);
            btn20.setDisable(false);
            btn20.setVisible(true);

        }


    }

    public void geraDano(ActionEvent event){
        System.out.println(event.getSource());
    }




    public static int qtdDados;
    public JFXTextField txtDado = new JFXTextField();
    public Label lblVerifica = new Label();
    public Label lblTexto = new Label();

    public ImageView imgDado = new ImageView();

    public JFXButton btn4 = new JFXButton();
    public JFXButton btn6 = new JFXButton();
    public JFXButton btn8 = new JFXButton();
    public JFXButton btn10 = new JFXButton();
    public JFXButton btn12 = new JFXButton();
    public JFXButton btn20 = new JFXButton();


    public AnchorPane rootPane;
}
