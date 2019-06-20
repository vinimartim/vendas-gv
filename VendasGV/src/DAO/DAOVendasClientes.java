package DAO;

import conections.ConexaoMySql;
import java.util.ArrayList;
import model.ModelClientes;
import model.ModelVendas;
import model.ModelVendasClientes;

public class DAOVendasClientes extends ConexaoMySql{
    /**
    * recupera uma lista de Vendas
        * return ArrayList
    */
    public ArrayList<ModelVendasClientes> getListaVendasClienteDAO(){
        ArrayList<ModelVendasClientes> listaModelVendasCliente = new ArrayList();
        ModelVendas modelVendas = new ModelVendas();
        ModelClientes modelClientes = new ModelClientes();
        ModelVendasClientes modelVendasCliente = new ModelVendasClientes();        
        
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "tbl_vendas.pk_id_venda,"
                    + "tbl_vendas.fk_cliente,"
                    + "tbl_vendas.data,"
                    + "tbl_vendas.valor_liquido,"
                    + "tbl_vendas.valor_bruto,"
                    + "tbl_vendas.desconto,"
                    + "tbl_clientes.pk_id_cliente,"
                    + "tbl_clientes.nome,"
                    + "tbl_clientes.cpf,"
                    + "tbl_clientes.email,"
                    + "tbl_clientes.telefone,"
                    + "tbl_clientes.endereco,"
                    + "tbl_clientes.bairro,"
                    + "tbl_clientes.cidade,"
                    + "tbl_clientes.estado"
                 + " FROM"
                     + " tbl_vendas INNER JOIN tbl_clientes "
                        + "ON tbl_clientes.pk_id_cliente = tbl_vendas.fk_cliente; "
                + ";"
            );

            //JOIN DE CLIENTES E VENDAS
            while(this.getResultSet().next()){
                modelVendas = new ModelVendas();
                modelClientes = new ModelClientes();
                modelVendasCliente = new ModelVendasClientes();
                
                modelVendas.setVendaId(this.getResultSet().getInt(1));
                modelVendas.setCliente(this.getResultSet().getInt(2));
                modelVendas.setVendaData(this.getResultSet().getDate(3));
                modelVendas.setVendaValorLiquido(this.getResultSet().getDouble(4));
                modelVendas.setVendaValorBruto(this.getResultSet().getDouble(5));
                modelVendas.setVendaDesconto(this.getResultSet().getDouble(6));
                
                modelClientes.setClienteId(this.getResultSet().getInt(7));
                modelClientes.setClienteNome(this.getResultSet().getString(8));
                modelClientes.setClienteCpf(this.getResultSet().getString(9));
                modelClientes.setClienteEmail(this.getResultSet().getString(10));
                modelClientes.setClienteTelefone(this.getResultSet().getString(11));
                modelClientes.setClienteEndereco(this.getResultSet().getString(12));
                modelClientes.setClienteBairro(this.getResultSet().getString(13));
                modelClientes.setClienteCidade(this.getResultSet().getString(14));
                modelClientes.setClienteEstado(this.getResultSet().getString(15));
                
                modelVendasCliente.setModelVendas(modelVendas);
                modelVendasCliente.setModelClientes(modelClientes);
                
                listaModelVendasCliente.add(modelVendasCliente);
                
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listaModelVendasCliente;
    }
}
