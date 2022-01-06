package br.com.erickdevs;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
 */
public class Parimpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int num;
        int pares = 0;
        int impares = 0;

        System.out.printf("Quantos número deseja ler: ");
        n = sc.nextInt();

        while (n>0){
            num = sc.nextInt();
            if (num % 2 == 0){
                pares++;
            }
            else impares++;
            n--;
        }

        System.out.println("pares: " + pares);
        System.out.println("impares: "+ impares);
        sc.close();
    }

}
