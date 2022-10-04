/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.FuncionarioModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author alang
 */
public class FuncionarioDAO {

    Connection con;
    PreparedStatement pgsql;
    Statement st;
    ResultSet rs;

    public ResultSet listabairro() {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();

        ResultSet rs = null;
        String sql = "select * from bairro";

        try {
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,
                    ResultSet.TYPE_SCROLL_INSENSITIVE);

            rs = st.executeQuery(sql);

        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;

    }

    public ResultSet listarcidade() {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();

        ResultSet rs = null;
        String sql = "select * from cidade";

        try {
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,
                    ResultSet.TYPE_SCROLL_INSENSITIVE);

            rs = st.executeQuery(sql);

        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;

    }

    public ResultSet listatelefone() {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();

        ResultSet rs = null;
        String sql = "select * from Telefone";

        try {
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,
                    ResultSet.TYPE_SCROLL_INSENSITIVE);

            rs = st.executeQuery(sql);

        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;

    }

    public ResultSet listarua() {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();

        ResultSet rs = null;
        String sql = "select * from Rua";

        try {
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,
                    ResultSet.TYPE_SCROLL_INSENSITIVE);

            rs = st.executeQuery(sql);

        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;

    }

    public void Insereproduto(FuncionarioModel gs) {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();

        String sql = "insert into funcionario"
                + "(nome_funcionario,rg,cpf,fk_bairro,fk_cidade,fk_codtelefone,fk_codrua,numerocasa)"
                + " values (upper(?),?,?,?,?,?,?,?)";

        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setString(1, gs.getNome_funcionario());
            pgsql.setString(2, gs.getRg());
            pgsql.setString(3, gs.getCpf());
            pgsql.setInt(4, gs.getFk_bairro());
            pgsql.setInt(5, gs.getFk_cidade());
            pgsql.setInt(6, gs.getFk_codtelefone());
            pgsql.setInt(7, gs.getFk_codrua());
            pgsql.setString(8, gs.getNumerocasa());
            pgsql.executeUpdate();
            JOptionPane.showMessageDialog(null, "funcionario foi  Cadastrado com Sucesso");

        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Alteratipotel(FuncionarioModel gs) {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();

        String sql = "UPDATE funcionario SET "
                + "nome_funcionario = ?,rg = ?,cpf = ?,fk_bairro = ?"
                + ",fk_cidade = ?,fk_codtelefone = ?,fk_codrua = ?,numerocasa = ?"
                + "WHERE cod_funcionario = ?";

        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setString(1, gs.getNome_funcionario());
            pgsql.setString(2, gs.getRg());
            pgsql.setString(3, gs.getCpf());
            pgsql.setInt(4, gs.getFk_bairro());
            pgsql.setInt(5, gs.getFk_cidade());
            pgsql.setInt(6, gs.getFk_codtelefone());
            pgsql.setInt(7, gs.getFk_codrua());
            pgsql.setString(8, gs.getNumerocasa());
            pgsql.setInt(9, gs.getCod_funcionario());

            int rowsUpdated = pgsql.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "O funcionario foi alterado com sucesso");
            }
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Excluitipotel(FuncionarioModel gs) {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();

        String sql = "delete from funcionario where"
                + " cod_funcionario = ?";

        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setInt(1, gs.getCod_funcionario());
            pgsql.executeUpdate();
            JOptionPane.showMessageDialog(null, "funcionario foi Excluído com Sucesso");

        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet PesquisarTodos(String nome_funcionario) {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();

        String sql = "SELECT f.cod_funcionario, f.nome_funcionario,f.rg, f.cpf, f.numerocasa, b.bairro, cid.nomecidade, "
                + "r.nomerua,t.numerotel "
                + "FROM funcionario f, bairro b, cidade cid, Rua r,Telefone t "
                + "WHERE f.fk_bairro = b.codbairro and f.fk_cidade = cid.codcidade and f.fk_codrua = r.codrua and "
                + "f.fk_codtelefone = t.codtelefone";
        try {
            pgsql = con.prepareStatement(sql);
//            pgsql.setString(1, "%" + nome_funcionario + "%");

            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,
                    ResultSet.TYPE_SCROLL_INSENSITIVE);

            rs = st.executeQuery(pgsql.toString());

        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;

    }
}
