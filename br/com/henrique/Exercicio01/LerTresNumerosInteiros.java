package br.com.henrique.Exercicio01;

import java.util.Scanner;

public class LerTresNumerosInteiros {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0, maior = 0, menor = 0;

        //Estrutura para receber os 3 valores do usuario e retornar qual o maior e qual o menor.
        for (int x = 0; x < 3; x++) {

            System.out.println("Por favor insira um valor:");
            a = in.nextInt();

            if (x == 0) {

                maior = a;
                menor = a;
            }

            if (a > maior) {

                maior = a;
            }

            if (a < menor) {

                menor = a;
            }
        }
        //Criando a lógica para retornar se os valores são iguais.
            if(maior == menor){
                System.out.println("Os três valores inseridos são iguais!");
            } else {
                System.out.print(" O Maior número é: " + maior + ". O Menor número é: " + menor);
            }
    }
}
