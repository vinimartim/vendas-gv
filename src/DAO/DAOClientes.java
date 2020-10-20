package DAO;

import connections.ConexaoMySql;
import java.util.ArrayList;
import model.ModelClientes;


public class DAOClientes extends ConexaoMySql {

    /**
     * Cadastrar no banco
     *
     * @param pModelClientes
     * @return boolean
     */
    public int salvarClienteDAO(ModelClientes pModelClientes) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_clientes ("
                    + "nome,"
                    + "cpf,"
                    + "email,"
                    + "telefone,"
                    + "endereco,"
                    + "bairro,"
                    + "cidade,"
                    + "estado"
                    + ") VALUES ("
                    + "'" + pModelClientes.getClienteNome() + "',"
                    + "'" + pModelClientes.getClienteCpf() + "',"
                    + "'" + pModelClientes.getClienteEmail() + "',"
                    + "'" + pModelClientes.getClienteTelefone() + "',"
                    + "'" + pModelClientes.getClienteEndereco() + "',"
                    + "'" + pModelClientes.getClienteBairro() + "',"
                    + "'" + pModelClientes.getClienteCidade() + "',"
                    + "'" + pModelClientes.getClienteEstado() + "')"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * Excluir cliente
     *
     * @param pClienteId
     * @return boolean
     */
    public boolean excluirClienteDAO(int pClienteId) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_clientes WHERE pk_id_cliente = '" + pClienteId + "'"
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
     * @param pModelClientes
     * @return boolean
     */
    public boolean alterarClienteDAO(ModelClientes pModelClientes) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL("UPDATE tbl_clientes SET "
                    + "nome = '" + pModelClientes.getClienteNome() + "',"
                    + "cpf = '" + pModelClientes.getClienteCpf() + "',"
                    + "email = '" + pModelClientes.getClienteEmail() + "',"
                    + "telefone = '" + pModelClientes.getClienteTelefone() + "',"
                    + "endereco = '" + pModelClientes.getClienteEndereco() + "',"
                    + "bairro = '" + pModelClientes.getClienteBairro() + "',"
                    + "cidade = '" + pModelClientes.getClienteCidade() + "',"
                    + "estado = '" + pModelClientes.getClienteEstado() + "'"            
                    + " WHERE pk_id_cliente = '" + pModelClientes.getClienteId() + "'");
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
     * @param pClienteId
     * @return objeto produto
     */
    public ModelClientes getClienteDAO(int pClienteId) {
        ModelClientes modelClientes = new ModelClientes();

        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_cliente,"
                    + "nome,"
                    + "cpf,"
                    + "email,"
                    + "telefone,"
                    + "endereco,"
                    + "bairro,"
                    + "cidade,"
                    + "estado "
                    + "FROM tbl_clientes WHERE pk_id_cliente = '" + pClienteId + "'");
            while (this.getResultSet().next()) {
                modelClientes = new ModelClientes(); // zera a variável para evitar erros de sobrescrita
                modelClientes.setClienteId(this.getResultSet().getInt(1));
                modelClientes.setClienteNome(this.getResultSet().getString(2));
                modelClientes.setClienteCpf(this.getResultSet().getString(3));
                modelClientes.setClienteEmail(this.getResultSet().getString(4));
                modelClientes.setClienteTelefone(this.getResultSet().getString(5));
                modelClientes.setClienteEndereco(this.getResultSet().getString(6));
                modelClientes.setClienteBairro(this.getResultSet().getString(7));
                modelClientes.setClienteCidade(this.getResultSet().getString(8));
                modelClientes.setClienteEstado(this.getResultSet().getString(9));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelClientes;
    }
    
    /**
     * Retorna um produto
     *
     * @param pClienteNome
     * @return objeto produto
     */
    public ModelClientes getClienteDAO(String pClienteNome) {
        ModelClientes modelClientes = new ModelClientes();

        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_cliente,"
                    + "nome,"
                    + "cpf,"
                    + "email,"
                    + "telefone,"
                    + "endereco,"
                    + "bairro,"
                    + "cidade,"
                    + "estado "
                    + "FROM tbl_clientes WHERE nome = '" + pClienteNome + "'");
            while (this.getResultSet().next()) {
                modelClientes = new ModelClientes(); // zera a variável para evitar erros de sobrescrita
                modelClientes.setClienteId(this.getResultSet().getInt(1));
                modelClientes.setClienteNome(this.getResultSet().getString(2));
                modelClientes.setClienteCpf(this.getResultSet().getString(3));
                modelClientes.setClienteEmail(this.getResultSet().getString(4));
                modelClientes.setClienteTelefone(this.getResultSet().getString(5));
                modelClientes.setClienteEndereco(this.getResultSet().getString(6));
                modelClientes.setClienteBairro(this.getResultSet().getString(7));
                modelClientes.setClienteCidade(this.getResultSet().getString(8));
                modelClientes.setClienteEstado(this.getResultSet().getString(9));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelClientes;
    }

    /**
     * Retorna lista de todos os clientes
     *
     * @return lista dos produtos
     */
    public ArrayList<ModelClientes> getListaClientes() {
        ArrayList<ModelClientes> listaModelClientes = new ArrayList<>();
        ModelClientes modelClientes = new ModelClientes();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_cliente,"
                    + "nome,"
                    + "cpf,"
                    + "email,"
                    + "telefone,"
                    + "endereco,"
                    + "bairro,"
                    + "cidade,"
                    + "estado "
                    + "FROM tbl_clientes;");

            while (this.getResultSet().next()) {
                modelClientes = new ModelClientes(); // zera a variável para evitar erros de sobrescrita
                modelClientes.setClienteId(this.getResultSet().getInt(1));
                modelClientes.setClienteNome(this.getResultSet().getString(2));
                modelClientes.setClienteCpf(this.getResultSet().getString(3));
                modelClientes.setClienteEmail(this.getResultSet().getString(4));
                modelClientes.setClienteTelefone(this.getResultSet().getString(5));
                modelClientes.setClienteEndereco(this.getResultSet().getString(6));
                modelClientes.setClienteBairro(this.getResultSet().getString(7));
                modelClientes.setClienteCidade(this.getResultSet().getString(8));
                modelClientes.setClienteEstado(this.getResultSet().getString(9));
                listaModelClientes.add(modelClientes);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }

        return listaModelClientes;
    }
}
