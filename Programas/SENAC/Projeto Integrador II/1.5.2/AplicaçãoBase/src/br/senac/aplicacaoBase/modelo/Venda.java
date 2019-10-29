
package br.senac.aplicacaoBase.modelo;


/**
 *
 * @author felipe.o.camargo
 */
public class Venda {
    
     //Atributos
    private Integer id;
    private String produtoComprado;
    private String quantidadeProduto;
    private String valorTotalCompra;
    private String nomeCliente;
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getProdutoComprado() {
        return produtoComprado;
    }

    public void setProdutoComprado(String produtoComprado) {
        this.produtoComprado = produtoComprado;
    }
    public String getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(String quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }
    
    public String getaValorTotalCompra() {
        return valorTotalCompra;
    }

    public void setValorTotalCompra(String valorTotalCompra) {
        this.valorTotalCompra = valorTotalCompra;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    
    
}


