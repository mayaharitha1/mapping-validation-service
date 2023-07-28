package com.bmw.userValidation;

import com.bmw.userValidation.constants.UserValidationConstants;
import com.bmw.userValidation.exception.UserValidationException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.commons.codec.binary.Base64;
import org.springframework.stereotype.Service;

// this service class for fetch customer data from GCDM and validates.
@Service
public class UserProfileService {
 
  // This method for fetch validate custom data from Tolerant.
  public String validateCustomerAddress(String profiledata) throws UserValidationException {
    StringBuilder tolerantResponse = new StringBuilder();
    try {
      URL obj = new URL(UserValidationConstants.TOLERANT_URL
          + "?reqId=1&maxResultCount=1&city=Friedrichshafen&street=Otto-Liliental-Stra%C3%9Fe&postalcode=88046&number=2&countryCode=countryCode&addressline2=addressline2&addressline3=addressline3&province=&country=Deutschland");
      HttpURLConnection con = (HttpURLConnection) obj.openConnection();
      con.setRequestMethod("GET");
      int responseCode = con.getResponseCode();
      if (responseCode == HttpURLConnection.HTTP_OK) { // success
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
          tolerantResponse.append(inputLine);
        }
        in.close();
      }
    } catch (Exception e) {
      throw new UserValidationException(301, "User validation Exception on Validation");
    }
    return tolerantResponse.toString();
  }


  private static String getBasicAuthHeader() {
    String credentials = "qqcscn0:Laptop#1";
    return new String(Base64.encodeBase64(credentials.getBytes()));
  }

//This method for fetch Customer data from GCDM.
  public String LoadCustomerDatafromGcdm(String gcId) throws UserValidationException {
    StringBuilder gcdmResponse = new StringBuilder();
    try {
      URL gcdmURl =
          new URL(UserValidationConstants.GCDM_URL + "?gcid=" + gcId);
      HttpURLConnection con = (HttpURLConnection) gcdmURl.openConnection();
      con.setRequestProperty("Authorization", getBasicAuthHeader());
      con.setRequestMethod("GET");
      int responseCode = con.getResponseCode();
      if (responseCode == HttpURLConnection.HTTP_OK) { // success
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
          gcdmResponse.append(inputLine);
        }
        in.close();
      }
    } catch (Exception e) {
      throw new UserValidationException(300, "Customer Data Not Available");
    }
    return gcdmResponse.toString();
  }
}