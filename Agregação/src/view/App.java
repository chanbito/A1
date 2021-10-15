public class App {
    public static void main(String[] args) {
            System.out.println("Agregação");
            cliente c1 = new cliente("gabriel", 200.0);
            produto caneta = new produto(5.0, "000100020003");
            produto estojo = new produto(15.0, "000100020004");
            venda v1 = new venda(c1);
            v1.AdicionarProduto(caneta);
            v1.AdicionarProduto(caneta);

            v1.AdicionarProduto(estojo);

            v1.printar();

    }
}