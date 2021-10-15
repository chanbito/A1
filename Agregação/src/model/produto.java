public class produto {
    double preco;
    String codBarras;

    public produto(double preco, String codBarras){
        this.preco = preco;
        this.codBarras = codBarras;

    }

    public double GetPreco() {
        return preco;
    }

    public void printar() {
        System.out.println("Codigo de Barras: " + this.codBarras);
        System.out.println("Preço: " + this.preco);
    }
}
