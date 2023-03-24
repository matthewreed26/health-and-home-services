package com.healthAndHome.account.domain;

import com.healthAndHome.error.domain.Assert;

public record Token(String token) {
  public Token {
    Assert.notBlank("token", token);
  }

  public String get() {
    return token();
  }

  public String bearer() {
    return "Bearer " + token();
  }
}
