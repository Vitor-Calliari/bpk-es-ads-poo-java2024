package Exercicio01;

public class Motor {
    private int cilindradas;
    private String modelo;
    private int rpm;
    private Enum tipoCombustivel;
    private int potencia;
    private boolean ligado;

    public Motor (int cilindradas, String modelo, int rpm, Enum tipoCombustivel, int potencia, boolean ligado){
        this.cilindradas = cilindradas;
        this.modelo = modelo;
        this.rpm = rpm;
        this.tipoCombustivel = tipoCombustivel;
        this.potencia = potencia;
        this.ligado = false;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public Enum getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(Enum tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligar(){
        if(!ligado){
            ligado = true;
            System.out.println("Motor ligado");
        } else{
            System.out.println("O motor já está ligado");
        }
    }

    public void desligar(){
        if(ligado){
            ligado = false;
            System.out.println("Motor desligado");
        } else{
            System.out.println("O motor já está desligado");
        }
    }

    public boolean isLigado(){
        return ligado;
    }
}
