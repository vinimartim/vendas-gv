package controller;

import DAO.DAOVendasClientes;
import java.util.ArrayList;
import model.ModelVendasClientes;

public class ControllerVendasClientes {
    DAOVendasClientes daoVendasCliente = new DAOVendasClientes();
    
    public ArrayList<ModelVendasClientes> getListaVendasClienteController() {
        return this.daoVendasCliente.getListaVendasClienteDAO();
    }
    
}
