package br.com.henrique.Exercicio03;

import java.util.Scanner;

public class Resultado {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero a");
        int a = in.nextInt();
        System.out.println("Digite um numero b");
        int b = in.nextInt();
        System.out.println("Soma: "+Soma.getInstance().efetuarOperacao(a, b));
        System.out.println("Subtracao: "+Subtracao.getInstance().efetuarOperacao(a, b));
        System.out.println("Multiplicação: "+Multiplicacao.getInstance().efetuarOperacao(a, b));
        System.out.println("Divisão: "+Divisao.getInstance().efetuarOperacao(a, b));

        in.close();
    }
}
