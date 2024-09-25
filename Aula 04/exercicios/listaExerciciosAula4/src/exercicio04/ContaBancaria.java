package exercicio04;
/*
Crie uma classe ContaBancaria com atributos como numeroConta e saldo. Adicione métodos para depositar e sacar dinheiro.
 */
public class ContaBancaria {
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor){
        if(saldo > 0 && saldo >= valor){
            saldo -= valor;
            System.out.println("O saque de R$"+valor+" foi realizado com sucesso");
        }else {
            System.out.println("Operação inválida, verifique seu saldo");
        }
    }
    public void depositar(double valor){
        if(valor > 0){
            saldo +=valor;
            System.out.println("O depósito de R$"+valor+" foi realizado com sucesso");
        }
    }

    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria("1234-5", 500);
        System.out.println("Seu saldo inicial é de R$"+contaBancaria.getSaldo());

        contaBancaria.sacar(200);
        System.out.println("Seu saldo atual é de R$"+contaBancaria.getSaldo());

        contaBancaria.depositar(600);
        System.out.println("Seu saldo atual é de R$"+contaBancaria.getSaldo());
    }
}
