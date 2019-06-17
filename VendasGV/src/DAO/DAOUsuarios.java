package DAO;

import model.ModelUsuarios;
import conections.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Vinicius Lisboa
*/
public class DAOUsuarios extends ConexaoMySql {
    
    
    /**
    * grava Usuarios
    * @param pModelUsuarios
    * return int
    */
    public int salvarUsuariosDAO(ModelUsuarios pModelUsuarios){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_usuarios ("
                    + "nome,"
                    + "email,"
                    + "senha"
                + ") VALUES ("
                    + "'" + pModelUsuarios.getUsuarioNome() + "',"
                    + "'" + pModelUsuarios.getUsuarioEmail() + "',"
                    + "'" + pModelUsuarios.getUsuarioSenha() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera Usuarios
    * @param pUsuarioId
    * return ModelUsuarios
    */
    public ModelUsuarios getUsuariosDAO(int pUsuarioId){
        ModelUsuarios modelUsuarios = new ModelUsuarios();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_usuario,"
                    + "nome,"
                    + "email,"
                    + "senha"
                 + " FROM"
                     + " tbl_usuarios"
                 + " WHERE"
                     + " pk_id_usuario = '" + pUsuarioId + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelUsuarios.setUsuarioId(this.getResultSet().getInt(1));
                modelUsuarios.setUsuarioNome(this.getResultSet().getString(2));
                modelUsuarios.setUsuarioEmail(this.getResultSet().getString(3));
                modelUsuarios.setUsuarioSenha(this.getResultSet().getString(4));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelUsuarios;
    }

    /**
    * recupera uma lista de Usuarios
        * return ArrayList
    */
    public ArrayList<ModelUsuarios> getListaUsuariosDAO(){
        ArrayList<ModelUsuarios> listamodelUsuarios = new ArrayList();
        ModelUsuarios modelUsuarios = new ModelUsuarios();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_usuario,"
                    + "nome,"
                    + "email,"
                    + "senha"
                 + " FROM"
                     + " tbl_usuarios"
                + ";"
            );

            while(this.getResultSet().next()){
                modelUsuarios = new ModelUsuarios();
                modelUsuarios.setUsuarioId(this.getResultSet().getInt(1));
                modelUsuarios.setUsuarioNome(this.getResultSet().getString(2));
                modelUsuarios.setUsuarioEmail(this.getResultSet().getString(3));
                modelUsuarios.setUsuarioSenha(this.getResultSet().getString(4));
                listamodelUsuarios.add(modelUsuarios);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelUsuarios;
    }

    /**
    * atualiza Usuarios
    * @param pModelUsuarios
    * return boolean
    */
    public boolean atualizarUsuariosDAO(ModelUsuarios pModelUsuarios){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_usuarios SET "
                    + "pk_id_usuario = '" + pModelUsuarios.getUsuarioId() + "',"
                    + "nome = '" + pModelUsuarios.getUsuarioNome() + "',"
                    + "email = '" + pModelUsuarios.getUsuarioEmail() + "',"
                    + "senha = '" + pModelUsuarios.getUsuarioSenha() + "'"
                + " WHERE "
                    + "pk_id_usuario = '" + pModelUsuarios.getUsuarioId() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui Usuarios
    * @param pUsuarioId
    * return boolean
    */
    public boolean excluirUsuariosDAO(int pUsuarioId){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_usuarios "
                + " WHERE "
                    + "pk_id_usuario = '" + pUsuarioId + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
    
    public boolean getValidarUsuarioDAO(ModelUsuarios pModelUsuarios) {
        ModelUsuarios modelUsuarios = new ModelUsuarios();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "email,"
                    + "senha"
                 + " FROM"
                     + " tbl_usuarios"
                 + " WHERE"
                     + " email = '" + pModelUsuarios.getUsuarioEmail() + "' AND senha = '" + pModelUsuarios.getUsuarioSenha() + "'"
                + ";"
            );

            if(getResultSet().next()) {
                return true;
            } else {
                return false;
            }
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}