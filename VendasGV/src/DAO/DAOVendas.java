package DAO;

import model.ModelVendas;
import conections.ConexaoMySql;
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
    */
    public int salvarVendasDAO(ModelVendas pModelVendas){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_vendas ("
                    + "fk_cliente,"
                    + "data,"
                    + "valor_liquido,"
                    + "valor_bruto,"
                    + "desconto"
                + ") VALUES ("
                    + "'" + pModelVendas.getCliente() + "',"
                    + "'" + pModelVendas.getVendaData() + "',"
                    + "'" + pModelVendas.getVendaValorLiquido() + "',"
                    + "'" + pModelVendas.getVendaValorBruto() + "',"
                    + "'" + pModelVendas.getVendaDesconto() + "'"
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
    * recupera Vendas
    * @param pVendaId
    * return ModelVendas
    */
    public ModelVendas getVendasDAO(int pVendaId){
        ModelVendas modelVendas = new ModelVendas();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_venda,"
                    + "fk_cliente,"
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
                modelVendas.setCliente(this.getResultSet().getInt(2));
                modelVendas.setVendaData(this.getResultSet().getDate(3));
                modelVendas.setVendaValorLiquido(this.getResultSet().getDouble(4));
                modelVendas.setVendaValorBruto(this.getResultSet().getDouble(5));
                modelVendas.setVendaDesconto(this.getResultSet().getDouble(6));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelVendas;
    }

    /**
    * recupera uma lista de Vendas
        * return ArrayList
    */
    public ArrayList<ModelVendas> getListaVendasDAO(){
        ArrayList<ModelVendas> listaModelVendas = new ArrayList();
        ModelVendas modelVendas = new ModelVendas();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_venda,"
                    + "fk_cliente,"
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
                modelVendas.setCliente(this.getResultSet().getInt(2));
                modelVendas.setVendaData(this.getResultSet().getDate(3));
                modelVendas.setVendaValorLiquido(this.getResultSet().getDouble(4));
                modelVendas.setVendaValorBruto(this.getResultSet().getDouble(5));
                modelVendas.setVendaDesconto(this.getResultSet().getDouble(6));
                listaModelVendas.add(modelVendas);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listaModelVendas;
    }

    /**
    * atualiza Vendas
    * @param pModelVendas
    * return boolean
    */
    public boolean atualizarVendasDAO(ModelVendas pModelVendas){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_vendas SET "
                    + "pk_id_venda = '" + pModelVendas.getVendaId() + "',"
                    + "fk_cliente = '" + pModelVendas.getCliente() + "',"
                    + "data = '" + pModelVendas.getVendaData() + "',"
                    + "valor_liquido = '" + pModelVendas.getVendaValorLiquido() + "',"
                    + "valor_bruto = '" + pModelVendas.getVendaValorBruto() + "',"
                    + "desconto = '" + pModelVendas.getVendaDesconto() + "'"
                + " WHERE "
                    + "pk_id_venda = '" + pModelVendas.getVendaId() + "'"
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
    * exclui Vendas
    * @param pVendaId
    * return boolean
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
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}