// import java.util.ArrayList;
    public class Pedido extends Produto{
        // ArrayList<Produto> arrProdutos; -> Futuro...
        // Double valorTotal;
    public static void verPedido () {
        Produto produto1 = new Produto();
        System.out.println("Nome: " + nome);
        System.out.println("Valor: " + valor);
        System.out.println("Categoria: " + categoria);
        System.out.println("Valor total do pedido: "/*  + valorTotal*/); 
    }
    public static void main(String[] args) {
        verPedido();
    }
}