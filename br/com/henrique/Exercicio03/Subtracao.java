package br.com.henrique.Exercicio03;

public class Subtracao extends Operacao {

    private static final long serialVersionUID = 1L;

    private static Subtracao subtracao;

    public static Subtracao getInstance() {
        if(subtracao == null) {
            subtracao = new Subtracao();
        }
        return subtracao;
    }

    @Override
    public Integer efetuarOperacao(int a, int b) {
        return a - b;
    }
}