package view;

import model.*;

public class App {
    public static void main(String[] args) 
    {

        var loja = new Loja(1,"Rua qualquer numero 94","Lojas Contoso");
        System.out.println("acabei de criar uma loja, ela não tem funcionarios ainda");
        loja.printar();

        System.out.println("agpra vou criar um funcionario");

        Funcionario f1 = new Funcionario("juriscleison","000.584.556-89",40.5);
        f1.printar();

        System.out.println("agora irei ASSOCIAR o funcionario a sua loja");

        loja.AddFuncionario(f1);

        loja.printar();
    }
}