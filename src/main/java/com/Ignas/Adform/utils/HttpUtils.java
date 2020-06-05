package com.Ignas.Adform.utils;

import org.springframework.http.MediaType;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpUtils {

    private static HttpClient client = HttpClient.newHttpClient();

    public static HttpResponse<String> sendPostRequest(String url, String mediaType, String body) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .header("Content-Type", mediaType)
                .header("Accept", MediaType.APPLICATION_JSON_VALUE)
                .uri(URI.create(url))
                .build();
        return client.send(request, HttpResponse.BodyHandlers.ofString());
    }
}
