public class App {
    public static void main(String[] args) throws Exception {

        // Criando objetos Instanciando a classe Pessoa
        Pessoa objetoPessoa1 = new Pessoa("João", 25, "123.456.789-09");
        Pessoa objetoPessoa2 = new Pessoa("Maria", 30, "987.654.321-00");

        // Criando objetos Instanciando a classe Carro
        Carro objetoCarro1 = new Carro("Toyota", "Corolla", 2020);
        Carro objetoCarro2 = new Carro("Honda", "Civic", 2019);

        // Acessando os atributos dos objetos usando os métodos
        System.out.println("Nome: " + objetoPessoa1.getNome());
        System.out.println("Idade: " + objetoPessoa1.getIdade());
        System.out.println("CPF: " + objetoPessoa1.getCPF());

        System.out.println("");

        System.out.println("Nome: " + objetoPessoa2.getNome());
        System.out.println("Idade: " + objetoPessoa2.getIdade());
        System.out.println("CPF: " + objetoPessoa2.getCPF());

        System.out.println("=================================");

        System.out.println("Marca: " + objetoCarro1.getMarca());
        System.out.println("Modelo: " + objetoCarro1.getModelo());
        System.out.println("Ano: " + objetoCarro1.getAno());

        System.out.println("");

        System.out.println("Marca: " + objetoCarro2.getMarca());
        System.out.println("Modelo: " + objetoCarro2.getModelo());
        System.out.println("Ano: " + objetoCarro2.getAno());

        System.out.println("");
    }
}
