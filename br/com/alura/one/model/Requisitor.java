package br.com.alura.one.model;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Requisitor {

    private HttpClient client;

    public Requisitor(){
        client = HttpClient.newHttpClient();
    }

    public HttpResponse<String> requisitar(String uri){
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(uri))
                    .build();
            return client.send(request, HttpResponse.BodyHandlers.ofString());
        }
        catch (URISyntaxException | IOException | InterruptedException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

}
