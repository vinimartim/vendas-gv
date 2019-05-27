package DAO;

import conections.ConexaoMySql;
import java.util.ArrayList;
import model.ModelProdutos;

public class DaoProdutos extends ConexaoMySql {

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
     * @param pIdProduto
     * @return boolean
     */
    public boolean excluirProdutoDAO(int pIdProduto) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_produtos WHERE pk_id_produto = '" + pIdProduto + "'"
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
                    + " WHERE pk_id_produto = '" + pModelProdutos.getIdProduto() + "'");
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
     * @param pIdProduto
     * @return objeto produto
     */
    public ModelProdutos retornarProdutoDAO(int pIdProduto) {
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
                    + "FROM tbl_produtos WHERE pk_id_produto = '" + pIdProduto + "'");
            while (this.getResultSet().next()) {
                modelProdutos = new ModelProdutos(); // zera a variável para evitar erros de sobrescrita
                modelProdutos.setIdProduto(this.getResultSet().getInt(1));
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
    public ArrayList<ModelProdutos> retornarListaProdutos() {
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
                modelProdutos.setIdProduto(this.getResultSet().getInt(1));
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
}
