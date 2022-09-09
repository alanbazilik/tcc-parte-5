/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author alang
 */
public class VendaModel {

    /**
     * @return the codvenda
     */
    public int getCodvenda() {
        return codvenda;
    }

    /**
     * @param codvenda the codvenda to set
     */
    public void setCodvenda(int codvenda) {
        this.codvenda = codvenda;
    }

    /**
     * @return the datavenda
     */
    public String getDatavenda() {
        return datavenda;
    }

    /**
     * @param datavenda the datavenda to set
     */
    public void setDatavenda(String datavenda) {
        this.datavenda = datavenda;
    }

    /**
     * @return the fk_codcliente
     */
    public int getFk_codcliente() {
        return fk_codcliente;
    }

    /**
     * @param fk_codcliente the fk_codcliente to set
     */
    public void setFk_codcliente(int fk_codcliente) {
        this.fk_codcliente = fk_codcliente;
    }

    /**
     * @return the fk_codfuncionario
     */
    public int getFk_codfuncionario() {
        return fk_codfuncionario;
    }

    /**
     * @param fk_codfuncionario the fk_codfuncionario to set
     */
    public void setFk_codfuncionario(int fk_codfuncionario) {
        this.fk_codfuncionario = fk_codfuncionario;
    }

    /**
     * @return the fk_codproduto
     */
    public int getFk_codproduto() {
        return fk_codproduto;
    }

    /**
     * @param fk_codproduto the fk_codproduto to set
     */
    public void setFk_codproduto(int fk_codproduto) {
        this.fk_codproduto = fk_codproduto;
    }

    /**
     * @return the quantv
     */
    public Float getQuantv() {
        return quantv;
    }

    /**
     * @param quantv the quantv to set
     */
    public void setQuantv(Float quantv) {
        this.quantv = quantv;
    }

    /**
     * @return the valorv
     */
    public Float getValorv() {
        return valorv;
    }

    /**
     * @param valorv the valorv to set
     */
    public void setValorv(Float valorv) {
        this.valorv = valorv;
    }
   private int  codvenda;
   private String datavenda;
   private int fk_codcliente;
   private int fk_codfuncionario;
   private int fk_codproduto; 
   private Float quantv; 
   private Float valorv;
}
