package cap02.exercicios;

import java.util.Scanner;

public class Ex02Scanner {
    public static void main(String[] args) {

        int pontuacaoLider, pontuacaoLanterna, vitoriasNecessarias;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Pontuação do líder: ");
            pontuacaoLider = sc.nextInt();

            System.out.print("Pontuação do lanterna: ");
            pontuacaoLanterna = sc.nextInt();

            vitoriasNecessarias = (pontuacaoLider - pontuacaoLanterna) / 3;

            System.out.println("Serão necessárias " + vitoriasNecessarias + " vitórias para ultrapassar o líder");
        } catch (NumberFormatException erro) {
            System.out.println("houve um erro na conversão, digite apenas caracteres numéricos " +
                    erro.toString());
        }

    }
}
