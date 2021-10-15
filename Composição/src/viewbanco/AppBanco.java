public class AppBanco {
    public static void main(String[] args) 
    {
        banco b1 = new banco("Santander");
        System.out.println("Criei o Banco " + b1.GetNome());
        conta novaconta = b1.CriarConta("jose","001002003-84",200);

        System.out.println("Adicionei ao Banco o cliente: ");

        novaconta.printar();

        System.out.println("Agora vou fazer um saque de 100 reais ");

        novaconta.Saque(100);

        novaconta.printar();

        System.out.println("Agora vou falir o banco, desalocando todas as contas");

        b1.falencia();

        System.out.println("contas restantes:");

        b1.MostrarContas();

    }
}
