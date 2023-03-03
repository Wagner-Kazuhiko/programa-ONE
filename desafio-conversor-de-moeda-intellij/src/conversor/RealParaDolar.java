package conversor;

public class RealParaDolar implements ContratoConverteMoedas{

    private double taxaDeCambio;

    public RealParaDolar(double taxaDeCambio) {
        this.taxaDeCambio = taxaDeCambio;
    }

    @Override
    public double converte(double valor) {
        return valor / taxaDeCambio;
    }
}
