package com.healthAndHome.account.infrastructure.primary;

import static org.assertj.core.api.Assertions.*;

import com.healthAndHome.JsonHelper;
import com.healthAndHome.UnitTest;
import org.junit.jupiter.api.Test;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

@UnitTest
class RestAuthenticationQueryTest {

  @Test
  void shouldDeserializeFromJson() {
    RestAuthenticationQuery query = JsonHelper.readFromJson(json(), RestAuthenticationQuery.class);

    assertThat(query.authenticationToken()).isEqualTo(new UsernamePasswordAuthenticationToken("user", "password"));
    assertThat(query.isRememberMe()).isTrue();
  }

  private String json() {
    return """
        {
          "username": "user",
          "password": "password",
          "rememberMe": true
        }
        """;
  }
}
