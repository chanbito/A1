public class conta {
    private String nome;
    private String cpf;
    private double saldo;
    private int id;

    public conta(String nome, String cpf, double saldo, int id){
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
        this.id = id;
    }



    public double Saque(double valor){
        if(valor > saldo){
            System.out.println("Valor de saque maior que tem nessa conta");
            return 0;
        }
        saldo -= valor;
        return valor;
    }

    public double Deposito(double valor){
        saldo += valor;
        return saldo;
    }

    public void printar(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Saldo: " + this.saldo);
    }
}
