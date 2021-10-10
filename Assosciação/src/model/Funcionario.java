package model;

public class Funcionario {
    private String Nome;
    private String CPF;
    private double HorasTrabalhoSemanal;

    public Funcionario(String Nome, String CPF, double HorasTrabalhoSemanal) {
        this.Nome = Nome;
        this.CPF = CPF;
        this.HorasTrabalhoSemanal = HorasTrabalhoSemanal;
    }

    public void printar(){
        System.out.println("    Nome: " + this.Nome);
        System.out.println("    CPF: " + this.CPF);
        System.out.println("    Horas trabalhadas por semana: " + this.HorasTrabalhoSemanal);
    }
}
