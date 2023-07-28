package com.bmw.userValidation;

import com.bmw.userValidation.exception.UserValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//this controller class for loading user profile and validates user profile data.
@RestController
@RequestMapping("/restForward")
public class UserProfileController {

  @Autowired
  private UserProfileService profileService;

  /**
   * This is end point for fetch Customer data in the form of JSON.
   * 
   * @param gcId -gcId for load GCDM data
   * @throws UserValidationException 
   */
  @GetMapping("/me/profile/v2")
  public String loadUserProfile(@RequestParam(required = true) String gcId) throws UserValidationException {
    return profileService.LoadCustomerDatafromGcdm(gcId);
  }


  /**
   * This is end point for validate Customer address.
   * 
   * @param gcId -gcId for load GCDM data
   * @throws UserValidationException
   */
  @GetMapping("/me/profile/v2/validation")
  public String validateUserProfile(@RequestParam(required = true) String gcId)
      throws UserValidationException {
    String profiledata = profileService.LoadCustomerDatafromGcdm(gcId);
    return profileService.validateCustomerAddress(profiledata);
  }
}
