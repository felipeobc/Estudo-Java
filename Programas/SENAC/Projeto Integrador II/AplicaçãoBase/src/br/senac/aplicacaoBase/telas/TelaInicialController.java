package br.senac.aplicacaoBase.telas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TelaInicialController {
    private Stage clienteStage;
    private Stage sobreStage;
    
    @FXML
    public void abrirTelaClientes() throws Exception {
        if (clienteStage == null || !clienteStage.isShowing()) {
            Parent telaCadastro = FXMLLoader.load(
                    getClass().getResource(
                            "/br/senac/aplicacaoBase/telas/TelaClientes.fxml"
                    )
            );

            clienteStage = new Stage();
            Scene scene = new Scene(telaCadastro);

            clienteStage.setScene(scene);
            clienteStage.setTitle("Clientes");
            clienteStage.setMinHeight(380);
            clienteStage.setMinWidth(812);
            clienteStage.show();
        }
        clienteStage.toFront();
    }

    @FXML
    private void abrirTelaSobre(ActionEvent event) throws Exception {
        if (sobreStage == null || !sobreStage.isShowing()) {
            Parent telaCadastro = FXMLLoader.load(
                    getClass().getResource(
                            "/br/senac/aplicacaoBase/telas/TelaSobre.fxml"
                    )
            );

            sobreStage = new Stage();
            Scene scene = new Scene(telaCadastro);

            sobreStage.setScene(scene);
            sobreStage.setTitle("Sobre");
            sobreStage.setMinHeight(315);
            sobreStage.setMinWidth(343);
            sobreStage.show();
        }
        sobreStage.toFront();
    }
    
}
