package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    // Isso aqui é o começo, nunca vai mudar, então não se preocupem
    @Override
    public void start(Stage primaryStage) throws Exception{
        // Essa linha define o que vai ser carregado (qual arquivo no caso)
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        // Essa linha aqui tira a borda dele, por isso que não aparecem os controles padrão da janela (minimizar, maximixar e fechar)
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        // As linhas abaixo definem a tela e fazem ela aparecer
        Scene scene = new Scene(root);
        primaryStage.setTitle("RPG");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
