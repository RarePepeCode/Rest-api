package com.Ignas.Adform.services.token;

import com.Ignas.Adform.model.token.Token;
import com.Ignas.Adform.model.token.TokenRequest;
import com.Ignas.Adform.utils.HttpUtils;
import com.Ignas.Adform.utils.JsonUtlils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.http.HttpResponse;
import java.time.LocalDateTime;

@Service
public class TokenServinceImpl implements TokenService {


    private static final String GET_TOKEN_URL = "https://id.adform.com/sts/connect/token";

    private static final String GRANT_TYPE = "client_credentials";
    private static final String CLIENT_ID = "publisherstats.public@adform.com";
    private static final String CLIENT_SECREAT = "oR43Pjn0q03DvQUitrIJK4092TyrdjXmLKtPAwDb";
    private static final String SCOPE = "https://api.adform.com/scope/eapi";

    private String accessToken;
    private LocalDateTime tokenExpireDate;

    @Autowired
    private HttpUtils httpUtils;

    @Override
    public Token getToken() throws IOException, InterruptedException {
        TokenRequest tokenRequest = new TokenRequest(GRANT_TYPE, CLIENT_ID, CLIENT_SECREAT, SCOPE);
        HttpResponse<String> response = httpUtils.sendPostRequestWithAuthorization(GET_TOKEN_URL, MediaType.APPLICATION_FORM_URLENCODED_VALUE, tokenRequest.getEncodedURL());
        return  JsonUtlils.deserializeJsonToToken(response.body());
    }

    @Override
    public String getAccessTokenHeader() throws IOException, InterruptedException {
        if (accessToken == null || tokenExpireDate.isBefore(LocalDateTime.now())) {
            generateToken();
        }
        return  "Bearer " + accessToken;

    }

    private void generateToken() throws IOException, InterruptedException {
        Token token = getToken();
        accessToken = token.getAccess_token();
        tokenExpireDate = LocalDateTime.now().plusSeconds(token.getExpires_in());
    }
}
