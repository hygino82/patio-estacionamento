package entities;

public class Carro extends Veiculo{
    protected Integer numeroPortas;
    protected Integer numeroPassageiros;
    
    public Carro(){
        
    }

    public Carro(Integer numeroPortas, Integer numeroPassageiros, String marca, String modelo, Integer anoFabricacao, Integer anoModelo, String chassi, String placa) {
        super(marca, modelo, anoFabricacao, anoModelo, chassi, placa);
        this.numeroPortas = numeroPortas;
        this.numeroPassageiros = numeroPassageiros;
    }

    public Integer getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(Integer numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public Integer getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(Integer numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }
}
