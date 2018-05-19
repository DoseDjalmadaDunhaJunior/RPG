package sample;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
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
import java.util.Collection;
import java.util.List;
import java.util.ResourceBundle;

public class ControllerSample{
    // Esse @ é obrigatŕio pra que a classe em .java entenda que ela tá lidando com um arquivo FXML
    @FXML




    // Aqui eu to instanciando a classe ControllerCadastro porque vou precisar dela para que ela seja renderizada
    ControllerCadastro c = new ControllerCadastro();

    // Aqui é só uma função pra fechar a tela, já que eu mandei os controles ficarem escondidos. É a imagem de um X na tela que chama essa função.
    public void fecha(){
        Platform.exit();
        System.exit(0);

    }

    // Esse é o evento que cadastra a quantidade de pessoas. É uma regra que tenha o ActionEvent quando se é uma função que um botão usa
    // O throws é obrigatório apenas se a função vai trocar a tela, como ocore aqui
    public void formCadastra(ActionEvent event) throws Exception{
        // Aqui, uma variável que pega o texto da caixa na tela. Lembrando que o txtQuant é o nome que dou pra caixa de texto na tela
        String x = txtQuant.getText();

        // Aqui, é uma função que pega o número digitado
        // O Integer.parseInt() transforma o que estiver dentro do parenteses em int, pois a variável da quantidade de jogadores é int
        setQuantJogadores(Integer.parseInt(x));

        // Aqui eu apenas verifico se a pessoa entrou com um intervalo válido
        if(quantJogadores > 6 || quantJogadores < 2){
            // Aqui eu faço a label que exibe a mensagem "Apenas entre 2 e 6" ficar visível. A mesma ideia, tem que ter o mesmo nome lá e aqui
            lblVerifica.setVisible(true);
            // Aqui eu apago o que o usuário digitou
            txtQuant.setText("");
        }
        else{
            // Aqui eu renderizo a página de cadastro caso a pessoa entre com um número válido
            AnchorPane pane = FXMLLoader.load(getClass().getResource("cadastro.fxml"));
            // Essa linha é obrigatória pra renderizar uma página partindo de outra
            rootPane.getChildren().setAll(pane);
          //  getQuantidade();
          //  System.out.println("Tô mandando esse X aqui ó: " + getQuantidade());

            // Aqui, uso a classe instanciada ali em cima, a ControllerCadastro, para enviar a quantidade de jogadores
            c.setQuantidade(getQuantidade());
        }


    }

    // A função que me retorna a quantidade de jogadores
    public int getQuantidade(){
        x = getQuantJogadores();
        //System.out.println(x);
        return x;
    }

    // A função que seta a quantidade de jogadores
    public void setQuantJogadores(int quant){
        quantJogadores = quant;
        //System.out.println(quant);
    }

    // A função que retorna a quantidade de jogadores
    // Sim, ficou redundante mas foram testes, assim funciona do mesmo jeito
    public int getQuantJogadores(){
        //System.out.println(quantJogadores);
        return quantJogadores;
    }

    // A variável da quantidade de jogadores
    // Ela PRECISA ser static, pois quando se passa uma váriável de uma tela para a outra no FXML, ela zera
    // Sendo static, a variável mantém o valor dela
    static private int quantJogadores;
    public int x;

    // Aqui, instancio os objetos que tenho na tela
    // Eles PRECISAM ter o mesmo nome aqui e lá na tela, num campo chamado fx::id
    // Quando forem fazem, cuidado, são necessários imports, e tem uns de java.awt (do java swing) e outros de java.fx (do JavaFX), que é o que estamos usando
    // Importem os de JavaFX, caso contrário, não funciona
    public Label lblVerifica = new Label();
    // Esse aqui é necessário pois sem ele, o comando de troca de tela não sabe onde ele tem que renderizar a nova tela
    public AnchorPane rootPane;
    public JFXTextField txtQuant = new JFXTextField();

    public JFXRadioButton opcoes = new JFXRadioButton();

    public JFXComboBox<String> combo = new JFXComboBox<String>();
}
