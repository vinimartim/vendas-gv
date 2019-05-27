package model;



public class ModelProdutos {
    private int idProduto;
    private String prodNome;
    private Double prodPreco;
    private String prodDescricao;
    private String prodObs;
    private int prodEstoque;

    /**
     * @return the idProduto
     */
    public int getIdProduto() {
        return idProduto;
    }

    /**
     * @param idProduto the idProduto to set
     */
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    /**
     * @return the prodNome
     */
    public String getProdNome() {
        return prodNome;
    }

    /**
     * @param prodNome the prodNome to set
     */
    public void setProdNome(String prodNome) {
        this.prodNome = prodNome;
    }

    /**
     * @return the prodPreco
     */
    public Double getProdPreco() {
        return prodPreco;
    }

    /**
     * @param prodPreco the prodPreco to set
     */
    public void setProdPreco(Double prodPreco) {
        this.prodPreco = prodPreco;
    }

    /**
     * @return the prodDescricao
     */
    public String getProdDescricao() {
        return prodDescricao;
    }

    /**
     * @param prodDescricao the prodDescricao to set
     */
    public void setProdDescricao(String prodDescricao) {
        this.prodDescricao = prodDescricao;
    }

    /**
     * @return the prodObs
     */
    public String getProdObs() {
        return prodObs;
    }

    /**
     * @param prodObs the prodObs to set
     */
    public void setProdObs(String prodObs) {
        this.prodObs = prodObs;
    }

    /**
     * @return the prodEstoque
     */
    public int getProdEstoque() {
        return prodEstoque;
    }

    /**
     * @param prodEstoque the prodEstoque to set
     */
    public void setProdEstoque(int prodEstoque) {
        this.prodEstoque = prodEstoque;
    }
    
}
