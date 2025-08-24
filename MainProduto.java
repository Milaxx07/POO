//4. Classe Produto (Setters com Validação)
public class MainProduto {
    public static void main(String[] args) {
        
        Produto p1 = new Produto("Camiseta", 50);
        Produto p2 = new Produto("Caneta", 20);

        p1.setPreco(30);
        p2.setPreco(10);

        p1.mostrarInfo();
        p2.mostrarInfo();
    }
}