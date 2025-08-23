//3. Classe ContaBancaria (Encapsulamento + Métodos Públicos)
public class MainContaBancaria{
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(150000, 500);

        System.out.println("Conta: " + conta.getNumeroConta());
        System.out.println("Saldo inicial: R$ " + conta.getSaldo());

        conta.depositar(200);
        conta.sacar(100);
        conta.sacar(800);

        System.out.println("Saldo final: R$ " + conta.getSaldo());
    }
}