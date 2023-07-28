package com.bmw.userValidation.model;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Before;
import org.junit.Test;
import com.bmw.cc.uservalidation.model.CustomerData;
import com.bmw.mock.CustomerDataMock;



public class CustomerDataTest {

  private CustomerDataMock testResource;

  @Before
  public void setUp() {
    testResource = new CustomerDataMock();
  }
  
  @Test
  public void testCustomerDataGetterSetterAndEqualValues() {
    CustomerData mockData = testResource.getCustomerData();
    CustomerData setterCustomerData = new CustomerData();
    setterCustomerData.setGcid(mockData.getGcid());
    setterCustomerData.setGivenName(mockData.getGivenName());
    setterCustomerData.setHomeMarket(mockData.getHomeMarket());
    setterCustomerData.setPartnerCategory(mockData.getPartnerCategory());
    setterCustomerData.setSalutation(mockData.getSalutation());
    setterCustomerData.setSurname(mockData.getSurname());
    setterCustomerData.setUcid(mockData.getUcid());
    setterCustomerData.setCorrespondLanguageISO(mockData.getCorrespondLanguageISO());
    setterCustomerData.setAddresses(mockData.getAddresses());
    setterCustomerData.setCommunications(mockData.getCommunications());

    assertThat(setterCustomerData.getGcid()).isEqualTo(mockData.getGcid());
    assertThat(setterCustomerData.getGivenName()).isEqualTo(mockData.getGivenName());
    assertThat(setterCustomerData.getHomeMarket()).isEqualTo(mockData.getHomeMarket());
    assertThat(setterCustomerData.getPartnerCategory()).isEqualTo(mockData.getPartnerCategory());
    assertThat(setterCustomerData.getSalutation()).isEqualTo(mockData.getSalutation());
    assertThat(setterCustomerData.getSurname()).isEqualTo(mockData.getSurname());
    assertThat(setterCustomerData.getUcid()).isEqualTo(mockData.getUcid());
    assertThat(setterCustomerData.getCorrespondLanguageISO())
        .isEqualTo(mockData.getCorrespondLanguageISO());
    assertThat(setterCustomerData.getAddresses()).isEqualTo(mockData.getAddresses());
    assertThat(setterCustomerData.getCommunications()).isEqualTo(mockData.getCommunications());
  }
}
