package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;


public class ControllerDado implements Initializable {

    ControllerAtaque a = new ControllerAtaque();

    @FXML


    public void initialize(URL url, ResourceBundle rb) {

        List<String> dados = new ArrayList<String>(6);
        dados.add("4");
        dados.add("6");
        dados.add("8");
        dados.add("10");
        dados.add("12");
        dados.add("20");

        ObservableList<String> jobsOList = FXCollections.observableArrayList(dados);

        combo.setItems(jobsOList);

    }


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
            lblVerifica.setVisible(false);

            combo.setDisable(false);
            combo.setVisible(true);
            btnConfirma.setDisable(true);
            btnConfirma.setVisible(false);
            btnConfirma2.setDisable(false);
            btnConfirma2.setVisible(true);
        }


    }

    public void geraDano(ActionEvent event) throws Exception{
        Random r = new Random();

        String x = combo.getValue();
        int xy = Integer.parseInt(x);
        dano = 0;
        for(int i = 0; i < qtdDados; i++){
            dado = dado + r.nextInt((xy + 1));
            System.out.println(dado);
        }


        //System.out.println(dado);

        a.recebeDano(dado);

        AnchorPane pane = FXMLLoader.load(getClass().getResource("ataque.fxml"));
        rootPane.getChildren().setAll(pane);
    }



    public static int dado = 0;
    public static int dano;
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
    public JFXButton btnConfirma = new JFXButton();
    public JFXButton btnConfirma2 = new JFXButton();

    public JFXComboBox<String> combo = new JFXComboBox<>();

    public AnchorPane rootPane;
}
