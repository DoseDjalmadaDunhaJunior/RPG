package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;

public class Controller {
    public void Teste(ActionEvent teste){
        System.out.println("Cliquei no botão de teste");
    }

    public void Outro(ActionEvent teste){
        System.out.println("Agora cliquei no botão outro");
    }

    public void Fecha(){
        Platform.exit();
        System.exit(0);
    }
}
