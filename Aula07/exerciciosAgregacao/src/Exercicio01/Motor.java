package Exercicio01;

public class Motor {
    private int cilindradas;
    private String modelo;
    private int rpm;
    private TipoCombustivel tipoCombustivel;
    private int potencia;
    private boolean ligado;

    public Motor(int cilindradas, String modelo, TipoCombustivel tipoCombustivel, int potencia) {
        this.cilindradas = cilindradas;
        this.modelo = modelo;
        this.tipoCombustivel = tipoCombustivel;
        this.potencia = potencia;
        this.rpm = 0;
        this.ligado = false;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            rpm = 1000; // RPM inicial ao ligar o motor
            System.out.println("Motor ligado.");
        } else {
            System.out.println("O motor já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            rpm = 0;
            System.out.println("Motor desligado.");
        } else {
            System.out.println("O motor já está desligado.");
        }
    }

    public void incrementarRpm(int valor) {
        if (ligado) {
            rpm += valor;
        } else {
            System.out.println("O motor está desligado. Não é possível incrementar o RPM.");
        }
    }

    public void decrementarRpm(int valor) {
        if (ligado && rpm - valor >= 0) {
            rpm -= valor;
        } else {
            System.out.println("O motor está desligado ou o RPM é insuficiente para decrementar.");
        }
    }

    public int getRpm() {
        return rpm;
    }

    public boolean isLigado() {
        return ligado;
    }
}
