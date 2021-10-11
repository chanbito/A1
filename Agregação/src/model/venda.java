package model;

import java.util.ArrayList;

public class venda {
    ArrayList<produto> carrinhoProdutos;
    cliente cliente;

    public venda(cliente cliente){
        this.cliente = cliente;
        carrinhoProdutos = new ArrayList<produto>();
    }

    public void AdicionarProduto(produto p){
        carrinhoProdutos.add(p);
    }

    public double CalcularCarrinho() {
        double total = 0.0;
        for(produto p : carrinhoProdutos){
          total += p.GetPreco();
        }
        return total;
    }

    public void printar(){
        System.out.println("Venda para o cliente: " + cliente.GetNome());
        System.out.println("Produtos: ");
        for (produto produto : carrinhoProdutos) {
            produto.printar();
        }

        System.out.println("Total da compra: " + this.CalcularCarrinho());

        
    }
}
