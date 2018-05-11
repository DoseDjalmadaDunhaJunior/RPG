package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import javax.swing.text.html.ImageView;
import java.util.ArrayList;

// SE VOCÊ ABRIU ESSE AQUIVO PRIMEIRO, LEIA O CONTROLLERSAMPLE E O CONTROLLERCADASTRO PRIMEIRO, NESSA ORDEM, PARA ENTENDER ESSE
// SE VOCÊ ABRIU ESSE AQUIVO PRIMEIRO, LEIA O CONTROLLERSAMPLE E O CONTROLLERCADASTRO PRIMEIRO, NESSA ORDEM, PARA ENTENDER ESSE
// SE VOCÊ ABRIU ESSE AQUIVO PRIMEIRO, LEIA O CONTROLLERSAMPLE E O CONTROLLERCADASTRO PRIMEIRO, NESSA ORDEM, PARA ENTENDER ESSE
// SE VOCÊ ABRIU ESSE AQUIVO PRIMEIRO, LEIA O CONTROLLERSAMPLE E O CONTROLLERCADASTRO PRIMEIRO, NESSA ORDEM, PARA ENTENDER ESSE
// SE VOCÊ ABRIU ESSE AQUIVO PRIMEIRO, LEIA O CONTROLLERSAMPLE E O CONTROLLERCADASTRO PRIMEIRO, NESSA ORDEM, PARA ENTENDER ESSE

// ESSE NÃO TÁ COMENTADO POIS VOCÊS VÃO COMENTAR E ME MANDAR

public class ControllerJogadores {
    Ficha f = new Ficha();
    @FXML

    public void fecha(){
        Platform.exit();
        System.exit(0);
    }

    public void volta() throws Exception{
        fichas.removeAll(fichas);
        AnchorPane pane = FXMLLoader.load(getClass().getResource("cadastro.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void jogaDado(ActionEvent event) throws Exception{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("dado.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void comeca(ActionEvent event){
       int i = 0;

       paneFicha1.setVisible(true);
       lblNomeJogador1.setText(fichas.get(i).getNome());
       lblClasseJogador1.setText(fichas.get(i).getClasse());
       lblManaJogador1.setText(Integer.toString(fichas.get(i).getMana()));
       lblXPJogador1.setText(Integer.toString(fichas.get(i).getXP()));
       i++;

       if(i < fichas.size()){
           paneFicha2.setVisible(true);
           lblNomeJogador2.setText(fichas.get(i).getNome());
           lblClasseJogador2.setText(fichas.get(i).getClasse());
           lblManaJogador2.setText(Integer.toString(fichas.get(i).getMana()));
           lblXPJogador2.setText(Integer.toString(fichas.get(i).getXP()));
           i++;
       }

        if(i < fichas.size()){
            paneFicha3.setVisible(true);
            lblNomeJogador3.setText(fichas.get(i).getNome());
            lblClasseJogador3.setText(fichas.get(i).getClasse());
            lblManaJogador3.setText(Integer.toString(fichas.get(i).getMana()));
            lblXPJogador3.setText(Integer.toString(fichas.get(i).getXP()));
            i++;
        }

        if(i < fichas.size()){
            paneFicha4.setVisible(true);
            lblNomeJogador4.setText(fichas.get(i).getNome());
            lblClasseJogador4.setText(fichas.get(i).getClasse());
            lblManaJogador4.setText(Integer.toString(fichas.get(i).getMana()));
            lblXPJogador4.setText(Integer.toString(fichas.get(i).getXP()));
            i++;
        }

        if(i < fichas.size()){
            paneFicha5.setVisible(true);
            lblNomeJogador5.setText(fichas.get(i).getNome());
            lblClasseJogador5.setText(fichas.get(i).getClasse());
            lblManaJogador5.setText(Integer.toString(fichas.get(i).getMana()));
            lblXPJogador5.setText(Integer.toString(fichas.get(i).getXP()));
            i++;
        }

        if(i < fichas.size()){
            paneFicha6.setVisible(true);
            lblNomeJogador6.setText(fichas.get(i).getNome());
            lblClasseJogador6.setText(fichas.get(i).getClasse());
            lblManaJogador6.setText(Integer.toString(fichas.get(i).getMana()));
            lblXPJogador6.setText(Integer.toString(fichas.get(i).getXP()));
            i++;
        }

        btnComecar.setDisable(true);

    }

    public void pegaArray(ArrayList fichasCadastro){
        fichas  = fichasCadastro;
    }

    public static ArrayList<Ficha> fichas = new ArrayList<>();
    public static ArrayList<AnchorPane> panes = new ArrayList<AnchorPane>();

    //int fiz = 0;

    public Label lblNomeJogador1 = new Label();
    public Label lblClasseJogador1 = new Label();
    public Label lblManaJogador1 = new Label();
    public Label lblXPJogador1 = new Label();

    public Label lblNomeJogador2 = new Label();
    public Label lblClasseJogador2 = new Label();
    public Label lblManaJogador2 = new Label();
    public Label lblXPJogador2 = new Label();

    public Label lblNomeJogador3 = new Label();
    public Label lblClasseJogador3 = new Label();
    public Label lblManaJogador3 = new Label();
    public Label lblXPJogador3 = new Label();

    public Label lblNomeJogador4 = new Label();
    public Label lblClasseJogador4 = new Label();
    public Label lblManaJogador4 = new Label();
    public Label lblXPJogador4 = new Label();

    public Label lblNomeJogador5 = new Label();
    public Label lblClasseJogador5 = new Label();
    public Label lblManaJogador5 = new Label();
    public Label lblXPJogador5 = new Label();

    public Label lblNomeJogador6 = new Label();
    public Label lblClasseJogador6 = new Label();
    public Label lblManaJogador6 = new Label();
    public Label lblXPJogador6 = new Label();

    public AnchorPane paneFicha1 = new AnchorPane();
    public AnchorPane paneFicha2 = new AnchorPane();
    public AnchorPane paneFicha3 = new AnchorPane();
    public AnchorPane paneFicha4 = new AnchorPane();
    public AnchorPane paneFicha5 = new AnchorPane();
    public AnchorPane paneFicha6 = new AnchorPane();

    public Button btnComecar = new Button();

    public AnchorPane rootPane;

}
