package entities;

public class Caminhao extends Veiculo {
    protected Integer numeroEixos;
    protected Float capacidadeCarga;
    
    public Caminhao(){
        
    }

    public Caminhao(Integer numeroEixos, Float capacidadeCarga, String marca, String modelo, Integer anoFabricacao, Integer anoModelo, String chassi, String placa) {
        super(marca, modelo, anoFabricacao, anoModelo, chassi, placa);
        this.numeroEixos = numeroEixos;
        this.capacidadeCarga = capacidadeCarga;
    }

    public Integer getNumeroEixos() {
        return numeroEixos;
    }

    public void setNumeroEixos(Integer numeroEixos) {
        this.numeroEixos = numeroEixos;
    }

    public Float getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(Float capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
}
