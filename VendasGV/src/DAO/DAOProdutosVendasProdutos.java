package DAO;

import conections.ConexaoMySql;
import java.util.ArrayList;
import model.ModelProdutos;
import model.ModelProdutosVendasProdutos;
import model.ModelVendasProdutos;

public class DAOProdutosVendasProdutos extends ConexaoMySql{
    
    public ArrayList<ModelProdutosVendasProdutos> getListaProdutosVendasProdutosDAO(int pCodigoVenda) {
        ArrayList<ModelProdutosVendasProdutos> listaModelProdutosVendasProdutos = new ArrayList<>();
        ModelProdutosVendasProdutos modelProdutosVendasProdutos = new ModelProdutosVendasProdutos();
        ModelProdutos modelProdutos = new ModelProdutos();
        ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
        
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "tbl_produtos.pk_id_produto,"
                    + "tbl_produtos.nome,"
                    + "tbl_produtos.preco,"
                    + "tbl_produtos.descricao,"
                    + "tbl_produtos.obs,"
                    + "tbl_produtos.estoque,"
                    + "tbl_vendas_produtos.pk_id_venda_produto,"
                    + "tbl_vendas_produtos.fk_produto,"
                    + "tbl_vendas_produtos.fk_venda,"
                    + "tbl_vendas_produtos.valor,"
                    + "tbl_vendas_produtos.qtd "
                    + "FROM tbl_vendas_produtos "
                    + "INNER JOIN tbl_produtos ON tbl_produtos.pk_id_produto = tbl_vendas_produtos.fk_produto "
                    + "WHERE tbl_vendas_produtos.fk_venda = '"+pCodigoVenda+"';");
            
            while(this.getResultSet().next()) {
                modelProdutosVendasProdutos = new ModelProdutosVendasProdutos();
                modelProdutos = new ModelProdutos();
                modelVendasProdutos = new ModelVendasProdutos();
                
                modelProdutos.setProdId(this.getResultSet().getInt(1));
                modelProdutos.setProdNome(this.getResultSet().getString(2));
                modelProdutos.setProdPreco(this.getResultSet().getDouble(3));
                modelProdutos.setProdDescricao(this.getResultSet().getString(4));
                modelProdutos.setProdObs(this.getResultSet().getString(5));
                modelProdutos.setProdEstoque(this.getResultSet().getInt(6));
                
                modelVendasProdutos.setVendaProdutoId(this.getResultSet().getInt(7));
                modelVendasProdutos.setProduto(this.getResultSet().getInt(8));
                modelVendasProdutos.setVenda(this.getResultSet().getInt(9));
                modelVendasProdutos.setVenProValor(this.getResultSet().getDouble(10));
                modelVendasProdutos.setVenProQtd(this.getResultSet().getInt(11));
                
                modelProdutosVendasProdutos.setModelProdutos(modelProdutos);
                modelProdutosVendasProdutos.setModelVendasProdutos(modelVendasProdutos);
                
                listaModelProdutosVendasProdutos.add(modelProdutosVendasProdutos);
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            fecharConexao();
        }
        
        return listaModelProdutosVendasProdutos;
    }
    
}
