package model;

public class cliente {
    String nome;
    double Dinheiro;

    public cliente(String nome, double Dinheiro){
        this.nome = nome;
        this.Dinheiro = Dinheiro;
    }

    public String GetNome(){
        return this.nome;
    }
}

