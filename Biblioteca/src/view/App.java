package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.Livro;

public class App {

    public static void main(String[] args) 
    {
        ArrayList<Livro> LivrosDisponiveis = new ArrayList<>();

        Scanner ler = new Scanner(System.in);

        //na falta de um banco, vai assim
        var livro1 = new Livro("Revolução dos Bichos","George Orwell", 1945, 1);
        LivrosDisponiveis.add(livro1);
        var livro2 = new Livro("Admiravel Mundo Novo","Adous Huxley", 1940, 2);
        LivrosDisponiveis.add(livro2);
        
        boolean continuar = true;
        
        while(continuar){
        
        menu();
        var insert = ler.nextLine();
        
        if("X".equals(insert) || "x".equals(insert)){
            continuar = false;
        }
        if("1".equals(insert)){

            //cadastrar
            System.out.println( "Que bom que conseguimos mais livros");    
            System.out.println( "Mas agora me fale mais, quem escreveu este livro?");    
            var autor = ler.nextLine();
            System.out.println( "Qual o nome deste livro?");    
            var nome = ler.nextLine();
            System.out.println( "E por ultimo, em que ano ele foi lançado livro?");    
            var ano = Integer.parseInt(ler.nextLine());

            System.out.println("/n Adicionando... /n");

            var novolivro = new Livro(nome, autor, ano, LivrosDisponiveis.size() + 1);

            LivrosDisponiveis.add(novolivro);

            novolivro.Printar();

        }
        if("2".equals(insert)){
            //retirar
            System.out.println("Qual o numero do livro que deseja retirar?");
            var numero = ler.nextInt();
            System.out.println("Quem deseja retirar?");
            var nome = ler.nextLine();

            LivrosDisponiveis.forEach(n -> {
                if(n.getID() == numero){
                    n.retirarLivro(nome);
                    n.Printar();
                }
            });

        }
        if("3".equals(insert)){
            //devolver
            System.out.println("Qual o numero do livro que deseja devolver?");
            var numero = ler.nextInt();

            LivrosDisponiveis.forEach(n -> {
                if(n.getID() == numero){
                    n.devolverLivro();
                    n.Printar();
                }
            });

        }
        if("4".equals(insert)){
            //listar disponiveis
            System.out.println("Listando Disponiveis");
            LivrosDisponiveis.forEach(n -> {
                if(n.IsDisponivel())
                
                System.out.println("------------------------------------------");
                n.Printar();
            });
        }
        if("5".equals(insert)){
            //listar indisponiveis

            System.out.println("Listando Indisponiveis");

            LivrosDisponiveis.forEach(n -> {
                if(!n.IsDisponivel())
                System.out.println("------------------------------------------");
                n.Printar();
            });

        }
    
        //parar a tela

        ler.nextLine();
    }
}

    public static void menu(){
        LimparTela();
        System.out.println( "Bem vindo a nossa biblioteca");
        System.out.println( "Para sair insira um X" );
        System.out.println( "Para cadastrar um livro insira 1" );
        System.out.println( "Para retirar um livro insira 2" );
        System.out.println( "Para devolver um livro insira 3" );
        System.out.println( "Para ver os livros disponiveis insira 4" );
        System.out.println( "Para ver os livros emprestados insira 5" );
        
    }

    public static void LimparTela(){
        
        System.out.print("\033[H\033[2J"); 
        System.out.flush();

    }
}