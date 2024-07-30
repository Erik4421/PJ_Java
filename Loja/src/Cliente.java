public class Cliente extends Usuario{
    Loja loja;
    
    Cliente(String nome, int cpf, double saldo) {
        super(nome, cpf, saldo);
    }
}
