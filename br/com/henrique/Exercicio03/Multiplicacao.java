package br.com.henrique.Exercicio03;

public class Multiplicacao extends Operacao {

    private static final long serialVersionUID = 1L;

    private static Multiplicacao multiplicacao;

    public static Multiplicacao getInstance() {
        if(multiplicacao == null) {
            multiplicacao = new Multiplicacao();
        }
        return multiplicacao;
    }

    @Override
    public Integer efetuarOperacao(int a, int b) {
        return a * b;
    }
}