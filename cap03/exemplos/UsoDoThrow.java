package cap03.exemplos;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class UsoDoThrow {
    public static void main(String[] args) throws  IOException {
        String frase = JOptionPane.showInputDialog(null,"Digite uma frase");
        try {
            FileWriter file = new FileWriter("C:\\Users\\Lucas Dias\\Desktop\\pratica de logica\\jd8\\textin-maroto.txt", true);
            PrintWriter out = new PrintWriter(file);
            out.println(frase);
            file.close();
            out.close();
            JOptionPane.showMessageDialog(null,"Frase armazenada com sucesso!!");
        } catch (FileNotFoundException erro) {
            JOptionPane.showMessageDialog(null,"Erro! Verifique se o arquivo existe");
        }
    }
}
