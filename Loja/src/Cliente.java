public class Cliente extends Usuario{
    Loja loja;  
    private int idProduto, quantidade;

    void comprarProduto(int idProduto, int quantidade) {
        this.idProduto = idProduto;
        this.quantidade = quantidade;
    }

    public int getIdProduto() {
        return idProduto;
    }
    public int getQuantidade() {
        return quantidade;
    }
}
