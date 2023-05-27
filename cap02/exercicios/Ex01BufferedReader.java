package cap02.exercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex01BufferedReader {
    public static void main(String[] args) {

        String aux;
        float valorDoProduto, desconto, valorFinal, percentualDesconto;
        BufferedReader dado;

        try {
            System.out.print("-> Valor do Produto: ");
            dado = new BufferedReader(new InputStreamReader(System.in));
            aux = dado.readLine();
            valorDoProduto = Float.parseFloat(aux);

            System.out.print("-> Percentual de desconto: ");
            dado = new BufferedReader(new InputStreamReader(System.in));
            aux = dado.readLine();
            percentualDesconto = Float.parseFloat(aux);

            desconto = valorDoProduto * (percentualDesconto / 100);
            valorFinal = valorDoProduto - desconto;

            System.out.print("- Valor do produto: " + valorDoProduto);
            System.out.print("\n- Percentual de desconto: " + percentualDesconto);
            System.out.print("\n= Valor total: " + valorFinal);

        } catch (IOException erro) {
            System.out.println("Houve um erro de entrada de dados " + erro.toString());
        } catch (NumberFormatException erro) {
            System.out.println("houve um erro na conversão, digite apenas caracteres numéricos " +
                    erro.toString());
        }
    }
}
