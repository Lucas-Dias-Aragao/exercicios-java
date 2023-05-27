package cap02;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntradaComDataInputStream {
    public static void main(String[] args) {
        String s;
        float largura, comprimento, area, perimetro;
        DataInputStream dado;
        try {
            System.out.print("Informe o comprimento: ");
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            comprimento = Float.parseFloat(s);

            System.out.print("Infome a largura: ");
            dado = new DataInputStream(System.in);
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
