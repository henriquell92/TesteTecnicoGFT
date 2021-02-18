package domain;

public abstract class Transporte {
    private Carga carga;

    public Transporte(Carga carga) {
        this.carga = carga;
    }

    public Carga getCarga() {
        return carga;
    }

    public abstract Double calculaFrete();
}