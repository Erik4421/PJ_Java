public class Loja {
    Cliente cliente;
    ArmazemLoja armazem;

    private int cnpj;
    private double saldo;

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


}