package domain;

public class Caminhao extends Transporte{

    public Caminhao(Carga carga) {
        super(carga);
    }

    @Override
    public Double calculaFrete() {
        if (super.getCarga().getValor() > 40000)
            return ((0.12 * super.getCarga().getPeso()) + (0.3 * super.getCarga().getValor())) * 0.75;
        return ((0.12 * super.getCarga().getPeso()) + (0.3 * super.getCarga().getValor()));
    }
}
