public class Conta {
    protected String numero;
    protected String agencia;
    protected double saldo;
    protected Cliente cliente;

    public Conta(String numero, String agencia, double saldo, Cliente cliente) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public String getNumero() {return numero;}
    public void setNumero(String numero) {this.numero = numero;}

    public String getAgencia() {return agencia;}
    public void setAgencia(String agencia) {this.agencia = agencia;}

    public double getSaldo() {return saldo;}
    public void setSaldo(double saldo) {this.saldo = saldo;}

    public Cliente getCliente() {return cliente;}
    public void setCliente(Cliente cliente) {this.cliente = cliente;}
}
