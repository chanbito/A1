import java.util.ArrayList;

public class banco {
    private String nome;
    private ArrayList<conta> Contas;
    private int NConta;
    
    public banco(String nome){
        this.nome = nome;
    }

    public String GetNome(){
        return this.nome;
    }
    
    public conta CriarConta(String nome, String cpf, double valor){
        var c1 = new conta(nome, cpf,valor,NConta);
        if(Contas == null){
            Contas = new ArrayList<conta>();
        }
        this.Contas.add(c1);

        NConta++;

        return c1;
    }

    public void MostrarContas(){
        Contas.clear();
    }

    public void falencia(){
        Contas.forEach(n -> {
            n = null;
        });
        System.out.println("Banco " +this.nome+ " Falido");
    }
}
