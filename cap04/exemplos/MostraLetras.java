package cap04.exemplos;

import javax.swing.*;

public class MostraLetras {
    public static void main(String[] args) throws InterruptedException {
        String palavra = JOptionPane.showInputDialog(null,"Forneça uma palavra");

        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            System.out.println(c);
            Thread.sleep(1000);
        }
        System.out.println();

        for (int i = palavra.length() - 1; i >= 0; i--) {
            char c = palavra.charAt(i);
            System.out.println(c);
            Thread.sleep(1000);
        }
    }
}
