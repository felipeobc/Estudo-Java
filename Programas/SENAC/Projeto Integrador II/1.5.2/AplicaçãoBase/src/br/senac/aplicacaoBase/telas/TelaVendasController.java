/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.aplicacaoBase.telas;

import br.senac.aplicacaoBase.mock.MockProduto;
import br.senac.aplicacaoBase.mock.MockCliente;
import br.senac.aplicacaoBase.modelo.Cliente;
import br.senac.aplicacaoBase.modelo.Produto;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author felipe.o.camargo
 */
public class TelaVendasController {

    @FXML
    private ComboBox<String> comboVendas;
    @FXML
    private Text qtdeEstoque;
    @FXML
    private Spinner<?> qtdeProdutos;
    @FXML
    private Text qtdeValor;
    @FXML
    private TableColumn<?, ?> colunaProduto;
    @FXML
    private TableColumn<?, ?> colunaQtdeProduto;
    @FXML
    private TableColumn<?, ?> colunaValorTotal;
    @FXML
    private TableColumn<?, ?> colunaCliente;
    @FXML
    private TextField txtPesquisa;
    @FXML
    private TableView<?> tabelaVendas;
    @FXML
    private Text txtCliente;

    /**
     * Initializes the controller class.
     * @param rb
     */
    
    public void initialize() {
        
        try{
            List<Produto> listaProduto = MockProduto.listar();
            for(int i = 0; i < listaProduto.size(); i++){
                Produto produto = listaProduto.get(i);
                comboVendas.getItems().add(produto.getEspecie());
            }
                
            
        }catch(Exception e){
            
        }
    }    

    @FXML
    private void addCarrinho(ActionEvent event) {
    }

    @FXML
    private void finalizarCompra(ActionEvent event) {
    }

    @FXML
    private void excluirItem(ActionEvent event) {
    }

    @FXML
    private void editarItem(ActionEvent event) {
    }

    @FXML
    private void acaoPesquisar(ActionEvent event) {
    }
    
}
