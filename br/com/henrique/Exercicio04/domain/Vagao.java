package domain;

public class Vagao extends Transporte {

    public Vagao(Carga carga) {
        super(carga);
    }

    @Override
    public Double calculaFrete() {
        if (super.getCarga().getPeso() < 15000)
            return ((0.2 * super.getCarga().getPeso()) + (0.1 * super.getCarga().getValor())) + 5000;
        return (0.2 * super.getCarga().getPeso()) + (0.1 * super.getCarga().getValor());
    }
}
