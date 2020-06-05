package com.Ignas.Adform.services.token;

import com.Ignas.Adform.model.Token;
import com.Ignas.Adform.model.TokenRequest;
import com.Ignas.Adform.utils.HttpUtils;
import com.Ignas.Adform.utils.JsonUtlils;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class TokenServinceImpl implements TokenService {


    private static final String GET_TOKEN_URL = "https://id.adform.com/sts/connect/token";

    @Override
    public Token getToken(TokenRequest requestBody) throws IOException, InterruptedException {
        HttpResponse<String> response = HttpUtils.sendPostRequest(GET_TOKEN_URL, MediaType.APPLICATION_FORM_URLENCODED_VALUE, requestBody.getEncodedURL());
        return  JsonUtlils.deserializeJsonToToken(response.body());
    }
}
