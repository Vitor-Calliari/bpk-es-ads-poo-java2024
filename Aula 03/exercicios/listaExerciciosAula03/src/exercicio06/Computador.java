package exercicio06;
//Crie uma classe Computador com atributos como processador, memoriaRAM, e armazenamento. Adicione métodos para ligar e desligar o computador.

public class Computador {
    private String processador;
    private String memoriaRAM;
    private Integer armazenamento;
    private Boolean ligar = false;

    public Computador (String processador, String memoriaRAM, Integer armazenamento){
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
    }
    public String getProcessador(){
        return processador;
    }
    public String getMemoriaRAM(){
        return memoriaRAM;
    }
    public Integer getArmazenamento(){
        return armazenamento;
    }
    public Boolean getLigar(){
        return ligar;
    }

    public void ligarComputador(){
        System.out.println("Ligando o computador...");
        this.ligar = true;
    }
    public void desligarComputador(){
        System.out.println("Desligando o computador...");
        this.ligar = false;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "processador='" + processador + '\'' +
                ", memoriaRAM='" + memoriaRAM + '\'' +
                ", armazenamento=" + armazenamento +
                ", ligar=" + ligar +
                '}';
    }
}
