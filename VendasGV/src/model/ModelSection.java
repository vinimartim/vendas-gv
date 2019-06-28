package model;


public class ModelSection {
    private int sectionId;
    private int sectionUsuario;
    private String sectionNomeUsuario;

    /**
     * @return the sectionId
     */
    public int getSectionId() {
        return sectionId;
    }

    /**
     * @param sectionId the sectionId to set
     */
    public void setSectionId(int sectionId) {
        this.sectionId = sectionId;
    }

    /**
     * @return the sectionUsuario
     */
    public int getSectionUsuario() {
        return sectionUsuario;
    }

    /**
     * @param sectionUsuario the sectionUsuario to set
     */
    public void setSectionUsuario(int sectionUsuario) {
        this.sectionUsuario = sectionUsuario;
    }

    /**
     * @return the sectionNomeUsuario
     */
    public String getSectionNomeUsuario() {
        return sectionNomeUsuario;
    }

    /**
     * @param sectionNomeUsuario the sectionNomeUsuario to set
     */
    public void setSectionNomeUsuario(String sectionNomeUsuario) {
        this.sectionNomeUsuario = sectionNomeUsuario;
    }
}
