package model;
/**
*
* @author Vinicius
*/
public class ModelVendasProdutos {

    private int VendaProdutoId;
    private int produto;
    private int  venda;
    private double venProValor;
    private int venProQtd;

    /**
    * Construtor
    */
    public ModelVendasProdutos(){}

    /**
    * seta o valor de VendaProdutoId
    * @param pVendaProdutoId
    */
    public void setVendaProdutoId(int pVendaProdutoId){
        this.VendaProdutoId = pVendaProdutoId;
    }
    /**
    * return pk_VendaProdutoId
    */
    public int getVendaProdutoId(){
        return this.VendaProdutoId;
    }

    /**
    * seta o valor de produto
    * @param pProduto
    */
    public void setProduto(int pProduto){
        this.produto = pProduto;
    }
    /**
    * return fk_produto
    */
    public int getProduto(){
        return this.produto;
    }

    /**
    * seta o valor de venda
    * @param pVenda
    */
    public void setVenda(int  pVenda){
        this.venda = pVenda;
    }
    /**
    * return fk_venda
    */
    public int  getVenda(){
        return this.venda;
    }

    /**
    * seta o valor de venProValor
    * @param pVenProValor
    */
    public void setVenProValor(double pVenProValor){
        this.venProValor = pVenProValor;
    }
    /**
    * return venProValor
    */
    public double getVenProValor(){
        return this.venProValor;
    }

    /**
    * seta o valor de venProQtd
    * @param pVenProQtd
    */
    public void setVenProQtd(int pVenProQtd){
        this.venProQtd = pVenProQtd;
    }
    /**
    * return venProQtd
    */
    public int getVenProQtd(){
        return this.venProQtd;
    }

    @Override
    public String toString(){
        return "ModelVendasProdutos {" + "::VendaProdutoId = " + this.VendaProdutoId + "::produto = " + this.produto + "::venda = " + this.venda + "::venProValor = " + this.venProValor + "::venProQtd = " + this.venProQtd +  "}";
    }
}