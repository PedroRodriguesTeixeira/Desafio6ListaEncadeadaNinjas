public class Ninja {

     private String nome;
    private String nomeVila;
    private int idade;

    public Ninja(String nomeVila, String nome, int idade) {
        this.nomeVila = nomeVila;
        this.nome = nome;
        this.idade = idade;
    }

    public String getNomeVila() {
        return nomeVila;
    }

    public void setNomeVila(String nomeVila) {
        this.nomeVila = nomeVila;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "nome='" + nome + '\'' +
                ", nomeVila='" + nomeVila + '\'' +
                ", idade=" + idade +
                '}';
    }
}
