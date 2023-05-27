package cap02.exercicios;

import javax.swing.*;

public class Ex04JOptionPane {
    public static void main(String[] args) {
        float nota1, nota2, trabalho, media;
        String aux;

        aux = JOptionPane.showInputDialog(null, "Informe a nota da primeira prova: ");
        nota1 = Float.parseFloat(aux);

        aux = JOptionPane.showInputDialog(null, "Informe a nota da segunda prova: ");
        nota2 = Float.parseFloat(aux);

        aux = JOptionPane.showInputDialog(null, "Informe a nota do trabalho: ");
        trabalho = Float.parseFloat(aux);

        media = (nota1 + nota2 + trabalho) / 3;

        if(media < 6) {
            JOptionPane.showMessageDialog(null, "Reprovado com nota " + media);
        } else {
            JOptionPane.showMessageDialog(null, "Aprovado com nota " + media);
        }
        System.exit(0);

    }
}
