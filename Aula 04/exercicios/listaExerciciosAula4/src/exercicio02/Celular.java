package exercicio02;
/* Defina uma classe Celular com atributos como marca, modelo, e capacidadeBateria. Adicione métodos para ligar e desligar o celular.

 */
public class Celular {
    private String marca;
    private String modelo;
    private String capacidadeDeBateria;
    private boolean ligado;

    public Celular (String marca, String modelo, String capacidadeDeBateria){
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeDeBateria = capacidadeDeBateria;
        this.ligado = false;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCapacidadeDeBateria() {
        return capacidadeDeBateria;
    }

    public void setCapacidadeDeBateria(String capacidadeDeBateria) {
        this.capacidadeDeBateria = capacidadeDeBateria;
    }

    public void ligar() {
        if(!ligado){
            ligado = true;
            System.out.println("O celular foi ligado!");
        }else {
            System.out.println("O celular já está ligado");
        }
    }

    public void desligar(){
        if(ligado){
            ligado = false;
            System.out.println("O celular foi desligado!");
        }else{
            System.out.println("O celular já está desligado");
        }
    }
}
