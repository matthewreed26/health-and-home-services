package com.healthAndHome.account.domain;

public interface TokensRepository {
  Token buildToken(AuthenticationQuery query);
}
