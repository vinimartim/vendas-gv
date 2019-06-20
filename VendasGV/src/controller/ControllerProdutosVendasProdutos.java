package controller;

import DAO.DAOProdutosVendasProdutos;
import java.util.ArrayList;
import model.ModelProdutosVendasProdutos;

public class ControllerProdutosVendasProdutos {
    private DAOProdutosVendasProdutos daoProdutosVendasProdutos = new DAOProdutosVendasProdutos();
    
    /**
     * Retorna uma lista com vendas-produtos
     * @param pCodigoVenda
     * @return 
     */
    public ArrayList<ModelProdutosVendasProdutos> getListaProdutosVendasProdutosController(int pCodigoVenda) {
        return this.daoProdutosVendasProdutos.getListaProdutosVendasProdutosDAO(pCodigoVenda);
    }
}
