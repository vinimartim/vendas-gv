package model;

import java.util.Date;

/**
*
* @author Vinicius
*/
public class ModelVendas {

    private int VendaId;
    private int cliente;
    private int usuario;
    private Date vendaData;
    private double vendaValorLiquido;
    private double vendaValorBruto;
    private double vendaDesconto;

    /**
    * Construtor
    */
    public ModelVendas(){}

    /**
    * seta o valor de VendaId
    * @param pVendaId
    */
    public void setVendaId(int pVendaId){
        this.VendaId = pVendaId;
    }
    /**
    * return pk_VendaId
    */
    public int getVendaId(){
        return this.VendaId;
    }

    /**
    * seta o valor de cliente
    * @param pCliente
    */
    public void setCliente(int pCliente){
        this.cliente = pCliente;
    }
    /**
    * return fk_cliente
    */
    public int getCliente(){
        return this.cliente;
    }

    /**
    * seta o valor de vendaData
    * @param pVendaData
    */
    public void setVendaData(Date pVendaData){
        this.vendaData = pVendaData;
    }
    /**
    * return vendaData
    */
    public Date getVendaData(){
        return this.vendaData;
    }

    /**
    * seta o valor de vendaValorLiquido
    * @param pVendaValorLiquido
    */
    public void setVendaValorLiquido(double pVendaValorLiquido){
        this.vendaValorLiquido = pVendaValorLiquido;
    }
    /**
    * return vendaValorLiquido
    */
    public double getVendaValorLiquido(){
        return this.vendaValorLiquido;
    }

    /**
    * seta o valor de vendaValorBruto
    * @param pVendaValorBruto
    */
    public void setVendaValorBruto(double pVendaValorBruto){
        this.vendaValorBruto = pVendaValorBruto;
    }
    /**
    * return vendaValorBruto
    */
    public double getVendaValorBruto(){
        return this.vendaValorBruto;
    }

    /**
    * seta o valor de vendaDesconto
    * @param pVendaDesconto
    */
    public void setVendaDesconto(double pVendaDesconto){
        this.vendaDesconto = pVendaDesconto;
    }
    /**
    * return vendaDesconto
    */
    public double getVendaDesconto(){
        return this.vendaDesconto;
    }

    @Override
    public String toString(){
        return "ModelVendas {" + "::VendaId = " + this.VendaId + "::cliente = " + this.cliente + "::vendaData = " + this.vendaData + "::vendaValorLiquido = " + this.vendaValorLiquido + "::vendaValorBruto = " + this.vendaValorBruto + "::vendaDesconto = " + this.vendaDesconto +  "}";
    }

    /**
     * @return the usuario
     */
    public int getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }
}