package com.Ignas.Adform.controllers.token;


import com.Ignas.Adform.model.Token;
import com.Ignas.Adform.model.TokenRequest;
import com.Ignas.Adform.services.token.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/token")
public class TokenController {

    private static final String GRANT_TYPE = "client_credentials";
    private static final String CLIENT_ID = "publisherstats.public@adform.com";
    private static final String CLIENT_SECREAT = "oR43Pjn0q03DvQUitrIJK4092TyrdjXmLKtPAwDb";
    private static final String SCOPE = "https://api.adform.com/scope/eapi";

    @Autowired
    private TokenService tokenService;

    @GetMapping()
    public Token xd() throws IOException, InterruptedException {
        Token token = tokenService.getToken(new TokenRequest(GRANT_TYPE, CLIENT_ID, CLIENT_SECREAT, SCOPE));
        return  token;
    }
}
