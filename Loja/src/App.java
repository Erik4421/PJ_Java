public class App {
    public static void main(String[] args) throws Exception {
        ArmazemLoja armazemLoja = new ArmazemLoja();
        Admin admin = new Admin(armazemLoja);
        Loja loja = new Loja(armazemLoja);
        Cliente cliente = new Cliente();
        loja.setCliente(cliente);
        

        admin.adicionarProduto("Maça", 2, 100);
        admin.adicionarProduto("Abacate", 5, 100);
        admin.adicionarProduto("Uva", 0.5, 100);
        admin.adicionarProduto("Limão", 0.75, 100);

        loja.exibirProdutos();  
        cliente.comprarProduto(1, 10);
        loja.venderProduto();
        loja.exibirProdutos(); 
        System.out.println("Saldo da loja: " + loja.getSaldo());
    }
}
