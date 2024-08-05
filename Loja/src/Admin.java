public class Admin extends Usuario{
    Loja loja;
    ArmazemLoja armazemLoja;
    
    public Admin(ArmazemLoja armazemLoja) {
        this.armazemLoja = armazemLoja;
    }

    public void adicionarProduto(String nomeProduto, double precoProduto, int quantidadeProduto) {
        armazemLoja.setProduto(nomeProduto, precoProduto, quantidadeProduto);
    }

}
