//3. Classe ContaBancaria (Encapsulamento + Métodos Públicos)
public class ContaBancaria{
    private int numeroConta;
    private double saldo;

    public ContaBancaria(int numeroConta, double saldoInicial){
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso");
        } else{
            System.out.println("Valor inválido para depósito");
        }
    }

    public void sacar(double valor){   
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso");
        } else{
            System.out.println("Saldo insuficiente ou inválido");
        }
    }

    public double getSaldo(){
        return saldo;
    }

    public int getNumeroConta(){
        return numeroConta;
    }
}