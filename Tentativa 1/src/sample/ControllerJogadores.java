package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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

    public void comeca(ActionEvent event){
        paneFicha1.setVisible(true);
        lblNome.setText(fichas.get(0).getNome());
        lblClasse.setText(fichas.get(0).getClasse());
        lblMana.setText(Integer.toString(fichas.get(0).getMana()));
        lblXP.setText(Integer.toString(fichas.get(0).getXP()));
    }

    public void pegaArray(ArrayList fichasCadastro){
        fichas  = fichasCadastro;
    }

    public static ArrayList<Ficha> fichas = new ArrayList<>();

    public Label lblNome = new Label();
    public Label lblClasse = new Label();
    public Label lblMana = new Label();
    public Label lblXP = new Label();

    public AnchorPane paneFicha1 = new AnchorPane();

}
