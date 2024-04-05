package data_hora;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormataDataValor {
    public static void main(String[] args) {
        // Formatação de número
        double numero = 123.456789;
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("O número formatado é: " + df.format(numero));

        // Formatação de data
        Date dataAtual = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = sdf.format(dataAtual);
        System.out.println("Data formatada: " + dataFormatada);
    }    
}
