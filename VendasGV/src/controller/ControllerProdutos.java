package controller;

import DAO.DaoProdutos;
import java.util.ArrayList;
import model.ModelProdutos;

public class ControllerProdutos {
    private DaoProdutos daoProdutos = new DaoProdutos();
    
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
    public ModelProdutos retornaProdutoController(int pCodigo) {
        return this.daoProdutos.retornarProdutoDAO(pCodigo);
    }
    
    /**
     * Retornar lista de produtos controller
     * @return 
     */
    public ArrayList<ModelProdutos> retornarListaProdutosController() {
        return this.daoProdutos.retornarListaProdutos();
    }
    
}
