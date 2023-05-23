package com.healthAndHome.technical.infrastructure.secondary.cache;

import com.healthAndHome.IntegrationTest;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceUnit;
import org.assertj.core.api.Assertions;
import org.hibernate.cache.internal.EnabledCaching;
import org.junit.jupiter.api.Test;

@IntegrationTest
class Hibernate2ndLevelCacheConfigurationIT {

  @PersistenceUnit
  EntityManagerFactory factory;

  @Test
  void shouldEnableHibernateCaching() {
    Assertions.assertThat(factory.getCache()).isInstanceOf(EnabledCaching.class);
  }
}
