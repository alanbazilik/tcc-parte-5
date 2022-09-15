/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CTR;

import Dao.vendaDAO;

import Model.ClienteModel;
import Model.FuncionarioModel;
import Model.ProdutoModel;
import Model.VendaModel;
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
public class vendaCTR {
    public List<FuncionarioModel> carregaCombofuncionario() {
        List<FuncionarioModel> funcionarioModelss = new ArrayList<>();
        vendaDAO objdao = new vendaDAO();
        ResultSet rsbairro = objdao.listafuncionario();

        try {
            while (rsbairro.next()) {
                FuncionarioModel gs = new FuncionarioModel();
                gs.setCod_funcionario(rsbairro.getInt("cod_funcionario"));
                gs.setNome_funcionario(rsbairro.getString("nome_funcionario"));
                

                funcionarioModelss.add(gs);
            }
            return funcionarioModelss;

        } catch (SQLException ex) {
            Logger.getLogger(vendaCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
             public List<ClienteModel> carregaCombocliente() {
        List<ClienteModel> clientesModelss = new ArrayList<>();
        vendaDAO objdao = new vendaDAO();
        ResultSet rsbairro1 = objdao.listacliente();

        try {
            while (rsbairro1.next()) {
                ClienteModel gs = new ClienteModel();
                gs.setCod_Cliente(rsbairro1.getInt("cod_cliente"));
                gs.setNome_Cliente(rsbairro1.getString("nome_cliente"));
                

                clientesModelss.add(gs);
            }
            return clientesModelss;

        } catch (SQLException ex) {
            Logger.getLogger(vendaCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
                     public List<ProdutoModel> carregaComboProduto() {
        List<ProdutoModel> produtosModelss = new ArrayList<>();
        vendaDAO objdao = new vendaDAO();
        ResultSet rsbairro1 = objdao.listaproduto();

        try {
            while (rsbairro1.next()) {
                ProdutoModel gs = new ProdutoModel();
                gs.setCodigo_barras(rsbairro1.getInt("codigo_barras"));
                gs.setProduto(rsbairro1.getString("produto"));
                

                produtosModelss.add(gs);
            }
            return produtosModelss;

        } catch (SQLException ex) {
            Logger.getLogger(vendaCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
              
    public void InserevendaCTR(String data,int fk_cliente,int fk_funcionario,int fk_produto,float quantv,float valorv)
    {
        // Cria um objeto da MODEL
        VendaModel objprProdutoModel = new VendaModel();
        //Envia por meio de SET o valor de nome
        objprProdutoModel.setDatavenda(data);
         objprProdutoModel.setFk_codfuncionario(fk_funcionario);
          objprProdutoModel.setFk_codcliente(fk_cliente);
          objprProdutoModel.setFk_codproduto(fk_produto);
          objprProdutoModel.setQuantv(quantv);
          objprProdutoModel.setValorv(valorv);
        //Declara objeto da DAO
        vendaDAO objdao = new vendaDAO();
        //Utiliza método insere e parametro MODEL
        objdao.Inseretelefone(objprProdutoModel);
                
    }
             public void AlteracidadeCTR(String data,int fk_cliente,int fk_funcionario,int fk_produto,float quantv,float valorv,int cod)
    {
        // Cria um objeto da MODEL
        // Cria um objeto da MODEL
          VendaModel objprProdutoModel = new VendaModel();
        //Envia por meio de SET o valor de nome
        objprProdutoModel.setDatavenda(data);
         objprProdutoModel.setFk_codfuncionario(fk_funcionario);
          objprProdutoModel.setFk_codcliente(fk_cliente);
          objprProdutoModel.setFk_codproduto(fk_produto);
          objprProdutoModel.setQuantv(quantv);
          objprProdutoModel.setValorv(valorv);
        //Declara objeto da DAO
    objprProdutoModel.setCodvenda(cod);
   

        //Declara objeto da DAO
             vendaDAO objdao = new vendaDAO();
        //Utiliza método insere e parametro MODEL
        objdao.Alteratipotel(objprProdutoModel);
    }
  
     
    
      public void ExcluitelCTR(int idvenda)
     {
        VendaModel objfunc = new VendaModel();
         
         
         objfunc.setCodvenda(idvenda);
         
         vendaDAO objdao = new vendaDAO();
         objdao.Excluitipotel(objfunc);
     }
     public ResultSet PesquisartelCTR(String quantv)
    {
        vendaDAO objfunc = new vendaDAO();
        
        return objfunc.PesquisarTodosvendas(quantv);
        
    }  
}
