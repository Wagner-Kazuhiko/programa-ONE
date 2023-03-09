package conversor;


import java.io.IOException;

public class RealParaDolar implements ContratoConverteMoedas{

    private ApiConverteMoeda apiConverteMoeda;

    public RealParaDolar(ApiConverteMoeda apiConverteMoeda) {
        this.apiConverteMoeda = apiConverteMoeda;
    }

    @Override
    public double converte(double valor) throws IOException {
        double taxaDeCambio = apiConverteMoeda.getTaxaDeCambio("BRL", "USD");
        return valor / taxaDeCambio;
    }

    public double converteComApi(double valor) throws IOException {
        return converte(valor);
    }



}
