package model;

import java.util.ArrayList;

public class ModelVendasClientes {
    
    private ModelVendas modelVendas;
    private ModelClientes modelClientes;
    private ArrayList<ModelVendasClientes> listaModelVendasCliente;

    /**
     * @return the modelVendas
     */
    public ModelVendas getModelVendas() {
        return modelVendas;
    }

    /**
     * @param modelVendas the modelVendas to set
     */
    public void setModelVendas(ModelVendas modelVendas) {
        this.modelVendas = modelVendas;
    }

    /**
     * @return the modelClientes
     */
    public ModelClientes getModelClientes() {
        return modelClientes;
    }

    /**
     * @param modelClientes the modelClientes to set
     */
    public void setModelClientes(ModelClientes modelClientes) {
        this.modelClientes = modelClientes;
    }

    /**
     * @return the listaModelVendasCliente
     */
    public ArrayList<ModelVendasClientes> getListaModelVendasCliente() {
        return listaModelVendasCliente;
    }

    /**
     * @param listaModelVendasCliente the listaModelVendasCliente to set
     */
    public void setListaModelVendasCliente(ArrayList<ModelVendasClientes> listaModelVendasCliente) {
        this.listaModelVendasCliente = listaModelVendasCliente;
    }
    
}
