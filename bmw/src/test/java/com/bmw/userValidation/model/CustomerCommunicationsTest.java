package com.bmw.userValidation.model;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Before;
import org.junit.Test;
import com.bmw.cc.uservalidation.model.CustomerCommunications;
import com.bmw.mock.CustomerDataMock;

public class CustomerCommunicationsTest {

  private CustomerDataMock testResource;

  @Before
  public void setUp() {
    testResource = new CustomerDataMock();
  }
  
  @Test
  public void testCustomerCommunicationsGetterSetterAndEqualValues() {
    CustomerCommunications mockData = testResource.getCustomerData().getCommunications().get(0);
    CustomerCommunications setterCustomerCommunicationsData = new CustomerCommunications();
    setterCustomerCommunicationsData.setCommunicationStatus(mockData.getCommunicationStatus());
    setterCustomerCommunicationsData.setCommunicationType(mockData.getCommunicationType());
    setterCustomerCommunicationsData.setConsGUID(mockData.getConsGUID());
    setterCustomerCommunicationsData.setPreferred(mockData.getPreferred());
    setterCustomerCommunicationsData.setValue(mockData.getValue());
    setterCustomerCommunicationsData.setUpdatedAt(mockData.getUpdatedAt());

    assertThat(setterCustomerCommunicationsData.getCommunicationStatus())
        .isEqualTo(mockData.getCommunicationStatus());
    assertThat(setterCustomerCommunicationsData.getCommunicationType())
        .isEqualTo(mockData.getCommunicationType());
    assertThat(setterCustomerCommunicationsData.getConsGUID()).isEqualTo(mockData.getConsGUID());
    assertThat(setterCustomerCommunicationsData.getPreferred()).isEqualTo(mockData.getPreferred());
    assertThat(setterCustomerCommunicationsData.getValue()).isEqualTo(mockData.getValue());
    assertThat(setterCustomerCommunicationsData.getUpdatedAt()).isEqualTo(mockData.getUpdatedAt());
  }
}
