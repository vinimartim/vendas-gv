package controller;

import DAO.DAOProdutos;
import java.util.ArrayList;
import model.ModelProdutos;

public class ControllerProdutos {
    private DAOProdutos daoProdutos = new DAOProdutos();
    
    /**
     * Salvar produtos controller
     * @param pModelProdutos
     * @return boolean
     */
    public int salvarProdutoController(ModelProdutos pModelProdutos) {
        return this.daoProdutos.salvarProdutoDAO(pModelProdutos);
    }
    
    /**
     * Excluir produto controller
     * @param pCodigo
     * @return boolean
     */
    public boolean excluirProdutoController(int pCodigo) {
        return this.daoProdutos.excluirProdutoDAO(pCodigo);
    }
    
    /**
     * Alterar produto controller
     * @param pModelProdutos
     * @return boolean
     */
    public boolean alterarProdutoController(ModelProdutos pModelProdutos) {
        return this.daoProdutos.alterarProdutoDAO(pModelProdutos);
    }
    
    /**
     * Retorna produto controller
     * @param pCodigo
     * @return 
     */
    public ModelProdutos getProdutoController(int pCodigo) {
        return this.daoProdutos.getProdutoDAO(pCodigo);
    }
    
    /**
     * Retorna produto controller
     * @param pProdNome
     * @return 
     */
    public ModelProdutos getProdutoController(String pProdNome) {
        return this.daoProdutos.getProdutoDAO(pProdNome);
    }
    
    /**
     * Retornar lista de produtos controller
     * @return 
     */
    public ArrayList<ModelProdutos> getListaProdutosController() {
        return this.daoProdutos.getListaProdutos();
    }
    
    /**
     * Alterar o estoque de produtos no banco
     * @param pListaModelProdutos
     * @return 
     */
    public boolean alterarEstoqueProdutoController(ArrayList<ModelProdutos> pListaModelProdutos) {
        return this.daoProdutos.alterarEstoqueProdutoDAO(pListaModelProdutos);
    }
    
}
