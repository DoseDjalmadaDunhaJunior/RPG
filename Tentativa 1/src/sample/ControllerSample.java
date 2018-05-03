package sample;

import com.jfoenix.controls.JFXTextField;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class ControllerSample {
    @FXML

    ControllerCadastro c = new ControllerCadastro();

    public void fecha(){
        Platform.exit();
        System.exit(0);
    }

    public void formCadastra(ActionEvent event) throws Exception{
        String x = txtQuant.getText();

        setQuantJogadores(Integer.parseInt(x));


        if(quantJogadores > 6 || quantJogadores < 2){
            lblVerifica.setVisible(true);
            txtQuant.setText("");
        }
        else{
            AnchorPane pane = FXMLLoader.load(getClass().getResource("cadastro.fxml"));
            rootPane.getChildren().setAll(pane);
          //  getQuantidade();
          //  System.out.println("Tô mandando esse X aqui ó: " + getQuantidade());
            c.setQuantidade(getQuantidade());
        }


    }

    public int getQuantidade(){
        x = getQuantJogadores();
        //System.out.println(x);
        return x;
    }

    public void setQuantJogadores(int quant){
        quantJogadores = quant;
        //System.out.println(quant);
    }

    public int getQuantJogadores(){
        //System.out.println(quantJogadores);
        return quantJogadores;
    }

    private int i = 1;
    static private int quantJogadores;
    public int x;

    public Label lblVerifica = new Label();
    public AnchorPane rootPane;
    public JFXTextField txtQuant = new JFXTextField();
}
