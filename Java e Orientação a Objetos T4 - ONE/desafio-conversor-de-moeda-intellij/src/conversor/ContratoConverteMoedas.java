package conversor;

import java.io.IOException;

public interface ContratoConverteMoedas {

    public abstract double converte(double valor) throws IOException;
}
