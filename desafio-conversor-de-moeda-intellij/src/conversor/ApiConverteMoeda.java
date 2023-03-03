package conversor;

import java.io.IOException;

public class ApiConverteMoeda {

    private final String API_KEY;
    private final String BASE_URL;

    public ApiConverteMoeda(String API_KEY, String BASE_URL) {
        this.API_KEY = API_KEY;
        this.BASE_URL = "https://olinda.bcb.gov.br/olinda/servico/PTAX/versao/v1/odata/";;
    }

    public double getTaxaDeCambio(String daMoedaX, String paraMoedaY) throws IOException {
        String url = BASE_URL
    }
}
