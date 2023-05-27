package cap02.exercicios;

import javax.swing.*;

public class Ex03JOptionPane {
    public static void main(String[] args) {
        float valorTransacao, valorVenal, percentualImposto, maiorValor, valorImposto;
        String aux;

        aux = JOptionPane.showInputDialog(null, "Informe o valor da transação: ");
        valorTransacao = Float.parseFloat(aux);

        aux = JOptionPane.showInputDialog(null, "Informe o valor venal: ");
        valorVenal = Float.parseFloat(aux);

        aux = JOptionPane.showInputDialog(null, "Informe o percentual de imposto: ");
        percentualImposto = Float.parseFloat(aux);

        if(valorTransacao > valorVenal){
            maiorValor = valorTransacao;
        } else {
            maiorValor = valorVenal;
        }

        valorImposto = maiorValor * (percentualImposto / 100);
        JOptionPane.showMessageDialog(null, "O valor do imposto é: " + valorImposto);

        System.exit(0);
    }
}
