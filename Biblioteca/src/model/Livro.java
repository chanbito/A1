package model;

public class Livro {
    private int ID;
    private String  Titulo;
    private String Autor;
    private int Ano;
    private StatusLivro Status;
    private String EmprestadoPara;

    public Livro (String Titulo, String autor, int ano, int id){
        this.Ano = ano;
        this.Titulo = Titulo;
        this.Autor = autor;
        this.Status = StatusLivro.Disponivel;
        this.ID = id;
        this.EmprestadoPara = "";
    }

    public Livro retirarLivro(String nome) {
        this.EmprestadoPara = nome;
        this.Status = StatusLivro.Indisponivel;
        return this;
    }

    public Livro devolverLivro() {
        this.EmprestadoPara = "";
        this.Status = StatusLivro.Disponivel;

        return this;
    }

    public void Printar() {
        System.out.println( "- Número: " + this.ID);
        System.out.println( "- Título: " + this.Titulo);
        System.out.println( "- Autor: " + this.Autor);
        System.out.println( "- Ano: " + this.Ano);
        System.out.println( "- Status:" + this.Status.name());
        System.out.println( "- Emprestado para:" + this.EmprestadoPara);
        System.out.println( "");
    }

    public boolean IsDisponivel(){
        if(this.Status == StatusLivro.Disponivel)
        return true;
        else
        return false;
    }

    public int getID(){
        return this.ID;
    }

}
enum StatusLivro{
    Disponivel, Indisponivel;
}
