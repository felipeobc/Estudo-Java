/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.aplicacaoBase.telas;

import br.senac.aplicacaoBase.modelo.Produto;
import br.senac.aplicacaoBase.mock.MockProduto;
import java.net.URL;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author felipe.o.camargo
 */
public class TelaProdutosController {

    @FXML
    private TextField txtCodigo;
    @FXML
    private ComboBox<String> comboEspecie;
    @FXML
    private TextField txtEstoque;
    @FXML
    private Button btnSalvar;
    @FXML
    private TextField txtPesquisa;
    @FXML
    private TextField txtValor;
    
    @FXML
    private TableColumn<Produto, String> colunaCodigo;
    @FXML
    private TableColumn<Produto, String> colunaEspecie;
    @FXML
    private TableColumn<Produto, String> colunaEstoque;
    @FXML
    private TableView<Produto> tabelaProdutos;

    /**
     * Initializes the controller class.
     */

    public void initialize() {
       //Configura as colunas da tabela
        colunaCodigo.setCellValueFactory(
                new PropertyValueFactory("codigo")
            );        
        colunaEspecie.setCellValueFactory(
                new PropertyValueFactory("especie")
            );
        colunaEstoque.setCellValueFactory(
                new PropertyValueFactory("estoque")
            );
        
        //Configura os elementos do combo
        comboEspecie.getItems().addAll(
            "Rosa",
            "Girassol",
            "Margarida"
        );
    }
    
    private boolean editMode = false;
    private Produto produtoEdicao;

    @FXML
    private void acaoLimpar(ActionEvent event) {
        //impa os campos de texto
        editMode = false;
        produtoEdicao = null;
        limparCampos();
    }

    @FXML
    private void acaoSalvar(ActionEvent event) {
        //Trata comportamentos diferentes para inserção e edição
        if (!editMode) {
            //Cria um novo item de modelo de cliente
            Produto produto = new Produto();        

            //Configura os valores no item de modelo
            produto.setCodigo(txtCodigo.getText());
            produto.setEspecie(comboEspecie.getValue());
            produto.setValor(txtValor.getText());
            produto.setEstoque(txtEstoque.getText());    

            //Insere o cliente no mock
            inserirCliente(produto);
            
            //Limpa os campos após a inserção
            limparCampos();
        }
        else {
            //Configura os valores no item de modelo
            produtoEdicao.setCodigo(txtCodigo.getText());
            produtoEdicao.setEspecie(comboEspecie.getValue());
            produtoEdicao.setValor(txtValor.getText());
            produtoEdicao.setEstoque(txtEstoque.getText());
            
            
            
            //Atualiza o cliente no mock
            atualizarCliente(produtoEdicao);
            
            //Limpa os campos após a edição
            limparCampos();
        }
    }

    @FXML
    private void acaoEditar(ActionEvent event) {
        //Obtém o item selecionado da tabela
        Produto produto = tabelaProdutos.getSelectionModel().getSelectedItem();
        
        //Se há um item selecionado, habilita a edição e grava os respectivos
        //dados na variável clienteEdicao para uso posterior
        if (produto != null) {
            
            editMode = true;
            
            produtoEdicao = produto;
            
            //Coloca os dados do cliente selecionado na interface
            txtCodigo.setText(produtoEdicao.getCodigo());
            comboEspecie.setValue(produtoEdicao.getEspecie());
            txtValor.setText(produtoEdicao.getValor());
            txtEstoque.setText(produtoEdicao.getEstoque());
   
            
            //Solicita o foco no campo de CPF
            txtCodigo.requestFocus();
            //Atualiza o título do botão
            btnSalvar.setText("Salvar");
        }
        else {
            //Não há cliente selecionado, exibe uma mensagem de erro
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setContentText("É necessário selecionar um cliente");
            alert.showAndWait();
        }
    }

    @FXML
    private void acaoExcluir(ActionEvent event) {
        //Obtém o item selecionado da tabela
        Produto produto = tabelaProdutos.getSelectionModel().getSelectedItem();
        
        //Se há um item selecionado, habilita a edição e grava os respectivos
        //dados na variável clienteEdicao para uso posterior
        if (produto != null) {
            //Monta e exibe um diálogo de confirmação de exclusão
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Excluir Cliente");
            alert.setContentText("Excluir o cliente " + produto.getNome());
            
            //Mostra o diálogo esperando um resultado
            Optional<ButtonType> result = alert.showAndWait();
            
            //Se o resultado for afirmativo, exclui o cliente
            if (result.get() == ButtonType.OK){
                //Exclui o cliente e atualiza a tabela
                try {
                    excluirCliente(produto);
                    acaoPesquisar(event);
                }
                catch(Exception e) {
                    e.printStackTrace();
                    Alert alertErro = new Alert(AlertType.ERROR);
                    alertErro.setTitle("Erro");
                    alertErro.setContentText("Ocorreu um erro ao excluir"
                            + " o Produto");
                    alertErro.showAndWait();
                }
            }
        }
        else {
            //Não há cliente selecionado, exibe uma mensagem de erro
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setContentText("É necessário selecionar um cliente");
            alert.showAndWait();
        }
    }

    @FXML
    private void acaoPesquisar(ActionEvent event) {
        //Limpa a tabela
        tabelaProdutos.getItems().clear();        
        
        //Obtém os resultados de pesquisa do mock
        List resultados = listarPesquisar();
        
        //Se há resultados, atualiza a tabela
        if (resultados != null) {
            tabelaProdutos.setItems(
                    FXCollections.observableArrayList(resultados)
            );  
        }
    }

    
    
    //Métodos auxiliáres
    private void limparCampos() {
        txtCodigo.setText("");
        comboEspecie.setValue(null);
        btnSalvar.setText("Inserir");
        txtValor.setText("");
        txtEstoque.setText("");        
    }
    
    private void inserirCliente(Produto produto) {
        //Adiciona o cliente
        try {
            MockProduto.inserir(produto);
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Cliente Inserido");
            alert.setContentText("O Cliente foi inserido com sucesso");
            alert.showAndWait();
        }
        catch(Exception e) {
            e.printStackTrace();
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setContentText("Ocorreu um erro ao inserir o cliente");
            alert.showAndWait();
        }
    }
    
    private void atualizarCliente(Produto produtoEdicao) {
        //Atualiza o cliente
        try {
            MockProduto.atualizar(produtoEdicao);
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Cliente Atualizado");
            alert.setContentText("Os dados de cliente foram atualizados"
                    + " com sucesso");
            alert.showAndWait();
            limparCampos();
        }
        catch(Exception e) {
            e.printStackTrace();
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setContentText("Ocorreu um erro ao atualizar o cliente");
            alert.showAndWait();
        }
    }
    
    private List listarPesquisar() {
        //Obtém os itens do mock
        List resultados;
        try {
            //Se há dados para pesquisa, faz uma busca pelo valor no mock
            //Caso contrário, faz a listagem
            if (txtPesquisa.getText().equals("")) {
                resultados = MockProduto.listar();
            }
            else {
                resultados = MockProduto.procurar(txtPesquisa.getText());                
            }
        }
        catch(Exception e) {
            resultados = null;
        }
        return resultados;
    }
    
    private void excluirCliente(Produto produto) throws Exception {
        MockProduto.excluir(produto.getId());
    }

   
    
}
