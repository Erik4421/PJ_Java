import java.util.List;

public class Loja {
    Cliente cliente;
    Admin admin;
    ArmazemLoja armazemLoja;

    private int cnpj;
    private double saldo;

    // Constructor to initialize admin and armazemLoja
    public Loja(ArmazemLoja armazemLoja) {
        this.armazemLoja = armazemLoja;
        this.admin = new Admin(armazemLoja);
    }

    // Setters
    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    // Getters
    public double getSaldo() {
        return saldo;
    }
    public int getCnpj() {
        return cnpj;
    }

    void exibirProdutos() {
        System.out.printf("%-5s %-20s %-10s %-5s%n","ID", "Produto", "Preço", "Qtd");
        System.out.println("--------------------------------------------------");
        int id = 1;
        for (List<Object> produto : armazemLoja.getProdutos()) {
            String nome = (String) produto.get(0);
            double preco = (double) produto.get(1);
            int quantidade = (int) produto.get(2);
            System.out.printf("%-5d %-20s %-10.2f %-5d%n", id, nome, preco, quantidade);
            id++;
        }
    }
}