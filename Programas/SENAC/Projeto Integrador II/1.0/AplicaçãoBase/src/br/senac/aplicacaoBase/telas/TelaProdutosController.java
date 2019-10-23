/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.aplicacaoBase.telas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author felipe.o.camargo
 */
public class TelaProdutosController implements Initializable {

    @FXML
    private TextField txtCodigo;
    @FXML
    private ComboBox<?> comboEspecie;
    @FXML
    private TextField txtEstoque;
    @FXML
    private TableColumn<?, ?> colunaCodigo;
    @FXML
    private TableColumn<?, ?> colunaEspecie;
    @FXML
    private TableColumn<?, ?> colunaEstoque;
    @FXML
    private Button btnSalvar;
    @FXML
    private TextField txtPesquisa;
    @FXML
    private TextField txtValor;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void acaoLimpar(ActionEvent event) {
    }

    @FXML
    private void acaoSalvar(ActionEvent event) {
    }

    @FXML
    private void acaoEditar(ActionEvent event) {
    }

    @FXML
    private void acaoExcluir(ActionEvent event) {
    }

    @FXML
    private void acaoPesquisar(ActionEvent event) {
    }
    
}
