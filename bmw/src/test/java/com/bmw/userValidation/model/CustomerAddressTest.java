package com.bmw.userValidation.model;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Before;
import org.junit.Test;
import com.bmw.cc.uservalidation.model.CustomerAddress;
import com.bmw.mock.CustomerDataMock;

public class CustomerAddressTest {

  private CustomerDataMock testResource;

  @Before
  public void setUp() {
    testResource = new CustomerDataMock();
  }
  
  @Test
  public void testCustomerAddressGetterSetterAndEqualValues() {
    CustomerAddress mockData = testResource.getCustomerData().getAddresses().get(0);
    CustomerAddress setterCustomerAddressData = new CustomerAddress();
    setterCustomerAddressData.setAddressGUID(mockData.getAddressGUID());
    setterCustomerAddressData.setStrSuppl1(mockData.getStrSuppl1());
    setterCustomerAddressData.setPostalCode(mockData.getPostalCode());
    setterCustomerAddressData.setCity(mockData.getCity());
    setterCustomerAddressData.setCountry(mockData.getCountry());
    setterCustomerAddressData.setRegionCode(mockData.getRegionCode());
    setterCustomerAddressData.setAddressStatus(mockData.getAddressStatus());
    setterCustomerAddressData.setPreferred(mockData.getPreferred());
    setterCustomerAddressData.setUpdatedAt(mockData.getUpdatedAt());

    assertThat(setterCustomerAddressData.getAddressGUID()).isEqualTo(mockData.getAddressGUID());
    assertThat(setterCustomerAddressData.getStrSuppl1()).isEqualTo(mockData.getStrSuppl1());
    assertThat(setterCustomerAddressData.getPostalCode()).isEqualTo(mockData.getPostalCode());
    assertThat(setterCustomerAddressData.getCity()).isEqualTo(mockData.getCity());
    assertThat(setterCustomerAddressData.getCountry()).isEqualTo(mockData.getCountry());
    assertThat(setterCustomerAddressData.getRegionCode()).isEqualTo(mockData.getRegionCode());
    assertThat(setterCustomerAddressData.getAddressStatus()).isEqualTo(mockData.getAddressStatus());
    assertThat(setterCustomerAddressData.getPreferred()).isEqualTo(mockData.getPreferred());
    assertThat(setterCustomerAddressData.getUpdatedAt()).isEqualTo(mockData.getUpdatedAt());
  }
}
