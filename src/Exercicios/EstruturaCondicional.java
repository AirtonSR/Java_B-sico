package Exercicios;

import java.util.Scanner;

public class EstruturaCondicional {
    public static void Idade(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe sua data de nascimento: ");
        float idade = scanner.nextFloat();
        double v = 2023 - idade;

        System.out.printf("idade é %f", v);
        System.out.println();
    }
}
