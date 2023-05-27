package cap04.exercicios;

import javax.swing.*;

/* classe verifica se na frase há palavras impróprias, caso tenha o conteúdo é bloqueado, se não é liberado. */

public class Ex05DetectaPalavrasImproprias {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog(null,"Forneça uma frase: ");

        if(frase.contains("sexo") || frase.contains("sexual")) {
            JOptionPane.showMessageDialog(null, "Conteúdo impróprio.");
        } else {
            JOptionPane.showMessageDialog(null,"Conteúdo liberado.");
        }

        System.exit(0);
    }
}
