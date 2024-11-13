package Exercicio01;

class Carro {
    private Motor motor;
    private String modelo;

    public Carro(String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
    }

    public void ligarMotor() {
        motor.ligar();
    }

    public void desligarMotor() {
        motor.desligar();
    }

    public void acelerar(int incremento) {
        if (motor.isLigado()) {
            motor.incrementarRpm(incremento);
            System.out.println("Acelerando. RPM atual: " + motor.getRpm());
        } else {
            System.out.println("Não é possível acelerar com o motor desligado.");
        }
    }

    public void desacelerar(int decremento) {
        if (motor.isLigado()) {
            motor.decrementarRpm(decremento);
            System.out.println("Desacelerando. RPM atual: " + motor.getRpm());
        } else {
            System.out.println("Não é possível desacelerar com o motor desligado.");
        }
    }
}