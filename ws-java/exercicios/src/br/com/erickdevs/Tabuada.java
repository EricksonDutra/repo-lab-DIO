package br.com.erickdevs;

/*
Desenvolva um gerador de tabuada,
 capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10
 O usuário deve informa de qual número ele deseja ver a tabuada.
 A saída deve ser conforme o exemplo abaixo.
 */

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Informe o número que deseja a tabuada: ");
        n = sc.nextInt();

        System.out.println("Tabuada do " + n + ":");
        for (int i= 1; i<=10; i++){
            System.out.printf("%d x %d = %d \n", n, i, (n*i));
        }

        sc.close();
    }
}
