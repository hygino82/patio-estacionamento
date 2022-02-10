package entities;

public class Patio {

    private String nome;
    private String logradouro;
    private String numero;
    private String bairro;
    private String municipio;
    private String estado;
    private String cep;
    private String telefone;
    private Integer capacidadeVeiculos;
    private Integer lotacao;
    private Float diariaCarros;
    private Float diariaCaminhoes;

    public Patio(){

    }

    public Patio(String nome, String logradouro, String numero, String bairro, String municipio, String estado,
            String cep, String telefone, Integer capacidadeVeiculos, Integer lotacao, Float diariaCarros,
            Float diariaCaminhoes) {
        this.nome = nome;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.municipio = municipio;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
        this.capacidadeVeiculos = capacidadeVeiculos;
        this.lotacao = lotacao;
        this.diariaCarros = diariaCarros;
        this.diariaCaminhoes = diariaCaminhoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getCapacidadeVeiculos() {
        return capacidadeVeiculos;
    }

    public void setCapacidadeVeiculos(Integer capacidadeVeiculos) {
        this.capacidadeVeiculos = capacidadeVeiculos;
    }

    public Integer getLotacao() {
        return lotacao;
    }

    public void setLotacao(Integer lotacao) {
        this.lotacao = lotacao;
    }

    public Float getDiariaCarros() {
        return diariaCarros;
    }

    public void setDiariaCarros(Float diariaCarros) {
        this.diariaCarros = diariaCarros;
    }

    public Float getDiariaCaminhoes() {
        return diariaCaminhoes;
    }

    public void setDiariaCaminhoes(Float diariaCaminhoes) {
        this.diariaCaminhoes = diariaCaminhoes;
    }
}
