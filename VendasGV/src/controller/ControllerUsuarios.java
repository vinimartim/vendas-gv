package controller;

import model.ModelUsuarios;
import DAO.DAOUsuarios;
import java.util.ArrayList;

/**
*
* @author Vinicius Lisboa
*/
public class ControllerUsuarios {

    private DAOUsuarios daoUsuarios = new DAOUsuarios();

    /**
    * grava Usuarios
    * @param pModelUsuarios
    * return int
    */
    public int salvarUsuariosController(ModelUsuarios pModelUsuarios){
        return this.daoUsuarios.salvarUsuariosDAO(pModelUsuarios);
    }

    /**
    * recupera Usuarios
    * @param pUsuarioId
    * return ModelUsuarios
    */
    public ModelUsuarios getUsuariosController(int pUsuarioId){
        return this.daoUsuarios.getUsuariosDAO(pUsuarioId);
    }

    /**
    * recupera uma lista deUsuarios
    * @param pUsuarioId
    * return ArrayList
    */
    public ArrayList<ModelUsuarios> getListaUsuariosController(){
        return this.daoUsuarios.getListaUsuariosDAO();
    }

    /**
    * atualiza Usuarios
    * @param pModelUsuarios
    * return boolean
    */
    public boolean atualizarUsuariosController(ModelUsuarios pModelUsuarios){
        return this.daoUsuarios.atualizarUsuariosDAO(pModelUsuarios);
    }

    /**
    * exclui Usuarios
    * @param pUsuarioId
    * return boolean
    */
    public boolean excluirUsuariosController(int pUsuarioId){
        return this.daoUsuarios.excluirUsuariosDAO(pUsuarioId);
    }
    
    /**
     * Validar login e senha
     * @param pModelUsuarios
     * @return 
     */
    public boolean getValidarUsuarioController(ModelUsuarios pModelUsuarios) {
        return this.daoUsuarios.getValidarUsuarioDAO(pModelUsuarios);
    }
}