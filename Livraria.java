public class Livraria {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();
        livro1.nome = "É assim que acaba";
        livro1.ano = 2016;
        livro1.numeroPaginas = 240;
        livro1.preco = 54.90;

        livro2.nome = "Harry potter";
        livro2.ano = 2000;
        livro2.numeroPaginas = 400;
        livro2.preco = 60.50;
         
        System.out.println("==== LIVRO 1 ====");    
        System.out.println("Título: " + livro1.nome);
        System.out.println("Ano: " + livro1.ano);
        System.out.println("Número de pag: " + livro1.numeroPaginas);
        System.out.println("Preço: " + livro1.preco);

        System.out.println("\n==== LIVRO 2 ====");    
        System.out.println("Título: " + livro2.nome);
        System.out.println("Ano: " + livro2.ano);
        System.out.println("Número de pag: " + livro2.numeroPaginas);
        System.out.println("Preço: " + livro2.preco);

        System.out.println("\n--- Métodos Livro 1 ---");
        livro1.cadastrar();
        double frete1 = livro1.calcFrete("23292849");
        System.out.printf("Frete: R$ %.2f\n", frete1);

        System.out.println("\n--- Métodos Livro 2 ---");
        livro2.cadastrar();
        double frete2 = livro2.calcFrete("01001000");
        System.out.printf("Frete: R$ %.2f\n", frete2);
    }
}
