package br.senac.aplicacaoBase.telas;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class TelaSobreController {

    @FXML
    private Button botaoSair;
    
    @FXML
    public void sair() {
        // Obtém o stage (janela)
        Stage stage = (Stage) botaoSair.getScene().getWindow();
        // Manda fechar a janela
        stage.close();
    }
}
