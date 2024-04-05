package filme;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private double avaliacao;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setAnoDeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }
    
    public void setDuracaoEmMinutos(int duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    
    public void setIncluidoNoPlano(boolean incluidoNoPlano){
        this.incluidoNoPlano = incluidoNoPlano;
    }
    
    public void setAvaliacao(double avaliacao){
        this.avaliacao = avaliacao;
    }
    
    public void setSomaDasAvaliacoes(double somaDasAvaliacoes){
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }
    
    public void setTotalDeAvaliacoes(int totalDeAvaliacoes){
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }
    
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
    
    public boolean getIncluidoNoPlano() {
        return incluidoNoPlano;
    }
    
    public double getAvaliacao() {
        return avaliacao;
    }
    
    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }
    
    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano lançamento: " + anoDeLancamento);
    }

    public void avalia(double valor) {
        this.avaliacao = valor;
        this.somaDasAvaliacoes += valor;
        this.totalDeAvaliacoes++;
    }

    public double  pegaMedia() {
        return this.somaDasAvaliacoes / totalDeAvaliacoes;
    }
    
}
