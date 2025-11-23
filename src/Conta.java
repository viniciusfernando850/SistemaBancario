public class Conta {
    protected String numero;
    protected String agencia;
    protected double saldo;
    protected Cliente cliente;

    public Conta(String numero, String agencia, double saldo, Cliente cliente){
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.cliente = cliente;
    }
}
