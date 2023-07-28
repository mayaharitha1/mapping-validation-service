package com.bmw.userValidation.constants;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class UserValidationConstantsTest {

  @Test
  public void TestUserValidationValues() {
    UserValidationConstants consts = new UserValidationConstants();
    Assertions.assertThat(UserValidationConstants.TOLERANT_URL).isEqualTo(
        "https://c2btolerant-bip-i.bmwgroup.net/postService/post/V1/gcdmone/Interactive");
    Assertions.assertThat(UserValidationConstants.GCDM_URL).isEqualTo(
        "https://c2b-i.bmwgrop.net/api/v4/clients/casa/default/customers");
  }
}
