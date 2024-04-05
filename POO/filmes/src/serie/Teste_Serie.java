package serie;

//import filme.Filme;

public class Teste_Serie {
    public static void main(String[] args) {
        Serie serie = new Serie();
        
        serie.setNome("O Lambão");
        serie.setAnoDeLancamento(2000);
        serie.exibeFichaTecnica();
        serie.setTemporadas(10);
        serie.setEpisodioPorTemporada(10);
        serie.setMinutosPorEpisodio(50);

        System.out.println(serie.getNome());
        System.out.println("Duração da Serie em minutos: " + serie.getDuracaoEmMinutos());
    }
}

