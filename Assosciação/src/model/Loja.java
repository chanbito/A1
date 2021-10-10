package model;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

public class Loja {
    private ArrayList<Funcionario> Funcionarios;
    private int ID;
    private String Localizacao;
    private String RazãoSocial;

    public Loja(int ID, String Localizacao, String razaoSocial) {
        this.ID = ID;
        this.Localizacao = Localizacao;
        this.RazãoSocial = razaoSocial;
    }

    public void AddFuncionario(Funcionario func){
        if(Funcionarios == null){
            Funcionarios = new ArrayList<Funcionario>();
        }
        Funcionarios.add(func);
    }

    public void printar(){
        System.out.println("ID: " + this.ID);
        System.out.println("localização: " + this.Localizacao);
        System.out.println("razao social: " + this.RazãoSocial);
        if(Funcionarios != null){
        System.out.println("Funcionarios Totais: " + Funcionarios.size());
            Funcionarios.forEach(n -> {
                n.printar();
            });
        }else{
            System.out.println("Funcionarios Totais: 0");
        }
    
        System.out.println("----------------------------------------");
    }
}


