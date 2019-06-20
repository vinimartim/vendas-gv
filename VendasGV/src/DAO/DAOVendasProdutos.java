package DAO;

import model.ModelVendasProdutos;
import conections.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Vinicius
*/
public class DAOVendasProdutos extends ConexaoMySql {

    /**
    * grava VendasProdutos
    * @param pModelVendasProdutos
    * return int
    */
    public int salvarVendasProdutosDAO(ModelVendasProdutos pModelVendasProdutos){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_vendas_produtos ("
                    + "fk_produto,"
                    + "fk_venda,"
                    + "valor,"
                    + "qtd"
                + ") VALUES ("
                    + "'" + pModelVendasProdutos.getProduto() + "',"
                    + "'" + pModelVendasProdutos.getVenda() + "',"
                    + "'" + pModelVendasProdutos.getVenProValor() + "',"
                    + "'" + pModelVendasProdutos.getVenProQtd() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera VendasProdutos
    * @param pVendaProdutoId
    * return ModelVendasProdutos
    */
    public ModelVendasProdutos getVendasProdutosDAO(int pVendaProdutoId){
        ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_venda_produto,"
                    + "fk_produto,"
                    + "fk_venda,"
                    + "valor,"
                    + "qtd"
                 + " FROM"
                     + " tbl_vendas_produtos"
                 + " WHERE"
                     + " pk_id_venda_produto = '" + pVendaProdutoId + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendasProdutos.setVendaProdutoId(this.getResultSet().getInt(1));
                modelVendasProdutos.setProduto(this.getResultSet().getInt(2));
                modelVendasProdutos.setVenda(this.getResultSet().getInt (3));
                modelVendasProdutos.setVenProValor(this.getResultSet().getDouble(4));
                modelVendasProdutos.setVenProQtd(this.getResultSet().getInt(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelVendasProdutos;
    }

    /**
    * recupera uma lista de VendasProdutos
        * return ArrayList
    */
    public ArrayList<ModelVendasProdutos> getListaVendasProdutosDAO(){
        ArrayList<ModelVendasProdutos> listamodelVendasProdutos = new ArrayList();
        ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_venda_produto,"
                    + "fk_produto,"
                    + "fk_venda,"
                    + "valor,"
                    + "qtd"
                 + " FROM"
                     + " tbl_vendas_produtos"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendasProdutos = new ModelVendasProdutos();
                modelVendasProdutos.setVendaProdutoId(this.getResultSet().getInt(1));
                modelVendasProdutos.setProduto(this.getResultSet().getInt(2));
                modelVendasProdutos.setVenda(this.getResultSet().getInt (3));
                modelVendasProdutos.setVenProValor(this.getResultSet().getDouble(4));
                modelVendasProdutos.setVenProQtd(this.getResultSet().getInt(5));
                listamodelVendasProdutos.add(modelVendasProdutos);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelVendasProdutos;
    }

    /**
    * atualiza VendasProdutos
    * @param pModelVendasProdutos
    * return boolean
    */
    public boolean atualizarVendasProdutosDAO(ModelVendasProdutos pModelVendasProdutos){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_vendas_produtos SET "
                    + "pk_id_venda_produto = '" + pModelVendasProdutos.getVendaProdutoId() + "',"
                    + "fk_produto = '" + pModelVendasProdutos.getProduto() + "',"
                    + "fk_venda = '" + pModelVendasProdutos.getVenda() + "',"
                    + "valor = '" + pModelVendasProdutos.getVenProValor() + "',"
                    + "qtd = '" + pModelVendasProdutos.getVenProQtd() + "'"
                + " WHERE "
                    + "pk_id_venda_produto = '" + pModelVendasProdutos.getVendaProdutoId() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui VendasProdutos
    * @param pVendaProdutoId
    * return boolean
    */
    public boolean excluirVendasProdutosDAO(int pVendaProdutoId){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_vendas_produtos "
                + " WHERE "
                    + "fk_venda = '" + pVendaProdutoId + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
    
    /**
     * Salva uma lista de produtos
     * @param pListaModelVendasProdutos
     * @return 
     */
    public boolean salvarVendasProdutosDAO(ArrayList<ModelVendasProdutos> pListaModelVendasProdutos) {
        try {
            this.conectar();
            int tamanho = pListaModelVendasProdutos.size();
            
            // Percorre a lista com os produtos e adiciona no banco um por um
            for (int i = 0; i < tamanho; i++) {
                this.insertSQL(
                    "INSERT INTO tbl_vendas_produtos ("
                        + "fk_venda,"
                        + "fk_produto,"
                        + "valor,"
                        + "qtd"
                    + ") VALUES ("
                        + "'" + pListaModelVendasProdutos.get(i).getVenda() + "',"
                        + "'" + pListaModelVendasProdutos.get(i).getProduto() + "',"
                        + "'" + pListaModelVendasProdutos.get(i).getVenProValor() + "',"
                        + "'" + pListaModelVendasProdutos.get(i).getVenProQtd() + "'"
                    + ");"
                );
            }
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}