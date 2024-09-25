package exercicio06;
/*
Crie uma classe Computador com atributos como processador, memoriaRAM, e armazenamento. Adicione métodos para ligar e desligar o computador.
 */
public class Computador {
    private String processador;
    private String memoriaRAM;
    private int armazenamento;
    private boolean ligado;

    public Computador(String processador, String memoriaRAM, int armazenamento){
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(String memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }
    public void ligar() {
        if(!ligado){
            ligado = true;
            System.out.println("O computador foi ligado!");
        }else {
            System.out.println("O computador já está ligado");
        }
    }

    public void desligar(){
        if(ligado){
            ligado = false;
            System.out.println("O computador foi desligado!");
        }else{
            System.out.println("O computador já está desligado");
        }
    }
}
