package br.senac.aplicacaoBase.telas;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TelaInicialController {
    private Stage clienteStage;
    private Stage sobreStage;
    private Stage produtoStage;
    private Stage vendasStage;
    
    /**
     *
     * @throws Exception
     */
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

    @FXML
    private void abrirTelaProdutos(ActionEvent event) throws Exception {
        if (produtoStage == null || !produtoStage.isShowing()) {
            Parent telaCadastro = FXMLLoader.load(
                    getClass().getResource(
                            "/br/senac/aplicacaoBase/telas/TelaProdutos.fxml"
                    )
            );

            produtoStage = new Stage();
            Scene scene = new Scene(telaCadastro);

            produtoStage.setScene(scene);
            produtoStage.setTitle("Produtos");
            produtoStage.setMinHeight(380);
            produtoStage.setMinWidth(812);
            produtoStage.show();
        }
        produtoStage.toFront();
    }

    @FXML
    private void abrirTelaVendas(ActionEvent event) throws Exception {
        if (vendasStage == null || !vendasStage.isShowing()) {
            Parent telaCadastro = FXMLLoader.load(
                    getClass().getResource(
                            "/br/senac/aplicacaoBase/telas/telaVendas.fxml"
                    )
            );

            vendasStage = new Stage();
            Scene scene = new Scene(telaCadastro);

            vendasStage.setScene(scene);
            vendasStage.setTitle("Sobre");
            vendasStage.setMinHeight(315);
            vendasStage.setMinWidth(343);
            vendasStage.show();
        }
        sobreStage.toFront();
    }
    
}
