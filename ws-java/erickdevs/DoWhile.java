package br.com.erickdevs;
import java.util.Scanner;
/*
Faça um programa que leia 5 números
e informe o maio número
e a média desses números
 */

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int count = 0;
        int maior = 0;
        int soma = 0;

        do {
            System.out.printf("Número: ");
            num = sc.nextInt();
            soma = num + soma;
            if (num > maior) maior = num;
            count++;
        } while (count < 5);

        System.out.println("Maior = " + maior);
        System.out.println("Soma = " + soma);
        System.out.println("Média = " + soma/5);

    }
}
