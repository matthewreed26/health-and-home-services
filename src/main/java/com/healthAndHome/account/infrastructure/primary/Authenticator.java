package com.healthAndHome.account.infrastructure.primary;

import com.healthAndHome.account.application.AccountApplicationService;
import com.healthAndHome.account.domain.Token;
import com.healthAndHome.authentication.application.AuthenticatedUser;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
class Authenticator {

  private final AccountApplicationService accounts;
  private final AuthenticationManagerBuilder authenticationManagerBuilder;

  public Authenticator(AccountApplicationService accounts, AuthenticationManagerBuilder authenticationManagerBuilder) {
    this.accounts = accounts;
    this.authenticationManagerBuilder = authenticationManagerBuilder;
  }

  Token authenticate(RestAuthenticationQuery query) {
    Authentication authentication = authenticationManagerBuilder.getObject().authenticate(query.authenticationToken());

    SecurityContextHolder.getContext().setAuthentication(authentication);

    return accounts.createToken(query.toDomain(AuthenticatedUser.roles()));
  }
}
