package entities;

public class Conta {

    private Cliente cliente;
    private Veiculo veiculo;
    private Patio patio;
    private Integer ano;
    private Integer mes;
    private Integer diarias;
    private Boolean statusConta;

    public Conta() {

    }

    public Conta(Cliente cliente, Veiculo veiculo, Patio patio, Integer ano, Integer mes, Integer diarias,
            Boolean statusConta) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.patio = patio;
        this.ano = ano;
        this.mes = mes;
        this.diarias = diarias;
        this.statusConta = statusConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Patio getPatio() {
        return patio;
    }

    public void setPatio(Patio patio) {
        this.patio = patio;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getDiarias() {
        return diarias;
    }

    public void setDiarias(Integer diarias) {
        this.diarias = diarias;
    }

    public Boolean getStatusConta() {
        return statusConta;
    }

    public void setStatusConta(Boolean statusConta) {
        this.statusConta = statusConta;
    }    
}
