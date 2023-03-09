package conversor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiConverteMoeda {
    private String urlApi = "https://economia.awesomeapi.com.br/last/USD-BRL,EUR-BRL,BTC-BRL"; // api do site

    public ApiConverteMoeda(String urlApi) {
        this.urlApi = urlApi;
    }

    public double getTaxaDeCambio(String daMoedaX, String paraMoedaY) throws IOException {
        String url = urlApi;

        URL obj = new URL(url); // identifica um recurso na internet (arquivo, página ou imagem). Em java, essa classe é usada para manipular URLs
        HttpURLConnection con = (HttpURLConnection) obj.openConnection(); // HttpURLCon é uma classe que permite fazer requisições HTTP/HTTPS a um servidor. Permite os métodos get, post, put, delete.
        con.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();

        while ((inputLine = in.readLine()) != null){
            response.append(inputLine);
        }

        in.close();

        String jsonResponse = response.toString();
        double taxaX = Double.parseDouble(jsonResponse.substring(jsonResponse.indexOf(daMoedaX + "_BRL") + 9, jsonResponse.indexOf("\"", jsonResponse.indexOf(daMoedaX + "_BRL") + 10)));
        double taxaY = Double.parseDouble(jsonResponse.substring(jsonResponse.indexOf(paraMoedaY + "_BRL") + 9, jsonResponse.indexOf("\"", jsonResponse.indexOf(paraMoedaY + "_BRL") + 10)));

        return taxaY / taxaX;
    }
}
