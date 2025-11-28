import java.util.Scanner;

public class ContaPoupanca extends Conta {
    private int diaRendimento;
    private float taxaRendimento;

    public ContaPoupanca(String numero, String agencia, double saldo, Cliente cliente,
                         int diaRendimento, float taxaRendimento) {
        super(numero, agencia, saldo, cliente);
        this.diaRendimento = diaRendimento;
        this.taxaRendimento = taxaRendimento;
    }

    public int getDiaRendimento() {return this.diaRendimento;}
    public void setDiaRendimento(int diaRendimento) {this.diaRendimento = diaRendimento;}

    public float getTaxaRendimento() {return this.taxaRendimento;}
    public void setTaxaRendimento(float taxaRendimento) {this.taxaRendimento = taxaRendimento;}
}
