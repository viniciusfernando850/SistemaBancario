import java.util.Scanner;

public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(String numero, String agencia, double saldo, Cliente cliente,
                         double limiteChequeEspecial) {
        super(numero, agencia, saldo, cliente);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial() {return this.limiteChequeEspecial;}
    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
}
