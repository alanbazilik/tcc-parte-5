/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author alang
 */
public class CidadeModel {
    private int codcidade;
    private String nomecidade;
    private int fk_uf;

    /**
     * @return the codcidade
     */
    public int getCodcidade() {
        return codcidade;
    }

    /**
     * @param codcidade the codcidade to set
     */
    public void setCodcidade(int codcidade) {
        this.codcidade = codcidade;
    }

    /**
     * @return the nomecidade
     */
    public String getNomecidade() {
        return nomecidade;
    }

    /**
     * @param nomecidade the nomecidade to set
     */
    public void setNomecidade(String nomecidade) {
        this.nomecidade = nomecidade;
    }

    /**
     * @return the fk_uf
     */
    public int getFk_uf() {
        return fk_uf;
    }

    /**
     * @param fk_uf the fk_uf to set
     */
    public void setFk_uf(int fk_uf) {
        this.fk_uf = fk_uf;
    }
}
