package filme;

public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double avaliacao;
    int totalDeAavaliacoes;
    int duracaoEmMinutos;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int ano) {
        this.anoDeLancamento = ano;
    }
    public int getAnoDeLancamento() {
        return this.anoDeLancamento;
    }
    
    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano lançamento: " + anoDeLancamento);
    }

}
