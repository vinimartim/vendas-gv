package DAO;

import conections.ConexaoMySql;
import java.util.ArrayList;
import model.ModelProdutos;

public class DAOProdutos extends ConexaoMySql {

    /**
     * Cadastrar no banco
     *
     * @param pModelProdutos
     * @return boolean
     */
    public int salvarProdutoDAO(ModelProdutos pModelProdutos) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_produtos ("
                    + "nome,"
                    + "preco,"
                    + "descricao,"
                    + "obs,"
                    + "estoque"
                    + ") VALUES ("
                    + "'" + pModelProdutos.getProdNome() + "',"
                    + "'" + pModelProdutos.getProdPreco() + "',"
                    + "'" + pModelProdutos.getProdDescricao() + "',"
                    + "'" + pModelProdutos.getProdObs() + "',"
                    + "'" + pModelProdutos.getProdEstoque() + "')"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * Excluir produto
     *
     * @param pProdId
     * @return boolean
     */
    public boolean excluirProdutoDAO(int pProdId) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_produtos WHERE pk_id_produto = '" + pProdId + "'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * Alterar produto
     *
     * @param pModelProdutos
     * @return boolean
     */
    public boolean alterarProdutoDAO(ModelProdutos pModelProdutos) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL("UPDATE tbl_produtos SET "
                    + "nome = '" + pModelProdutos.getProdNome() + "',"
                    + "preco = '" + pModelProdutos.getProdPreco() + "',"
                    + "descricao = '" + pModelProdutos.getProdDescricao() + "',"
                    + "obs = '" + pModelProdutos.getProdObs() + "',"
                    + "estoque = '" + pModelProdutos.getProdEstoque() + "'"
                    + " WHERE pk_id_produto = '" + pModelProdutos.getProdId() + "'");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * Retorna um produto
     *
     * @param pProdId
     * @return objeto produto
     */
    public ModelProdutos getProdutoDAO(int pProdId) {
        ModelProdutos modelProdutos = new ModelProdutos();

        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_produto,"
                    + "nome,"
                    + "preco,"
                    + "descricao,"
                    + "obs,"
                    + "estoque "
                    + "FROM tbl_produtos WHERE pk_id_produto = '" + pProdId + "'");
            while (this.getResultSet().next()) {
                modelProdutos = new ModelProdutos(); // zera a variável para evitar erros de sobrescrita
                modelProdutos.setProdId(this.getResultSet().getInt(1));
                modelProdutos.setProdNome(this.getResultSet().getString(2));
                modelProdutos.setProdPreco(this.getResultSet().getDouble(3));
                modelProdutos.setProdDescricao(this.getResultSet().getString(4));
                modelProdutos.setProdObs(this.getResultSet().getString(5));
                modelProdutos.setProdEstoque(this.getResultSet().getInt(6));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelProdutos;
    }
    
    /**
     * Retorna um produto
     *
     * @param pProdNome
     * @return objeto produto
     */
    public ModelProdutos getProdutoDAO(String pProdNome) {
        ModelProdutos modelProdutos = new ModelProdutos();

        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_produto,"
                    + "nome,"
                    + "preco,"
                    + "descricao,"
                    + "obs,"
                    + "estoque "
                    + "FROM tbl_produtos WHERE nome = '" + pProdNome + "'");
            while (this.getResultSet().next()) {
                modelProdutos = new ModelProdutos(); // zera a variável para evitar erros de sobrescrita
                modelProdutos.setProdId(this.getResultSet().getInt(1));
                modelProdutos.setProdNome(this.getResultSet().getString(2));
                modelProdutos.setProdPreco(this.getResultSet().getDouble(3));
                modelProdutos.setProdDescricao(this.getResultSet().getString(4));
                modelProdutos.setProdObs(this.getResultSet().getString(5));
                modelProdutos.setProdEstoque(this.getResultSet().getInt(6));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelProdutos;
    }

    /**
     * Retorna lista de todos os produtos
     *
     * @return lista dos produtos
     */
    public ArrayList<ModelProdutos> getListaProdutos() {
        ArrayList<ModelProdutos> listaModelProdutos = new ArrayList<>();
        ModelProdutos modelProdutos = new ModelProdutos();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_produto,"
                    + "nome,"
                    + "preco,"
                    + "descricao,"
                    + "obs,"
                    + "estoque "
                    + "FROM tbl_produtos;");

            while (this.getResultSet().next()) {
                modelProdutos = new ModelProdutos(); // zera a variável para evitar erros de sobrescrita
                modelProdutos.setProdId(this.getResultSet().getInt(1));
                modelProdutos.setProdNome(this.getResultSet().getString(2));
                modelProdutos.setProdPreco(this.getResultSet().getDouble(3));
                modelProdutos.setProdDescricao(this.getResultSet().getString(4));
                modelProdutos.setProdObs(this.getResultSet().getString(5));
                modelProdutos.setProdEstoque(this.getResultSet().getInt(6));
                listaModelProdutos.add(modelProdutos);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }

        return listaModelProdutos;
    }

    /**
     * Altera o estoque do produto
     * @param pListaModelProdutos
     * @return 
     */
    public boolean alterarEstoqueProdutoDAO(ArrayList<ModelProdutos> pListaModelProdutos) {
        try {
            this.conectar();
            int tamanho = pListaModelProdutos.size();
            
            // Percorre a lista com os produtos
            for (int i = 0; i < tamanho; i++) {
                this.executarUpdateDeleteSQL("UPDATE tbl_produtos SET "
                    + "estoque = '" + pListaModelProdutos.get(i).getProdEstoque() + "'"
                    + " WHERE pk_id_produto = '" + pListaModelProdutos.get(i).getProdId() + "'");
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
