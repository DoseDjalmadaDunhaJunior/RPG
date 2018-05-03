package sample;

import com.jfoenix.controls.JFXTextField;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;

public class ControllerCadastro {
    Ficha f = new Ficha();
    ArrayList<Ficha> fichas = new ArrayList<>();

    @FXML

    public void fecha(){
        Platform.exit();
        System.exit(0);
    }

    public void setQuantidade(int x){
        xDaqui = x;
        System.out.println("Esse é o X que eu to setando: " + xDaqui);
        System.out.println("Esse é o X que eu to recebendo: " + x);

    }

    public void getQuantidade(){
        System.out.println("Esse é o X daqui: " + xDaqui);
    }

    public void proximo(){
        if(btnConfirma.getText() == "COMEÇAR"){
            return;
        }
        if(i == xDaqui - 1){
            btnConfirma.setText("COMEÇAR");
        }

        fichas.add(new Ficha((Integer.parseInt(txtMana.getText())), txtNome.getText(), txtClasse.getText(), (Integer.parseInt(txtXP.getText()))));


        if(i < xDaqui - 1){
            i++;
            labelJogador.setText(Integer.toString(i+1) + "º JOGADOR");
            txtMana.setText("");
            txtNome.setText("");
            txtClasse.setText("");
            txtXP.setText("");
        }

    }

    public void mostrarTudo(){
        for(int a = 0; a < fichas.size(); a++){
            System.out.println((a+1) + "º Jogador:");
            System.out.println(fichas.get(a).getNome());
            System.out.println(fichas.get(a).getClasse());
            System.out.println(fichas.get(a).getMana());
            System.out.println(fichas.get(a).getXP());
            System.out.println("\n");
        }
    }

    static private int xDaqui;
    public int i = 0;

    public Label labelJogador = new Label();
    public Button btnConfirma = new Button();
    public JFXTextField txtMana = new JFXTextField();
    public JFXTextField txtNome = new JFXTextField();
    public JFXTextField txtXP = new JFXTextField();
    public JFXTextField txtClasse = new JFXTextField();

}
