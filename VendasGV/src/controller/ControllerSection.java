package controller;

import DAO.DAOSection;
import java.util.ArrayList;
import model.ModelSection;

public class ControllerSection {
    DAOSection daoSection = new DAOSection();

    /**
     * Salvar section
     * @param pModelSection 
     * @return  
     */
    public int salvarSectionController(ModelSection pModelSection) {
        return this.daoSection.salvarSectionDAO(pModelSection);
    }

    public ArrayList<ModelSection> getListaSectionController() {
        return this.daoSection.getListaSectionDAO();
    }
    
}
