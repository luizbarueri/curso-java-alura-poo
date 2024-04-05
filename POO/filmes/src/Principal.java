

import filme.Filme;

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
                    
        String nomes[] = {"Rock IV", "To Gun", "A Ilha"}    ;
        int anoLancamentos[] = {2001, 2015, 2012};
        double avaliacoes[] = {9.1, 8.0, 7.5}; 
        
        for (int i = 0; i < nomes.length; i++) {
            
            filme.setNome(nomes[i]);
            filme.setAnoDeLancamento(anoLancamentos[i]);
            filme.setTotalDeAvaliacoes(i);
            for (int n = 0; n < 3; n++) {
                 filme.avalia(avaliacoes[i + (i/10)]); 
            }

            filme.exibeFichaTecnica();
            System.out.println("Total de avaliaçoes: " + filme.getTotalDeAvaliacoes());
            System.out.printf("Soma das avaliações: %.2f%n", filme.getSomaDasAvaliacoes());
            System.out.printf("Média das avalições:  %.2f%n",  filme.pegaMedia());
            System.out.println("------------------------------------------------------");
        }    
    }
}
