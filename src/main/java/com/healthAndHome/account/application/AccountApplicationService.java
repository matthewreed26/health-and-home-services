package com.healthAndHome.account.application;

import com.healthAndHome.account.domain.AuthenticationQuery;
import com.healthAndHome.account.domain.Token;
import com.healthAndHome.account.domain.TokensRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountApplicationService {

  private final TokensRepository tokens;

  public AccountApplicationService(TokensRepository tokens) {
    this.tokens = tokens;
  }

  public Token createToken(AuthenticationQuery query) {
    return tokens.buildToken(query);
  }
}
