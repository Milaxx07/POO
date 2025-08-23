//2. Classe Carro (Atributos Privados e Getters)
public class MainCarro{
    public static void main(String[] args) {
        
        Carro c1 = new Carro("Toyota", 2013);

        System.out.println("Marca: " +  c1.getMarca());
        System.out.println("Ano: " + c1.getAno());
    }
}