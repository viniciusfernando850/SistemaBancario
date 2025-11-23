public class Banco {
    private String nome;
    private Conta[] contas;
    private Cliente[] clientes;

    public Banco(String nome, int quantidadeContas, int quantidadeClientes){
        this.nome = nome;
        this.contas = new Conta[quantidadeContas];
        this.clientes = new Cliente[quantidadeClientes];
    }

    public String getNome(){return this.nome;}
    public void setNome(String nome){this.nome = nome;}

    public Conta[] getConta(){return this.contas;}
    public void setContas(Conta[] contas){this.contas = contas;}

    public Cliente[] getClientes(){return this.clientes;}
    public void setClientes(Cliente[] clientes){this.clientes = clientes;}
}
