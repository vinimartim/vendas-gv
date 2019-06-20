package controller;

import model.ModelVendas;
import DAO.DAOVendas;
import java.util.ArrayList;

/**
*
* @author Vinicius
*/
public class ControllerVendas {

    private DAOVendas daoVendas = new DAOVendas();

    /**
    * grava Vendas
    * @param pModelVendas
    * return int
    */
    public int salvarVendasController(ModelVendas pModelVendas){
        return this.daoVendas.salvarVendasDAO(pModelVendas);
    }

    /**
    * recupera Vendas
    * @param pVendaId
    * return ModelVendas
    */
    public ModelVendas getVendasController(int pVendaId){
        return this.daoVendas.getVendasDAO(pVendaId);
    }

    /**
    * recupera uma lista deVendas
    * @param pVendaId
    * return ArrayList
    */
    public ArrayList<ModelVendas> getListaVendasController(){
        return this.daoVendas.getListaVendasDAO();
    }

    /**
    * atualiza Vendas
    * @param pModelVendas
    * return boolean
    */
    public boolean atualizarVendasController(ModelVendas pModelVendas){
        return this.daoVendas.atualizarVendasDAO(pModelVendas);
    }

    /**
    * exclui Vendas
    * @param pVendaId
    * return boolean
    */
    public boolean excluirVendasController(int pVendaId){
        return this.daoVendas.excluirVendasDAO(pVendaId);
    }
}