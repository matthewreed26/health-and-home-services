package com.healthAndHome.pagination.domain;

import java.util.List;

import com.healthAndHome.pagination.domain.HealthAndHomePage.HealthAndHomePageBuilder;

public final class HealthAndHomePagesFixture {

  private HealthAndHomePagesFixture() {}

  public static HealthAndHomePage<String> page() {
    return pageBuilder().build();
  }

  public static HealthAndHomePageBuilder<String> pageBuilder() {
    return HealthAndHomePage.builder(List.of("test")).currentPage(2).pageSize(10).totalElementsCount(21);
  }
}
