package com.example.page;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class ApiPage {
    private static final String BASE_URL = "https://api.restful-api.dev/objects";
    private CloseableHttpClient client = HttpClients.createDefault();

    public String getAllPhones() throws IOException {
        HttpGet request = new HttpGet(BASE_URL);
        try (CloseableHttpResponse response = client.execute(request)) {
            return EntityUtils.toString(response.getEntity());
        }
    }

    // Add methods for POST, DELETE, PUT
}
