package br.com.henrique.Exercicio02;

import java.util.Scanner;

public class ElefanteIncomoda {

    public static void main(String[] args) {
        //recebendo o valor inserido pelo usuario
        final Scanner in = new Scanner(System.in);
        System.out.println("Por favor, digite um valor");
        elefanteIncomoda(in.nextInt());
        in.close();
    }

    //Logica para retornar o conteudo da mensagem
    private static void elefanteIncomoda(int index) {
        if(index <= 0) {
            return;
        }
        final String estatico = "Incomoda";
        final String frase = "muito mais";
        final StringBuilder builder = new StringBuilder();
        for(int i=0;i<index;i++) {
            builder.append(estatico).append(" ");
        }

        builder.append(frase);
        System.out.println(builder.toString());
    }
}
