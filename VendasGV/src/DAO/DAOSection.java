/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import model.ModelSection;
import connections.ConexaoMySql;
import java.util.ArrayList;

public class DAOSection  extends ConexaoMySql{

    public int salvarSectionDAO(ModelSection pModelSection) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_section ("
                    + "fk_usuario,"
                    + "nome_usuario"
                   
                    + ") VALUES ("
                    + "'" + pModelSection.getSectionUsuario()+ "',"
                    + "'" + pModelSection.getSectionNomeUsuario()+ "')"
                    
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    public ArrayList<ModelSection> getListaSectionDAO() {
        ArrayList<ModelSection> listaModelSection = new ArrayList<>();
        ModelSection modelSection;
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_section,"
                    + "fk_usuario,"
                    + "nome_usuario "
                    + "FROM tbl_section;");

            while (this.getResultSet().next()) {
                modelSection = new ModelSection(); // zera a variável para evitar erros de sobrescrita
                modelSection.setSectionId(this.getResultSet().getInt(1));
                modelSection.setSectionUsuario(this.getResultSet().getInt(2));
                modelSection.setSectionNomeUsuario(this.getResultSet().getString(3));
                
                listaModelSection.add(modelSection);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }

        return listaModelSection;
    }
    
}
