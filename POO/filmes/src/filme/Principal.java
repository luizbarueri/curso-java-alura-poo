package filme;

public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();

        // filme.nome = "O alto da compadecida";
        // filme.anoDeLancamento = 2015;
        // filme.avaliacao = 10;
        // filme.duracaoEmMinutos = 190;
        // filme.incluidoNoPlano = true;

        // for() {

        // }

        // System.out.println(filme.nome);
        // System.out.println(filme.anoDeLancamento);
        // System.out.println(filme.avaliacao);
        // System.out.println(filme.duracaoEmMinutos);
        // System.out.println(filme.incluidoNoPlano);

        //usando os metodos get e set
        filme.setNome("A volta");
        filme.setAnoDeLancamento(2010);
        
        filme.exibeFichaTecnica();    

    }
}
