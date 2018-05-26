package sample;

import com.jfoenix.controls.JFXProgressBar;
import com.jfoenix.controls.JFXTextField;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;


// SE VOCÊ ABRIU ESSE ARQUIVO PRIMEIRO, LEIA O CONTROLLERSAMPLE PRIMEIRO PARA CONSEGUIR ENTENDER ESSE
// SE VOCÊ ABRIU ESSE ARQUIVO PRIMEIRO, LEIA O CONTROLLERSAMPLE PRIMEIRO PARA CONSEGUIR ENTENDER ESSE
// SE VOCÊ ABRIU ESSE ARQUIVO PRIMEIRO, LEIA O CONTROLLERSAMPLE PRIMEIRO PARA CONSEGUIR ENTENDER ESSE
// SE VOCÊ ABRIU ESSE ARQUIVO PRIMEIRO, LEIA O CONTROLLERSAMPLE PRIMEIRO PARA CONSEGUIR ENTENDER ESSE
// SE VOCÊ ABRIU ESSE ARQUIVO PRIMEIRO, LEIA O CONTROLLERSAMPLE PRIMEIRO PARA CONSEGUIR ENTENDER ESSE
// SE VOCÊ ABRIU ESSE ARQUIVO PRIMEIRO, LEIA O CONTROLLERSAMPLE PRIMEIRO PARA CONSEGUIR ENTENDER ESSE


public class ControllerCadastro {
    // Aqui, instancio a classe Ficha, é momentâneo, fiz para testes
    Ficha f = new Ficha();
    // Aqui armazeno a quantJogadores que vou receber em fichas
    public static ArrayList<Ficha> fichas = new ArrayList<>();

    @FXML

    ControllerJogadores j = new ControllerJogadores();
    ControllerAtaque a = new ControllerAtaque();

    //A função que fecha
    public void fecha(){
        Platform.exit();
        System.exit(0);
    }

    public void volta() throws Exception{
        fichas.removeAll(fichas);
        AnchorPane pane = FXMLLoader.load(getClass().getResource("sample.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    // AQui, seto a quantidade de jogadores (quantJogadores) na variável xDaqui
    public void setQuantidade(int x){
        xDaqui = x;
       // System.out.println("Esse é o X que eu to setando: " + xDaqui);
     //   System.out.println("Esse é o X que eu to recebendo: " + x);

    }

    // Essa é a função que faz o cadastro de jogadores, lembrando, sempre com o ActionEvent e o throws Exception pois esse também renderiza outro
    public void proximo(ActionEvent event) throws Exception{
        // Toda vez que entro nessa função, chamada pelo botão OK na tela de cadastro, preencho mais um espaço no ArrayList de fichas, pegando os valores das caixas de texto
        fichas.add(new Ficha((Integer.parseInt(txtMana.getText())), txtNome.getText(), txtClasse.getText(), (Integer.parseInt(txtXP.getText())),(Integer.parseInt(txtIntl.getText()))));

        // Essa é uma verificação pra confirmar que eu não cheguei no número máximo de pessoas cadastradas
        // -1 pois o usuário entra com um número X porém o ArrayList começa em 0, logo, diminuo um no final
        if(i < xDaqui - 1){
            // É uma variável que soma mais um apenas, pra eu não perder a conta de jogadores e pedir informações infinitamente
            i++;
            // Essa linha faz a mudança da label no topo de X jogador para o próximo, até o numero máximo de jogadores cadastrados
            //+1 pois novamente, o indice i começa em 0, porém O USUÁRIO começa a contar em 1
            labelJogador.setText(Integer.toString(i+1) + "º JOGADOR");
            // Aqui abaixo, xero os textos de tudo que o usuário já tenha entrado
            txtMana.setText("");
            txtNome.setText("");
            txtClasse.setText("");
            txtXP.setText("");
            txtIntl.setText("");
        }

        // *******LEIA A EXPLICAÇÂO DO ELSE IF ABAIXO PRIMEIRO******* Aqui, eu faço a mudança de página caso o botão esteja em "começar", para que o usuário não fique preenchendo espaços vazios no ArrayList
        if(btnConfirma.getText() == "COMEÇAR"){
            // Aqui eu carrego a póxima página
            j.pegaArray(fichas);
            a.recebeFicha(fichas, xDaqui);
            AnchorPane pane = FXMLLoader.load(getClass().getResource("jogadores.fxml"));
            rootPane.getChildren().setAll(pane);
            //return;
            // Aqui, eu passo o Array de fichas para a página de Jogadores, para que ela seja capaz de ver os usuários cadastrados

        }
        // Nessa parte aqui eu troco o texto do botão de OK paa COMEÇAR caso o cadastro tenha chegado no índice correspondente ao último na quantidade de cadastrados
        // Novamente, o -1 pois se trata de um ArrayList
        else if(i == xDaqui - 1){
            btnConfirma.setText("COMEÇAR");
        }



    }

    // Isso aqui é do botão listar, mas ele bem vai aparecer no projeto final
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

    // A variável é static pois é obrigatório na variável que recebe também, para que o valor não seja perdido
    static private int xDaqui;

    // Contador que uso para passar pela quantidade de jogadores
    public int i = 0;


    // Instanciando os objetos aqui
    public Label labelJogador = new Label();
    public Button btnConfirma = new Button();
    public JFXTextField txtMana = new JFXTextField();
    public JFXTextField txtNome = new JFXTextField();
    public JFXTextField txtXP = new JFXTextField();
    public JFXTextField txtClasse = new JFXTextField();
    public JFXTextField txtIntl = new JFXTextField();


    // Isso aqui é necessário porque sem ele não consigo renderizar a outra tela
    public AnchorPane rootPane;

}
