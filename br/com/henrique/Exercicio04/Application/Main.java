package br.com.henrique.Aplication;

import domain.Caminhao;
import domain.Carga;
import domain.Vagao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carga carga = new Carga();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o peso da carga:");
        carga.setPeso(sc.nextDouble());
        System.out.println("Digite o valor da carga:");
        carga.setValor(sc.nextDouble());

        Caminhao caminhao = new Caminhao(carga);
        Vagao vagao = new Vagao(carga);

        System.out.println("O valor do do frete da carga para Vagão é:" + vagao.calculaFrete());
        System.out.println("O valor do do frete da carga para Caminhão é:" + caminhao.calculaFrete());
    }
}
