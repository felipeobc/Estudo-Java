package br.senac.aplicacaoBase.telas;

import br.senac.aplicacaoBase.mock.MockCliente;
import br.senac.aplicacaoBase.modelo.Cliente;
import java.util.List;
import java.util.Optional;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class TelaClientesController {

    //Componentes da tela
    @FXML
    private TextField txtNome;
    @FXML
    private TextField txtPesquisa;
    @FXML
    private TextField txtSobrenome;
    @FXML
    private DatePicker dpDataNasc;
    @FXML
    private ComboBox<String> comboGenero;
    @FXML
    private TextField txtCpf;    
    @FXML
    private TextField txtEndereco;
    @FXML
    private TextField txtEC;
    @FXML
    private TextField txtTelefone;
    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtRG;
    @FXML
    private Button btnSalvar;
    
    
    
    //Elementos da tabela
    @FXML
    private TableView<Cliente> tabelaClientes;
    @FXML
    private TableColumn<Cliente, String> colunaCpf;
    @FXML
    private TableColumn<Cliente, String> colunaNome;
    
    //Elementos de controle
    private boolean editMode = false;
    private Cliente clienteEdicao;
    
        
    //Método executado automaticamente na inicialização pelo JavaFX
    public void initialize() {
        //Configura as colunas da tabela
        colunaCpf.setCellValueFactory(
                new PropertyValueFactory("cpf")
            );        
        colunaNome.setCellValueFactory(
                new PropertyValueFactory("nome")
            );
        
        //Configura os elementos do combo
        comboGenero.getItems().addAll(
            "Feminino",
            "Masculino",
            "Outro"
        );
    }
    
    //Ações de botões
    @FXML
    private void acaoSalvar(ActionEvent event) {
        //Trata comportamentos diferentes para inserção e edição
        if (!editMode) {
            //Cria um novo item de modelo de cliente
            Cliente cliente = new Cliente();        

            //Configura os valores no item de modelo
            cliente.setCpf(txtCpf.getText());
            cliente.setNome(txtNome.getText());
            cliente.setSobrenome(txtSobrenome.getText());
            cliente.setDataNascimento(dpDataNasc.getValue());
            cliente.setGenero(comboGenero.getValue());
            cliente.setEndereco(txtEndereco.getText());
            cliente.setEC(txtEC.getText());
            cliente.setEmail(txtEmail.getText());
            cliente.setRG(txtRG.getText());
            cliente.setTelefone(txtTelefone.getText());
            

            //Insere o cliente no mock
            inserirCliente(cliente);
            
            //Limpa os campos após a inserção
            limparCampos();
        }
        else {
            //Configura os valores no item de modelo
            clienteEdicao.setCpf(txtCpf.getText());
            clienteEdicao.setNome(txtNome.getText());
            clienteEdicao.setSobrenome(txtSobrenome.getText());
            clienteEdicao.setDataNascimento(dpDataNasc.getValue());
            clienteEdicao.setGenero(comboGenero.getValue());
            clienteEdicao.setEndereco(txtEndereco.getText());
            clienteEdicao.setEC(txtEC.getText());
            clienteEdicao.setEmail(txtEmail.getText());
            clienteEdicao.setRG(txtRG.getText());
            clienteEdicao.setTelefone(txtTelefone.getText());
            
            
            //Atualiza o cliente no mock
            atualizarCliente(clienteEdicao);
            
            //Limpa os campos após a edição
            limparCampos();
        }
    }

    @FXML
    private void acaoLimpar(ActionEvent event) {
        //Limpa os campos de texto
        editMode = false;
        clienteEdicao = null;
        limparCampos();        
    }    

    @FXML
    private void acaoPesquisar(ActionEvent event) {
        //Limpa a tabela
        tabelaClientes.getItems().clear();        
        
        //Obtém os resultados de pesquisa do mock
        List resultados = listarPesquisar();
        
        //Se há resultados, atualiza a tabela
        if (resultados != null) {
            tabelaClientes.setItems(
                    FXCollections.observableArrayList(resultados)
            );  
        }
    }

    @FXML
    private void acaoEditar(ActionEvent event) {
        //Obtém o item selecionado da tabela
        Cliente cliente = tabelaClientes.getSelectionModel().getSelectedItem();
        
        //Se há um item selecionado, habilita a edição e grava os respectivos
        //dados na variável clienteEdicao para uso posterior
        if (cliente != null) {
            
            editMode = true;
            
            clienteEdicao = cliente;
            
            //Coloca os dados do cliente selecionado na interface
            txtCpf.setText(clienteEdicao.getCpf());
            txtNome.setText(clienteEdicao.getNome());
            txtSobrenome.setText(clienteEdicao.getSobrenome());
            dpDataNasc.setValue(clienteEdicao.getDataNascimento());
            comboGenero.setValue(clienteEdicao.getGenero());
            txtEndereco.setText(clienteEdicao.getEndereco());
            txtEC.setText(clienteEdicao.getEC());
            txtEmail.setText(clienteEdicao.getEmail());
            txtRG.setText(clienteEdicao.getRG());
            txtTelefone.setText(clienteEdicao.getTelefone());
            
            //Solicita o foco no campo de CPF
            txtCpf.requestFocus();
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
        Cliente cliente = tabelaClientes.getSelectionModel().getSelectedItem();
        
        //Se há um item selecionado, habilita a edição e grava os respectivos
        //dados na variável clienteEdicao para uso posterior
        if (cliente != null) {
            //Monta e exibe um diálogo de confirmação de exclusão
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Excluir Cliente");
            alert.setContentText("Excluir o cliente " + cliente.getNome());
            
            //Mostra o diálogo esperando um resultado
            Optional<ButtonType> result = alert.showAndWait();
            
            //Se o resultado for afirmativo, exclui o cliente
            if (result.get() == ButtonType.OK){
                //Exclui o cliente e atualiza a tabela
                try {
                    excluirCliente(cliente);
                    acaoPesquisar(event);
                }
                catch(Exception e) {
                    e.printStackTrace();
                    Alert alertErro = new Alert(AlertType.ERROR);
                    alertErro.setTitle("Erro");
                    alertErro.setContentText("Ocorreu um erro ao excluir"
                            + " o cliente");
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
    
    //Métodos auxiliáres
    private void limparCampos() {
        txtCpf.setText("");
        txtNome.setText("");
        txtSobrenome.setText("");
        dpDataNasc.setValue(null);
        comboGenero.setValue(null);
        btnSalvar.setText("Inserir");
        txtEndereco.setText("");
        txtEC.setText("");
        txtEmail.setText("");
        txtRG.setText("");
        txtTelefone.setText("");
        
    }    

    //Operações de negócio
    private void inserirCliente(Cliente cliente) {
        //Adiciona o cliente
        try {
            MockCliente.inserir(cliente);
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
    
    private void excluirCliente(Cliente cliente) throws Exception {
        MockCliente.excluir(cliente.getId());
    }
    
    private void atualizarCliente(Cliente clienteEdicao) {
        //Atualiza o cliente
        try {
            MockCliente.atualizar(clienteEdicao);
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
                resultados = MockCliente.listar();
            }
            else {
                resultados = MockCliente.procurar(txtPesquisa.getText());                
            }
        }
        catch(Exception e) {
            e.printStackTrace();
            resultados = null;
        }
        return resultados;
    }
}
