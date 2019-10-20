package br.senac.aplicacaoBase.aplicacao;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Aplicacao extends Application {

    /**
     *
     * @param stage
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        Parent telaCadastro = FXMLLoader.load(
                getClass().getResource(
                        "/br/senac/aplicacaoBase/telas/TelaInicial.fxml"
                )
        );
        
        Scene scene = new Scene(telaCadastro);
        
        stage.setScene(scene);
        stage.setTitle("Aplicação Base");
        stage.setMinHeight(438);
        stage.setMinWidth(622);
        
        stage.show();
    }   
    
}
