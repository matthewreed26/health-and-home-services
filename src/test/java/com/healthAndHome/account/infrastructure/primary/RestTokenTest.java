package com.healthAndHome.account.infrastructure.primary;

import static com.healthAndHome.account.domain.TokensFixture.*;
import static org.assertj.core.api.Assertions.*;

import com.healthAndHome.JsonHelper;
import com.healthAndHome.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class RestTokenTest {

  @Test
  void shouldConvertFromDomain() {
    assertThat(JsonHelper.writeAsString(RestToken.from(token()))).isEqualTo(json());
  }

  private String json() {
    return "{\"id_token\":\"token\"}";
  }
}
