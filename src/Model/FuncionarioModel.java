/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author alang
 */
public class FuncionarioModel {

    /**
     * @return the cod_funcionario
     */
    public int getCod_funcionario() {
        return cod_funcionario;
    }

    /**
     * @param cod_funcionario the cod_funcionario to set
     */
    public void setCod_funcionario(int cod_funcionario) {
        this.cod_funcionario = cod_funcionario;
    }

    /**
     * @return the nome_funcionario
     */
    public String getNome_funcionario() {
        return nome_funcionario;
    }

    /**
     * @param nome_funcionario the nome_funcionario to set
     */
    public void setNome_funcionario(String nome_funcionario) {
        this.nome_funcionario = nome_funcionario;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the fk_bairro
     */
    public int getFk_bairro() {
        return fk_bairro;
    }

    /**
     * @param fk_bairro the fk_bairro to set
     */
    public void setFk_bairro(int fk_bairro) {
        this.fk_bairro = fk_bairro;
    }

    /**
     * @return the fk_cidade
     */
    public int getFk_cidade() {
        return fk_cidade;
    }

    /**
     * @param fk_cidade the fk_cidade to set
     */
    public void setFk_cidade(int fk_cidade) {
        this.fk_cidade = fk_cidade;
    }

    /**
     * @return the fk_codtelefone
     */
    public int getFk_codtelefone() {
        return fk_codtelefone;
    }

    /**
     * @param fk_codtelefone the fk_codtelefone to set
     */
    public void setFk_codtelefone(int fk_codtelefone) {
        this.fk_codtelefone = fk_codtelefone;
    }

    /**
     * @return the fk_codrua
     */
    public int getFk_codrua() {
        return fk_codrua;
    }

    /**
     * @param fk_codrua the fk_codrua to set
     */
    public void setFk_codrua(int fk_codrua) {
        this.fk_codrua = fk_codrua;
    }

    /**
     * @return the numerocasa
     */
    public String getNumerocasa() {
        return numerocasa;
    }

    /**
     * @param numerocasa the numerocasa to set
     */
    public void setNumerocasa(String numerocasa) {
        this.numerocasa = numerocasa;
    }
    private int cod_funcionario;
    private String nome_funcionario;
    private String rg;
    private String cpf;
    private int fk_bairro;
    private int fk_cidade;
    private int fk_codtelefone;
    private int fk_codrua;
    private String numerocasa;
}
