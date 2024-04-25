package Modulos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiConector {

    private String chaveApi = "2696a83288e76aa6168e1f40";
    private String url = "https://v6.exchangerate-api.com/v6/";
    private String moedaBase;
    private String moedaAlvo;


    public String conversor(int opcaoDeEntrada, double valorDeEntrada) throws IOException, InterruptedException {
        try {
            switch (opcaoDeEntrada) {
                case 1:
                    this.moedaBase = "BRL";
                    this.moedaAlvo = "USD";
                    break;
                case 2:
                    this.moedaBase = "USD";
                    this.moedaAlvo = "BRL";
                    break;
                case 3:
                    this.moedaBase = "BRL";
                    this.moedaAlvo = "BOB";
                    break;
                case 4:
                    this.moedaBase = "BOB";
                    this.moedaAlvo = "BRL";
                    break;
                case 5:
                    this.moedaBase = "BRL";
                    this.moedaAlvo = "ARS";
                    break;
                case 6:
                    this.moedaBase = "ARS";
                    this.moedaAlvo = "BRL";
                    break;
                default:
                    System.out.println("Saindo do programa...");
                    break;
            }

            Gson gson = new GsonBuilder().create();
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(this.url + this.chaveApi + "/pair/" + this.moedaBase + "/" + this.moedaAlvo + "/" + valorDeEntrada))
                    .build();


            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());


            String json = response.body();
            LeitorApi minhaApi = gson.fromJson(json, LeitorApi.class);
            Moeda minhaMoeda = new Moeda(minhaApi);

            return minhaMoeda.toString();


        } catch (Exception e) {
            System.out.println("A api não conseguiu fazer a leitura da sua entrada : \n " + e);

        }

        return "\n Erro Fatal";
    }
}