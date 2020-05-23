package application;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Seja bem-vindo(a) as ferramentas para RPG.\n");
        System.out.println(initTxt());
        System.out.print("Escolha a sua opção: ");
        int answer = sc.nextInt();
        while (answer != 0 ){
            init(answer);
            System.out.print("Digite o serviço que deseja utilizar agora: \n");
            answer = sc.nextInt();
        }

    }

    public static void init(Integer answer) {

        if (answer == 1 ){
            jutsuCalculator();
        } if (answer == 2) {
            System.out.println("Okay, obrigado por usar os meus serviços.");
        }
    }

    public static String initTxt() {
        return "Qual ferramenta você irá querer usar?\n" + "\n"
                + "1. Calcular quantidade de cenas e horas para aprendizado de Jutsu;\n"
                + "0. Nada por enquanto;\n";
    }

    public static void jutsuCalculator() {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nInsira o valor do atributo Ninjutsu de seu personagem: ");
        int nin = sc.nextInt();
        System.out.print("Insira o valor do atributo Inteligência de seu personagem: ");
        int win = sc.nextInt();
        System.out.print("Por fim, insira o valor da técnica que deseja aprender: ");
        int tecValue = sc.nextInt();
        double hours = (((double) tecValue * 50 / nin) * tecValue) * 0.166667;
        double scenes = (((double) tecValue * 50 / win) * tecValue) * 0.166667;
        int intScenes = (int) Math.floor(scenes);
        System.out.println("O aprendizado para esta técnica demorará: "
                + String.format("%.2f", hours)
                + " horas e "
                + intScenes
                + " cenas.");


    }
}


