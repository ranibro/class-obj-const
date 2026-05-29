public class Pessoa {
    String nome;
    int idade;
    String CPF;
    String email;

    // ================  Construtor  ================
    public Pessoa(String nome, int idade, String CPF) {
        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
    }

    // ==============  Métodos  ==============
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
