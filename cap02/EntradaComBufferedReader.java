package cap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntradaComBufferedReader {
    public static void main(String[] args) {
        String s;
        float largura, comprimento, area, perimetro;
        BufferedReader dado;
        try {
            System.out.print("Informe o comprimento: ");
            dado = new BufferedReader(new InputStreamReader(System.in));
            s = dado.readLine();
            comprimento = Float.parseFloat(s);

            System.out.print("Infome a largura: ");
            dado = new BufferedReader(new InputStreamReader(System.in));
            s = dado.readLine();
            largura = Float.parseFloat(s);

            area = comprimento * largura;
            perimetro = (comprimento * 2) + (largura *2);
            System.out.println("área = " + area);
            System.out.println("perímetro = " + perimetro);

        } catch (IOException erro) {
            System.out.println("Houve um erro de entrada de dados " + erro.toString());
        } catch (NumberFormatException erro) {
            System.out.println("houve um erro na conversão, digite apenas caracteres numéricos " +
                    erro.toString());
        }
    }
}
