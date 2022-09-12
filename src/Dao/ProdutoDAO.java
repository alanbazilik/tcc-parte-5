/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.ProdutoModel;
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
public class ProdutoDAO {
      Connection con;
    PreparedStatement pgsql;
    Statement st;
    ResultSet rs;
    public ResultSet listamarca()
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        ResultSet rs = null;
        String sql = "select * from marca";
        
        try {
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,
                    ResultSet.TYPE_SCROLL_INSENSITIVE);
            
           rs = st.executeQuery(sql);
                       
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
        
        
    }
   public ResultSet listatipo()
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        ResultSet rs = null;
        String sql = "select * from tipos ";
        
        try {
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,
                    ResultSet.TYPE_SCROLL_INSENSITIVE);
            
           rs = st.executeQuery(sql);
                       
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
        
        
    }    
    
    
   public void Insereproduto(ProdutoModel gs)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        String sql = "insert into produto"
             + "(produto,quantidade,fk_tipo,fk_marca)"
                + " values (?,?,?,?)";
        
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setString(1, gs.getProduto());
            pgsql.setInt(2, gs.getQuantidade());
             pgsql.setInt(3, gs.getFk_tipo());
             pgsql.setInt(4, gs.getFk_marca());
             
            
            pgsql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Produto foi  Cadastrado com Sucesso");
            
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Alteratipotel(ProdutoModel gs)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        String sql = "UPDATE produto SET "
                + "produto = ?,quantidade = ?,fk_tipo = ?,fk_marca = ?"
                + "WHERE codigo_barras = ?";
        
        try {
            pgsql = con.prepareStatement(sql);
        pgsql.setString(1, gs.getProduto());
            pgsql.setInt(2, gs.getQuantidade());
             pgsql.setInt(3, gs.getFk_tipo());
             pgsql.setInt(4, gs.getFk_marca());
            pgsql.setInt(5, gs.getCodigo_barras());
            

            
            int rowsUpdated = pgsql.executeUpdate();
            if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(null, "O Produto foi alterado com sucesso");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    
  public void Excluitipotel(ProdutoModel gs)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        String sql ="delete from produto where"
                + " codigo_barras = ?";
        
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setInt(1, gs.getCodigo_barras());
            pgsql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Produto foi Excluído com Sucesso");
            
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public ResultSet PesquisarTodosTelefone(String produtos)
    {
           ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
       
        
        String sql = "select * from produto where "
                + "upper(produto) like upper(?)";
        
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setString(1,"%" + produtos + "%");
            
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,
                                     ResultSet.TYPE_SCROLL_INSENSITIVE);
            
            rs = st.executeQuery(pgsql.toString());
            
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
        
        
    }    
         
}
