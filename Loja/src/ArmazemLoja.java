import java.util.ArrayList;
import java.util.List;

public class ArmazemLoja {
    private List<List<Object>> produtos = new ArrayList<>();

    public void setProduto(String nomeProduto, double precoProduto, int quantidadeProduto) {
        List<Object> tuplaProduto = new ArrayList<>();

        tuplaProduto.add(nomeProduto);
        tuplaProduto.add(precoProduto);
        tuplaProduto.add(quantidadeProduto);

        produtos.add(tuplaProduto);
    }

    public List<List<Object>> getProdutos() {
        return produtos;
    }

    public void mostrarProdutos() {
        System.out.println(produtos);
    }

    public void alterarQuantidade(int idProduto, int quantidade) {
        List<Object> produto = produtos.get(idProduto);

        int quantidadeAtual = (int) produto.get(2);
        int novaQuantidade = quantidadeAtual - quantidade;

        produto.set(2, novaQuantidade);
        produtos.set(idProduto, produto);
    }
}

