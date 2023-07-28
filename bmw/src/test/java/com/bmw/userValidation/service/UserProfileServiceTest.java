package com.bmw.userValidation.service;

import java.util.UUID;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import com.bmw.userValidation.UserProfileService;
import com.bmw.userValidation.exception.UserValidationException;

public class UserProfileServiceTest {

  @InjectMocks
  private UserProfileService profileService;


  @Before
  public void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test(expected = UserValidationException.class)
  public void testLoadUserProfile() throws UserValidationException {
    UUID gcId = UUID.randomUUID();
    profileService.LoadCustomerDatafromGcdm(gcId.toString());
    Mockito.doThrow(new UserValidationException(300, "Customer Data Not Available"))
        .when(profileService).LoadCustomerDatafromGcdm(gcId.toString());
  }

  
  @Test(expected = UserValidationException.class)
  public void testvalidateUserProfile() throws UserValidationException {
    profileService.validateCustomerAddress("gcdmData");
    Mockito.doThrow(new UserValidationException(301, "User validation Exception on Validation"))
        .when(profileService).validateCustomerAddress("gcdmData");
  }
   
}
