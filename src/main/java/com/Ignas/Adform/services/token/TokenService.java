package com.Ignas.Adform.services.token;

import com.Ignas.Adform.model.token.Token;

import java.io.IOException;

public interface TokenService {

    Token getToken() throws IOException, InterruptedException;

    String getAccessTokenHeader() throws IOException, InterruptedException;
}
