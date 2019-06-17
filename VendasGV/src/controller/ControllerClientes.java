/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DaoClientes;
import java.util.ArrayList;
import model.ModelClientes;

public class ControllerClientes {
    DaoClientes daoClientes = new DaoClientes();
    
    /**
     * Salvar produtos controller
     * @param pModelClientes
     * @return boolean
     */
    public int salvarClienteController(ModelClientes pModelClientes) {
        return this.daoClientes.salvarClienteDAO(pModelClientes);
    }
    
    /**
     * Excluir produto controller
     * @param pCodigo
     * @return boolean
     */
    public boolean excluirClienteController(int pCodigo) {
        return this.daoClientes.excluirClienteDAO(pCodigo);
    }
    
    /**
     * Alterar produto controller
     * @param pModelClientes
     * @return boolean
     */
    public boolean alterarClienteController(ModelClientes pModelClientes) {
        return this.daoClientes.alterarClienteDAO(pModelClientes);
    }
    
    /**
     * Retorna produto controller
     * @param pCodigo
     * @return 
     */
    public ModelClientes retornaClienteController(int pCodigo) {
        return this.daoClientes.retornarClienteDAO(pCodigo);
    }
    
    /**
     * Retornar lista de produtos controller
     * @return 
     */
    public ArrayList<ModelClientes> retornarListaClientesController() {
        return this.daoClientes.retornarListaClientes();
    }
}
