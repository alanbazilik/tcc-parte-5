/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author alang
 */
public class ProdutoModel {

    /**
     * @return the codigo_barras
     */
    public int getCodigo_barras() {
        return codigo_barras;
    }

    /**
     * @param codigo_barras the codigo_barras to set
     */
    public void setCodigo_barras(int codigo_barras) {
        this.codigo_barras = codigo_barras;
    }

    /**
     * @return the produto
     */
    public String getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(String produto) {
        this.produto = produto;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the fk_tipo
     */
    public int getFk_tipo() {
        return fk_tipo;
    }

    /**
     * @param fk_tipo the fk_tipo to set
     */
    public void setFk_tipo(int fk_tipo) {
        this.fk_tipo = fk_tipo;
    }

    /**
     * @return the fk_marca
     */
    public int getFk_marca() {
        return fk_marca;
    }

    /**
     * @param fk_marca the fk_marca to set
     */
    public void setFk_marca(int fk_marca) {
        this.fk_marca = fk_marca;
    }
    private int codigo_barras;
    private String produto;
    private int quantidade;
    private int fk_tipo;
    private int fk_marca;
}
