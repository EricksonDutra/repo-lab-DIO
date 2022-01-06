package br.com.erickdevs;

/*
Faça um programa que calcule o fatorial de um número
inteiro fornecido pelo usuário.
 */

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num = sc.nextInt();
        int res = 1;
        int res2 = 1;

        for(int i=2; i <= num; i++){
            res = res * i;
        }
        System.out.printf("O fatorial de %d! = %d", num, res);

        for(int j=num; j > 0; j--){
            res2 = res2 * j;
        }
        System.out.printf("\n O fatorial de %d! = %d", num, res);
    }
}
