/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CTR;

import Dao.FuncionarioDAO;
import Model.CidadeModel;
import Model.FuncionarioModel;
import Model.RuaModel;
import Model.bairroModel;
import Model.telefoneModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alang
 */
public class FuncionarioCTR {

    public List<bairroModel> carregaCombobairro() {
        List<bairroModel> bairros1 = new ArrayList<>();
        FuncionarioDAO objdao = new FuncionarioDAO();
        ResultSet rsbairro = objdao.listabairro();

        try {
            while (rsbairro.next()) {
                bairroModel gs = new bairroModel();
                gs.setCodbairro(rsbairro.getInt("codbairro"));
                gs.setBairros(rsbairro.getString("bairro"));

                bairros1.add(gs);
            }
            return bairros1;

        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<RuaModel> carregaComboRua() {
        List<RuaModel> rua = new ArrayList<>();
        FuncionarioDAO objdao = new FuncionarioDAO();
        ResultSet rsrua = objdao.listarua();

        try {
            while (rsrua.next()) {
                RuaModel gs = new RuaModel();
                gs.setCodrua(rsrua.getInt("codrua"));
                gs.setNomerua(rsrua.getString("nomerua"));

                rua.add(gs);
            }
            return rua;

        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<telefoneModel> carregaCombotelefone() {
        List<telefoneModel> telefone = new ArrayList<>();
        FuncionarioDAO objdao = new FuncionarioDAO();
        ResultSet rsrua = objdao.listatelefone();

        try {
            while (rsrua.next()) {
                telefoneModel gs = new telefoneModel();
                gs.setCodtelefone(rsrua.getInt("codtelefone"));
                gs.setNumerotel(rsrua.getString("numerotel"));

                telefone.add(gs);
            }
            return telefone;

        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<CidadeModel> carregaCombocidade() {
        List<CidadeModel> cidade = new ArrayList<>();
        FuncionarioDAO objdao = new FuncionarioDAO();
        ResultSet rscidade = objdao.listarcidade();

        try {
            while (rscidade.next()) {
                CidadeModel gs = new CidadeModel();
                gs.setCodcidade(rscidade.getInt("codcidade"));
                gs.setNomecidade(rscidade.getString("nomecidade"));

                cidade.add(gs);
            }
            return cidade;

        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public void InserefuncionarioCTR(String nome_funcionario, String rg, String cpf, int fk_bairro, int fk_cidade,
            int fk_codtelefone, int fk_codrua, String numerocasa) {
        // Cria um objeto da MODEL
        FuncionarioModel objprProdutoModel = new FuncionarioModel();
        //Envia por meio de SET o valor de nome
        objprProdutoModel.setNome_funcionario(nome_funcionario);
        objprProdutoModel.setRg(rg);
        objprProdutoModel.setCpf(cpf);
        objprProdutoModel.setFk_bairro(fk_bairro);
        objprProdutoModel.setFk_cidade(fk_cidade);
        objprProdutoModel.setFk_codtelefone(fk_codtelefone);
        objprProdutoModel.setFk_codrua(fk_codrua);
        objprProdutoModel.setNumerocasa(numerocasa);
        //Declara objeto da DAO
        FuncionarioDAO objdao = new FuncionarioDAO();
        //Utiliza método insere e parametro MODEL
        objdao.Insereproduto(objprProdutoModel);

    }

    public void AlterafuncionarioCTR(String nome_funcionario, String rg, String cpf, int fk_bairro, int fk_cidade,
            int fk_codtelefone, int fk_codrua, String numerocasa, int cod) {
        // Cria um objeto da MODEL
        // Cria um objeto da MODEL
        FuncionarioModel objprProdutoModel = new FuncionarioModel();
        //Envia por meio de SET o valor de nome
        objprProdutoModel.setNome_funcionario(nome_funcionario);
        objprProdutoModel.setRg(rg);
        objprProdutoModel.setCpf(cpf);
        objprProdutoModel.setFk_bairro(fk_bairro);
        objprProdutoModel.setFk_cidade(fk_cidade);
        objprProdutoModel.setFk_codtelefone(fk_codtelefone);
        objprProdutoModel.setFk_codrua(fk_codrua);
        objprProdutoModel.setNumerocasa(numerocasa);
        objprProdutoModel.setCod_funcionario(cod);

        //Declara objeto da DAO
        FuncionarioDAO objdao = new FuncionarioDAO();
        //Utiliza método insere e parametro MODEL
        objdao.Alteratipotel(objprProdutoModel);
    }

    public void ExcluifuncionaroCTR(int idcliente) {
        FuncionarioModel objfunc = new FuncionarioModel();

        objfunc.setCod_funcionario(idcliente);

        FuncionarioDAO objdao = new FuncionarioDAO();
        objdao.Excluitipotel(objfunc);
    }

    public ResultSet PesquisarfuncionaroCTR(String cliente) {
        FuncionarioDAO objfunc = new FuncionarioDAO();

        return objfunc.PesquisarTodos(cliente);

    }
}
