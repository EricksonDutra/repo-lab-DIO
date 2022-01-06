package br.com.erickdevs;

import java.util.Scanner;

public class OrdemInversa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = {1,4,6,8,9};

        for(int i=vetor.length - 1; i>=0; i--){
            System.out.print(vetor[i] + " ");
        }

        sc.close();
    }
}
