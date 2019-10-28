package br.senac.aplicacaoBase.mock;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import br.senac.aplicacaoBase.modelo.Produto;

//Mock de Cliente. Realiza operações de mock com o cliente. 
public class MockProduto {
    private static int totalProduto = 0;
    /** Armazena a lista de clientes inseridos para manipulação. #MOCK **/    
    private static List<Produto> listaProduto = new ArrayList<Produto>();
    
    //Insere um cliente no mock "cliente"
    public static void inserir(Produto produto)
            throws Exception {
        produto.setId(totalProduto++);
        listaProduto.add(produto);
    }

    //Realiza a atualização dos dados de um cliente, com ID e dados
    //fornecidos como parâmetro através de um objeto da classe "Cliente"
    public static void atualizar(Produto produtoProcura)
            throws Exception {
        if (produtoProcura != null && produtoProcura.getId() != null && !listaProduto.isEmpty()) {
            for (Produto produtoLi : listaProduto) {
                if (produtoLi != null && Objects.equals(produtoLi.getId(), produtoProcura.getId())) {
                    produtoLi.setEspecie(produtoProcura.getEspecie());
                    produtoLi.setValor(produtoProcura.getValor());
                    produtoLi.setEstoque(produtoProcura.getEstoque());
                    break;
                }
            }
        }
    }

    //Realiza a exclusão de um cliente no mock, com ID fornecido
    //como parâmetro.
    public static void excluir(Integer id) throws Exception {
        if (id != null && !listaProduto.isEmpty()) {
            for (int i = 0; i < listaProduto.size(); i++) {
                Produto produtoLi = listaProduto.get(i);
                if (produtoLi != null && produtoLi.getId() == id) {
                    listaProduto.remove(i);
                    break;
                }
            }
        }
    }

    //Lista todos os clientes
    public static List<Produto> listar()
            throws Exception {       
        //Retorna a lista de clientes
        return listaProduto;
    }

    //Procura um cliente no mock, de acordo com o nome
    //ou com o sobrenome, passado como parâmetro
    public static List<Produto> procurar(String valor)
            throws Exception {
        List<Produto> listaResultado = new ArrayList<Produto>();
        
        if (valor != null && !listaProduto.isEmpty()) {
            for (Produto produtoLi : listaProduto) {
                if (produtoLi != null && produtoLi.getEspecie() != null){
                    if (produtoLi.getEspecie().contains(valor)
                        || produtoLi.getCodigo().contains(valor)) {
                        listaResultado.add(produtoLi);
                    }
                }
            }
        }
        
        //Retorna a lista de clientes encontrados
        return listaResultado;
    }

    //Obtém um cliente da lista
    public static Produto obter(Integer id)
            throws Exception {
        if (id != null && !listaProduto.isEmpty()) {
            for (int i = 0; i < listaProduto.size(); i++) {
                if (listaProduto.get(i) != null && listaProduto.get(i).getId() == id) {
                    return listaProduto.get(i);
                }                
            }
        }
        return null;
    }
}