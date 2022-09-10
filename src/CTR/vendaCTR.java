/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CTR;

import Dao.vendaDAO;
import Dao.FuncionarioDAO;
import Dao.ClienteDAO;
import Dao.ProdutoDAO;
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
              
//    public void InserecidadeCTR(String nome_funcionario,String rg,String cpf,int fk_bairro,int fk_cidade,
//    int fk_codtelefone,int fk_codrua,String numerocasa)
//    {
//        // Cria um objeto da MODEL
//        FuncionarioModel objprProdutoModel = new FuncionarioModel();
//        //Envia por meio de SET o valor de nome
//        objprProdutoModel.setNome_funcionario(nome_funcionario);
//        objprProdutoModel.setRg(rg);
//        objprProdutoModel.setRg(cpf);
//          objprProdutoModel.setFk_bairro(fk_bairro);
//           objprProdutoModel.setFk_cidade(fk_cidade);
//            objprProdutoModel.setFk_codtelefone(fk_codtelefone);
//             objprProdutoModel.setFk_codrua(fk_codrua);
//              objprProdutoModel.setNumerocasa(numerocasa);
//        //Declara objeto da DAO
//        FuncionarioDAO objdao = new FuncionarioDAO();
//        //Utiliza método insere e parametro MODEL
//        objdao.Inseretelefone(objprProdutoModel);
//                
//    }
//             public void AlteracidadeCTR(String nome_funcionario,String rg,String cpf,int fk_bairro,int fk_cidade,
//    int fk_codtelefone,int fk_codrua,String numerocasa,int cod)
//    {
//        // Cria um objeto da MODEL
//        // Cria um objeto da MODEL
//        FuncionarioModel objprProdutoModel = new FuncionarioModel();
//        //Envia por meio de SET o valor de nome
//        objprProdutoModel.setNome_funcionario(nome_funcionario);
//        objprProdutoModel.setRg(rg);
//        objprProdutoModel.setRg(cpf);
//          objprProdutoModel.setFk_bairro(fk_bairro);
//           objprProdutoModel.setFk_cidade(fk_cidade);
//            objprProdutoModel.setFk_codtelefone(fk_codtelefone);
//             objprProdutoModel.setFk_codrua(fk_codrua);
//              objprProdutoModel.setNumerocasa(numerocasa);
//    objprProdutoModel.setCod_funcionario(cod);
//   
//
//        //Declara objeto da DAO
//        FuncionarioDAO objdao = new  FuncionarioDAO();
//        //Utiliza método insere e parametro MODEL
//        objdao.Alteratipotel(objprProdutoModel);
//    }
//  
//     
//    
//      public void ExcluitelCTR(int idcliente)
//     {
//        FuncionarioModel objfunc = new FuncionarioModel();
//         
//         
//         objfunc.setCod_funcionario(idcliente);
//         
//         FuncionarioDAO objdao = new FuncionarioDAO();
//         objdao.Excluitipotel(objfunc);
//     }
//     public ResultSet PesquisartelCTR(String cliente)
//    {
//        FuncionarioDAO objfunc = new FuncionarioDAO();
//        
//        return objfunc.PesquisarTodos(cliente);
//        
//    }  
}
