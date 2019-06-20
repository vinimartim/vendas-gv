package controller;

import model.ModelVendasProdutos;
import DAO.DAOVendasProdutos;
import java.util.ArrayList;

/**
*
* @author Vinicius
*/
public class ControllerVendasProdutos {

    private DAOVendasProdutos daoVendasProdutos = new DAOVendasProdutos();

    /**
    * grava VendasProdutos
    * @param pModelVendasProdutos
    * return int
    */
    public int salvarVendasProdutosController(ModelVendasProdutos pModelVendasProdutos){
        return this.daoVendasProdutos.salvarVendasProdutosDAO(pModelVendasProdutos);
    }

    /**
    * recupera VendasProdutos
    * @param pVendaProdutoId
    * return ModelVendasProdutos
    */
    public ModelVendasProdutos getVendasProdutosController(int pVendaProdutoId){
        return this.daoVendasProdutos.getVendasProdutosDAO(pVendaProdutoId);
    }

    /**
    * recupera uma lista deVendasProdutos
    * @param pVendaProdutoId
    * return ArrayList
    */
    public ArrayList<ModelVendasProdutos> getListaVendasProdutosController(){
        return this.daoVendasProdutos.getListaVendasProdutosDAO();
    }

    /**
    * atualiza VendasProdutos
    * @param pModelVendasProdutos
    * return boolean
    */
    public boolean atualizarVendasProdutosController(ModelVendasProdutos pModelVendasProdutos){
        return this.daoVendasProdutos.atualizarVendasProdutosDAO(pModelVendasProdutos);
    }

    /**
    * exclui VendasProdutos
    * @param pVendaProdutoId
    * return boolean
    */
    public boolean excluirVendasProdutosController(int pVendaProdutoId){
        return this.daoVendasProdutos.excluirVendasProdutosDAO(pVendaProdutoId);
    }
    
    /**
     * Salva uma lista de produtos
     * @param pListaModelVendasProdutos
     * @return 
     */
    public boolean salvarVendasProdutosController(ArrayList<ModelVendasProdutos> pListaModelVendasProdutos) {
        return this.daoVendasProdutos.salvarVendasProdutosDAO(pListaModelVendasProdutos);
    }
}