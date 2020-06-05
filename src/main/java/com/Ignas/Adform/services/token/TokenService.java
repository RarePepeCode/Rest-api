package com.Ignas.Adform.services.token;

import com.Ignas.Adform.model.Token;
import com.Ignas.Adform.model.TokenRequest;

import java.io.IOException;

public interface TokenService {

    Token getToken(TokenRequest requestParams) throws IOException, InterruptedException;
}
