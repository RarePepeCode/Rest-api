package com.Ignas.Adform.controllers.token;


import com.Ignas.Adform.model.token.Token;
import com.Ignas.Adform.services.token.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/token")
public class TokenController {



    @Autowired
    private TokenService tokenService;

    @GetMapping()
    public Token getToken() throws IOException, InterruptedException {
        Token token = tokenService.getToken();
        return  token;
    }
}
