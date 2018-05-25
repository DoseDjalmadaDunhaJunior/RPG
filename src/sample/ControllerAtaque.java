package sample;

import com.jfoenix.controls.JFXComboBox;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ControllerAtaque implements Initializable{
    Ficha f = new Ficha();
    ControllerJogadores j = new ControllerJogadores();

    @FXML

    public void initialize(URL url, ResourceBundle rb) {
        List<String> dados = new ArrayList<String>(jogadores-1);
        for(int i = 0; i < (jogadores); i ++){
            dados.add(fichas.get(i).getNome());
            System.out.println(fichas.get(i).getNome());
        }

        ObservableList<String> jobsOList = FXCollections.observableArrayList(dados);

        combo.setItems(jobsOList);

        lblDano.setText(Integer.toString(dano));
    }

    public void fecha(){
        Platform.exit();
        System.exit(0);
    }

    public void volta() throws Exception{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("jogadores.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void recebeFicha(ArrayList fichas, int jogadores){
        this.fichas = fichas;
        this.jogadores = jogadores;
    }

    public void recebeDano(int dano){
        this.dano = dano;
    }

    public void ataca() throws Exception{
        jogador = combo.getValue();

        for(int i = 0; i < jogadores; i++){
            if(fichas.get(i).getNome() == jogador){
                fichas.get(i).setMana((fichas.get(i).getMana() - dano));
            }
        }

        for(int i = 0; i < jogadores; i++){
            System.out.println(fichas.get(i).getNome());
            System.out.println(fichas.get(i).getMana());
        }



        j.pegaArray(fichas);
        AnchorPane pane = FXMLLoader.load(getClass().getResource("jogadores.fxml"));
        rootPane.getChildren().setAll(pane);
    }



    public AnchorPane rootPane;

    public Label lblDano = new Label();

    public String jogador;

    static public int dano;
    static public int jogadores;

    public static ArrayList<Ficha> fichas = new ArrayList<>();

    public JFXComboBox<String> combo = new JFXComboBox<>();
}
