/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CTR;

import Dao.CidadeDAO;
import Dao.EstadoDAO;
import Model.CidadeModel;
import Model.EstadoModel;
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
public class CidadeCTR {
   public List<EstadoModel> carregaCombo() {
        List<EstadoModel> cidade = new ArrayList<>();
        CidadeDAO objdao = new CidadeDAO();
        ResultSet rsestadp = objdao.listaestado();

        try {
            while (rsestadp.next()) {
                EstadoModel gs = new EstadoModel();
                gs.setCod_estado(rsestadp.getInt("codestado"));
                gs.setNomeestado(rsestadp.getString("nome_estado"));
                

                cidade.add(gs);
            }
            return cidade;

        } catch (SQLException ex) {
            Logger.getLogger(CidadeCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public void InserecidadeCTR(String cidade,int fk_estado)
    {
        // Cria um objeto da MODEL
        CidadeModel objtelefone = new CidadeModel();
        //Envia por meio de SET o valor de nome
        objtelefone.setNomecidade(cidade);
        objtelefone.setFk_uf(fk_estado);
    
        //Declara objeto da DAO
        CidadeDAO objdao = new CidadeDAO();
        //Utiliza método insere e parametro MODEL
        objdao.Inserecidade(objtelefone);
                
    }
             public void AlteracidadeCTR(String cidade,int fkestado,int id_cidade)
    {
        // Cria um objeto da MODEL
        CidadeModel objrua = new CidadeModel();
        //Envia por meio de SET o valor de nome
        objrua.setNomecidade(cidade);
          objrua.setFk_uf(fkestado);
       objrua.setCodcidade(id_cidade);
   

        //Declara objeto da DAO
        CidadeDAO objdao = new  CidadeDAO();
        //Utiliza método insere e parametro MODEL
        objdao.Alteracidade(objrua);
    }
  
     
    
      public void ExcluitelCTR(int id_cidade)
     {
        CidadeModel objfunc = new CidadeModel();
         
         
         objfunc.setCodcidade(id_cidade);
         
         CidadeDAO objdao = new CidadeDAO();
         objdao.Excluicidade(objfunc);
     }
     public ResultSet PesquisartelCTR(String cidade)
    {
        CidadeDAO objfunc = new CidadeDAO();
        
        return objfunc.PesquisarTodoscidade(cidade);
        
    }  
}
