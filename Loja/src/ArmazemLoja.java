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
}

