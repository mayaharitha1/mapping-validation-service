package com.bmw.userValidation.controller;

import java.util.UUID;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import com.bmw.userValidation.UserProfileController;
import com.bmw.userValidation.UserProfileService;
import com.bmw.userValidation.exception.UserValidationException;

public class UserProfileControllerTest {

  @InjectMocks
  private UserProfileController userProfileController;

  @Mock
  private UserProfileService profileService;

  @Before
  public void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  public void testLoadUserProfile() throws UserValidationException {
    UUID gcId = UUID.randomUUID();
    Mockito.when(profileService.LoadCustomerDatafromGcdm(gcId.toString())).thenReturn("ResponseData");
    String gcdmData = userProfileController.loadUserProfile(gcId.toString());
    Assertions.assertThat(gcdmData).isNotNull();
  }
  
  @Test
  public void testValidateUserProfile() throws UserValidationException {
    UUID gcId = UUID.randomUUID();
    Mockito.when(profileService.LoadCustomerDatafromGcdm(gcId.toString())).thenReturn("ResponseData");
    Mockito.when(profileService.validateCustomerAddress("ResponseData")).thenReturn("OK");
    String result = userProfileController.validateUserProfile(gcId.toString());
    Assertions.assertThat(result).isEqualTo("OK");
  }
}
