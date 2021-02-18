package br.com.henrique.Exercicio03;

public class Divisao extends Operacao {

    private static final long serialVersionUID = 1L;

    private static Divisao divisao;

    public static Divisao getInstance() {
        if(divisao == null) {
            divisao = new Divisao();
        }
        return divisao;
    }

    @Override
    public Double efetuarOperacao(int a, int b) {
        if(b <= 0) {
            System.out.println("A operação não é possível");
            return Double.valueOf(0);
        }
        return Double.valueOf(a) / Double.valueOf(b);
    }
}