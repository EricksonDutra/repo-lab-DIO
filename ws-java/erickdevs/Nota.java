//
//     Faça um programa que peça uma nota, entre zero e dez
//     Mostre uma mensagem caso o valor seja inválido
//     e continue pedindo até que o usuário informe um valor válido
//
package br.com.erickdevs;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1;
        System.out.print("Entre com uma nota de 0 a 10: ");
        n1 = sc.nextInt();

        while (n1 < 0 || n1 > 10) {
            System.out.print("Valor inválido!! \n Tente novamente: ");
            n1 = sc.nextInt();
        }
    }
    }

//
//
//    }
