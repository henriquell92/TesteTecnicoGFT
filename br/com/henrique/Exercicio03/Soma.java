package br.com.henrique.Exercicio03;

public class Soma extends Operacao {

    private static final long serialVersionUID = 1L;

    private static Soma soma;

    public static Soma getInstance() {
        if(soma == null) {
            soma = new Soma();
        }
        return soma;
    }

    @Override
    public Integer efetuarOperacao(int a, int b) {
        return a + b;
    }
}