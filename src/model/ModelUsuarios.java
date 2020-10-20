package model;
/**
*
* @author Vinicius Lisboa
*/
public class ModelUsuarios {

    private int UsuarioId;
    private String UsuarioNome;
    private String UsuarioEmail;
    private String UsuarioSenha;

    /**
    * Construtor
    */
    public ModelUsuarios(){}

    /**
    * seta o valor de UsuarioId
    * @param pUsuarioId
    */
    public void setUsuarioId(int pUsuarioId){
        this.UsuarioId = pUsuarioId;
    }
    /**
    * return pk_UsuarioId
    */
    public int getUsuarioId(){
        return this.UsuarioId;
    }

    /**
    * seta o valor de UsuarioNome
    * @param pUsuarioNome
    */
    public void setUsuarioNome(String pUsuarioNome){
        this.UsuarioNome = pUsuarioNome;
    }
    /**
    * return UsuarioNome
    */
    public String getUsuarioNome(){
        return this.UsuarioNome;
    }

    /**
    * seta o valor de UsuarioEmail
    * @param pUsuarioEmail
    */
    public void setUsuarioEmail(String pUsuarioEmail){
        this.UsuarioEmail = pUsuarioEmail;
    }
    /**
    * return UsuarioEmail
    */
    public String getUsuarioEmail(){
        return this.UsuarioEmail;
    }

    /**
    * seta o valor de UsuarioSenha
    * @param pUsuarioSenha
    */
    public void setUsuarioSenha(String pUsuarioSenha){
        this.UsuarioSenha = pUsuarioSenha;
    }
    /**
    * return UsuarioSenha
    */
    public String getUsuarioSenha(){
        return this.UsuarioSenha;
    }

    @Override
    public String toString(){
        return "ModelUsuarios {" + "::UsuarioId = " + this.UsuarioId + "::UsuarioNome = " + this.UsuarioNome + "::UsuarioEmail = " + this.UsuarioEmail + "::UsuarioSenha = " + this.UsuarioSenha +  "}";
    }
}