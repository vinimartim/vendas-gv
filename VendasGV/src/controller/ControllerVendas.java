package controller;

import model.ModelVendas;
import DAO.DAOVendas;
import java.util.ArrayList;

/**
*
* @author Vinicius
*/
public class ControllerVendas {

    private final DAOVendas daoVendas = new DAOVendas();

    /**
    * grava Vendas
    * @param pModelVendas
    * return int
     * @return 
    */
    public int salvarVendasController(ModelVendas pModelVendas){
        return this.daoVendas.salvarVendasDAO(pModelVendas);
    }

    /**
    * recupera Vendas
    * @param pVendaId
    * return ModelVendas
     * @return 
    */
    public ModelVendas getVendasController(int pVendaId){
        return this.daoVendas.getVendasDAO(pVendaId);
    }

    /**
    * recupera uma lista deVendas
     * @return 
    */
    public ArrayList<ModelVendas> getListaVendasController(){
        return this.daoVendas.getListaVendasDAO();
    }

    /**
    * atualiza Vendas
    * @param pModelVendas
    * return boolean
     * @return 
    */
    public boolean atualizarVendasController(ModelVendas pModelVendas){
        return this.daoVendas.atualizarVendasDAO(pModelVendas);
    }

    /**
    * exclui Vendas
    * @param pVendaId
    * return boolean
     * @return 
    */
    public boolean excluirVendasController(int pVendaId){
        return this.daoVendas.excluirVendasDAO(pVendaId);
    }
    
    public boolean getVendaPorClienteIdController(int pCodigoCliente) {
        return this.daoVendas.getVendaPorClienteIdDAO(pCodigoCliente);
    }
    
}