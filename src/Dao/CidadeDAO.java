/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.CidadeModel;
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
public class CidadeDAO {
    Connection con;
    PreparedStatement pgsql;
    Statement st;
    ResultSet rs;
    public ResultSet listaestado()
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        ResultSet rs = null;
        String sql = "select * from estado"; 
                                                        
        
        try {
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,
                    ResultSet.TYPE_SCROLL_INSENSITIVE);
            
           rs = st.executeQuery(sql);
                       
        } catch (SQLException ex) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
        
        
    }
    
    
    
   public void Inserecidade(CidadeModel gs)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        String sql = "insert into cidade"
                + "(nomecidade ,fk_uf)"
                + " values (upper(?),?)";
        
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setString(1, gs.getNomecidade());
            pgsql.setInt(2, gs.getFk_uf());
  
            pgsql.executeUpdate();
            JOptionPane.showMessageDialog(null, "cidade foi  Cadastrado com Sucesso");
            
        } catch (SQLException ex) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Alteracidade(CidadeModel gs)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        String sql = "UPDATE cidade SET "
                + "nomecidade = ?,fk_uf = ?"
                + "WHERE codcidade = ?";
        
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setString(1, gs.getNomecidade());
            pgsql.setInt(2, gs.getFk_uf());
            pgsql.setInt(3, gs.getCodcidade());
   
            int rowsUpdated = pgsql.executeUpdate();
            if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(null, "A cidade foi alterado com sucesso");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    
  public void Excluicidade(CidadeModel gs)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        String sql ="delete from cidade where"
                + " codcidade = ?";
        
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setInt(1, gs.getCodcidade());
            pgsql.executeUpdate();
            JOptionPane.showMessageDialog(null, "cidade foi Excluído com Sucesso");
            
        } catch (SQLException ex) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public ResultSet PesquisarTodoscidade(String cidade)
    {
           ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
       
        
        String sql = "SELECT C.CODCIDADE, C.NOMECIDADE, U.NOME_ESTADO " +
                      "FROM CIDADE C, ESTADO U " +
                      "WHERE C.FK_UF = U.CODESTADO ";
                
        
        try {
            pgsql = con.prepareStatement(sql);
            //pgsql.setString(1,"%" + cidade + "%");
            
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,
                                     ResultSet.TYPE_SCROLL_INSENSITIVE);
            
            rs = st.executeQuery(pgsql.toString());
            
        } catch (SQLException ex) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
        
        
    }    
         
}
