package cap02.exercicios;

import java.util.Scanner;

public class Ex05Scanner {
    public static void main(String[] args) {

        int idade, anosDeContribuicao, sexo;
        int tempoNecessarioContribuicao = 0, idadeMinima = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("* Sexo da pessoa -> 1 - Masculino | 2 - Feminino : ");
        sexo = sc.nextInt();
        System.out.print("\n* Idade: ");
        idade = sc.nextInt();
        System.out.print("\n* Anos de contribuição: ");
        anosDeContribuicao = sc.nextInt();

        if(sexo == 1) {
            idadeMinima = 65;
            tempoNecessarioContribuicao = 35;
        } else if(sexo == 2){
            idadeMinima = 60;
            tempoNecessarioContribuicao = 30;
        } else {
            System.out.println("Sexo inválido");
        }

        if(anosDeContribuicao >= tempoNecessarioContribuicao || idade >= idadeMinima) {
            System.out.println("Você tem direito a aposentadoria.");
            System.exit(0);

        }else if(tempoNecessarioContribuicao > anosDeContribuicao) {
            System.out.println("Você ainda não tem direito a aposentadoria faltam " +
                    (tempoNecessarioContribuicao - anosDeContribuicao) + " anos de contribuição.");

        } else if(idade < idadeMinima) {
            System.out.println("Você ainda não tem direito a aposentadoria faltam " +
                    (idadeMinima - idade) + " anos para aposentadoria por idade.");
        }
    }
}
