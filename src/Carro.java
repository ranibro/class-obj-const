public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    // ================  Construtor  ================
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    
    // ==============  Métodos  ==============
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }
}
