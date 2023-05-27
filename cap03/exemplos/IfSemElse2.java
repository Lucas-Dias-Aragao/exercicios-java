package cap03.exemplos;

import javax.swing.*;

public class IfSemElse2 {
    public static void main(String[] args) {

        Object[] op = {"Corinthians", "Palmeiras", "Santos", "São Paulo"};
        String resp = "";

        while (resp != null) {
             resp = (String) JOptionPane.showInputDialog(null,"Fala que time é teu",
                    "Pesquisa", JOptionPane.PLAIN_MESSAGE, null, op, "Corinthians");

            if(resp == null) {
                JOptionPane.showMessageDialog(null,"Ixi desistiu de responder locão?");
            } else if(resp == "Corinthians") {
                JOptionPane.showMessageDialog(null, "Fez a escolha certa irmão");
            } else if(resp == "Palmeiras") {
                JOptionPane.showMessageDialog(null, "Te odeio de verdade");
            } else if(resp == "Santos" || resp == "São Paulo") {
                JOptionPane.showMessageDialog(null, "Não tenho o que falar de vc não");
            }
        }
        System.exit(0);
    }
}
