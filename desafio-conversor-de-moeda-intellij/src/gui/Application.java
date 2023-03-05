package gui;

import conversor.ApiConverteMoeda;
import conversor.RealParaDolar;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {

        ApiConverteMoeda api = new ApiConverteMoeda("https://economia.awesomeapi.com.br/last/USD-BRL,EUR-BRL,BTC-BRL");
        RealParaDolar conversor = new RealParaDolar(api);

        double valorReais = 100.0;
        double valorDolares = conversor.converteComApi(valorReais);
        System.out.printf("%.2f reais equivalem a %.2f dólares \n", valorReais, valorDolares);
    }
}
