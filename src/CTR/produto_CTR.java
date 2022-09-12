/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTR;

import Dao.ProdutoDAO;
import Model.tipoModel;
import Model.marca_model;
import Model.ProdutoModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class produto_CTR {
         public List<tipoModel> carregaCombotipoproduto() {
        List<tipoModel> tipo = new ArrayList<>();
        ProdutoDAO objdao = new ProdutoDAO();
        ResultSet rstipo = objdao.listatipo();

        try {
            while (rstipo.next()) {
                tipoModel gs = new tipoModel();
                gs.setCod_tipo(rstipo.getInt("cod_tipo_produto"));
                gs.setTipo(rstipo.getString("tipo"));
                

                tipo.add(gs);
            }
            return tipo;

        } catch (SQLException ex) {
            Logger.getLogger(produto_CTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
     public List<marca_model> carregaCombomarcaproduto() {
        List<marca_model> marca = new ArrayList<>();
        ProdutoDAO objdao = new ProdutoDAO();
        ResultSet rsmarca = objdao.listamarca();

        try {
            while (rsmarca.next()) {
                marca_model gs = new marca_model();
                gs.setCod_marca_produto(rsmarca.getInt("cod_marca_produto"));
                gs.setMarca_produto(rsmarca.getString("marca_produto"));
                

                marca.add(gs);
            }
            return marca;

        } catch (SQLException ex) {
            Logger.getLogger(produto_CTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public void InsereprodutoCTR(String produto,int quantidade,int fkmarca,int fk_tipo)
    {
        // Cria um objeto da MODEL
        ProdutoModel objprProdutoModel = new ProdutoModel();
        //Envia por meio de SET o valor de nome
        objprProdutoModel.setProduto(produto);
        objprProdutoModel.setQuantidade(quantidade);
        objprProdutoModel.setFk_marca(fkmarca);
         objprProdutoModel.setFk_tipo(fk_tipo);
         
        //Declara objeto da DAO
        ProdutoDAO objdao = new ProdutoDAO();
        //Utiliza método insere e parametro MODEL
        objdao.Insereproduto(objprProdutoModel);
                
    }
             public void AlteraprodutoCTR(String marca,int quantidade,int fkmarca,int tipo,int id_prod)
    {
        // Cria um objeto da MODEL
        ProdutoModel objrua = new ProdutoModel();
        //Envia por meio de SET o valor de nome
        objrua.setProduto(marca);
          objrua.setQuantidade(quantidade);
          objrua.setFk_tipo(tipo);
       objrua.setFk_marca(fkmarca);
    objrua.setCodigo_barras(id_prod);
   

        //Declara objeto da DAO
        ProdutoDAO objdao = new  ProdutoDAO();
        //Utiliza método insere e parametro MODEL
        objdao.Alteratipotel(objrua);
    }
  
     
    
      public void ExcluiprodutoCTR(int idproduto)
     {
        ProdutoModel objfunc = new ProdutoModel();
         
         
         objfunc.setCodigo_barras(idproduto);
         
         ProdutoDAO objdao = new ProdutoDAO();
         objdao.Excluitipotel(objfunc);
     }
     public ResultSet PesquisarprodutoCTR(String produto)
    {
        ProdutoDAO objfunc = new ProdutoDAO();
        
        return objfunc.PesquisarTodosTelefone(produto);
        
    }  
}
