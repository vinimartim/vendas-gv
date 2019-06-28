package DAO;

import model.ModelVendas;
import connections.ConexaoMySql;
import java.sql.SQLException;
import java.util.ArrayList;
/**
*
* @author Vinicius
*/
public class DAOVendas extends ConexaoMySql {

    /**
    * grava Vendas
    * @param pModelVendas
    * return int
     * @return 
    */
    public int salvarVendasDAO(ModelVendas pModelVendas){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_vendas ("
                    + "fk_cliente,"
                    + "fk_usuario,"
                    + "data,"
                    + "valor_liquido,"
                    + "valor_bruto,"
                    + "desconto"
                + ") VALUES ("
                    + "'" + pModelVendas.getCliente() + "',"
                    + "'" + pModelVendas.getUsuario() + "',"
                    + "'" + pModelVendas.getVendaData() + "',"
                    + "'" + pModelVendas.getVendaValorLiquido() + "',"
                    + "'" + pModelVendas.getVendaValorBruto() + "',"
                    + "'" + pModelVendas.getVendaDesconto() + "'"
                + ");"
            );
        } catch(Exception e){
            return 0;
        } finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera Vendas
    * @param pVendaId
    * return ModelVendas
     * @return 
    */
    public ModelVendas getVendasDAO(int pVendaId){
        ModelVendas modelVendas = new ModelVendas();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_venda,"
                    + "fk_cliente,"
                    + "fk_usuario,"
                    + "data,"
                    + "valor_liquido,"
                    + "valor_bruto,"
                    + "desconto"
                 + " FROM"
                     + " tbl_vendas"
                 + " WHERE"
                     + " pk_id_venda = '" + pVendaId + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendas.setVendaId(this.getResultSet().getInt(1));
                modelVendas.setUsuario(this.getResultSet().getInt(2));
                modelVendas.setCliente(this.getResultSet().getInt(3));
                modelVendas.setVendaData(this.getResultSet().getDate(4));
                modelVendas.setVendaValorLiquido(this.getResultSet().getDouble(5));
                modelVendas.setVendaValorBruto(this.getResultSet().getDouble(6));
                modelVendas.setVendaDesconto(this.getResultSet().getDouble(7));
            }
        }catch(SQLException e){
        }finally{
            this.fecharConexao();
        }
        return modelVendas;
    }

    /**
    * recupera uma lista de Vendas
        * return ArrayList
     * @return 
    */
    public ArrayList<ModelVendas> getListaVendasDAO(){
        ArrayList<ModelVendas> listaModelVendas = new ArrayList();
        ModelVendas modelVendas;
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_venda,"
                    + "fk_cliente,"
                    + "fk_usuario,"
                    + "data,"
                    + "valor_liquido,"
                    + "valor_bruto,"
                    + "desconto"
                 + " FROM"
                     + " tbl_vendas"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendas = new ModelVendas();
                modelVendas.setVendaId(this.getResultSet().getInt(1));
                modelVendas.setUsuario(this.getResultSet().getInt(2));
                modelVendas.setCliente(this.getResultSet().getInt(3));
                modelVendas.setVendaData(this.getResultSet().getDate(4));
                modelVendas.setVendaValorLiquido(this.getResultSet().getDouble(5));
                modelVendas.setVendaValorBruto(this.getResultSet().getDouble(6));
                modelVendas.setVendaDesconto(this.getResultSet().getDouble(7));
                listaModelVendas.add(modelVendas);
            }
        }catch(SQLException e){
        }finally{
            this.fecharConexao();
        }
        return listaModelVendas;
    }

    /**
    * atualiza Vendas
    * @param pModelVendas
    * return boolean
     * @return 
    */
    public boolean atualizarVendasDAO(ModelVendas pModelVendas){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_vendas SET "
                    + "pk_id_venda = '" + pModelVendas.getVendaId() + "',"
                    + "fk_cliente = '" + pModelVendas.getCliente() + "',"
                    + "fk_usuario = '" + pModelVendas.getUsuario()+ "',"
                    + "data = '" + pModelVendas.getVendaData() + "',"
                    + "valor_liquido = '" + pModelVendas.getVendaValorLiquido() + "',"
                    + "valor_bruto = '" + pModelVendas.getVendaValorBruto() + "',"
                    + "desconto = '" + pModelVendas.getVendaDesconto() + "'"
                + " WHERE "
                    + "pk_id_venda = '" + pModelVendas.getVendaId() + "'"
                + ";"
            );
        }catch(Exception e){
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui Vendas
    * @param pVendaId
    * return boolean
     * @return 
    */
    public boolean excluirVendasDAO(int pVendaId){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_vendas "
                + " WHERE "
                    + "pk_id_venda = '" + pVendaId + "'"
                + ";"
            );
        }catch(Exception e){
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    public boolean getVendaPorClienteIdDAO(int pCodigoCliente) {
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "fk_cliente"
                 + " FROM"
                     + " tbl_vendas"
                 + " WHERE"
                     + " fk_cliente = '" + pCodigoCliente + "'"
                + ";"
            );
            
            return getResultSet().next();
        } catch(SQLException e){
            return false;
        } finally{
            this.fecharConexao();
        }
    }
}