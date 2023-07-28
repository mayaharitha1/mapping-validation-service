package com.bmw.mock;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.bmw.cc.uservalidation.model.CustomerAddress;
import com.bmw.cc.uservalidation.model.CustomerCommunications;
import com.bmw.cc.uservalidation.model.CustomerData;

// used for mocking customer data
public class CustomerDataMock {

  // fetch customer data for test
  public CustomerData getCustomerData() {
    CustomerData customer = new CustomerData();
    customer.setGcid("6ec9a107-996d-4d8a-9eec-f847ca3fa645");
    customer.setGivenName("User");
    customer.setHomeMarket("US");
    customer.setPartnerCategory("PERSON");
    customer.setSalutation("SAL_MR");
    customer.setSurname("Test");
    customer.setUcid("ABC123456");
    customer.setCorrespondLanguageISO("EN");
    customer.setAddresses(loadCustomerAddress());
    customer.setCommunications(loadCustomerCommunications());
    return customer;
  }

  // customer communications for test
  private List<CustomerCommunications> loadCustomerCommunications() {
    List<CustomerCommunications> communicationAddress = new ArrayList<>();
    CustomerCommunications commnAddress1 = new CustomerCommunications();
    commnAddress1.setCommunicationType("MOB");
    commnAddress1.setCommunicationStatus("PRIVATE");
    commnAddress1.setConsGUID("fa7d0185-84f6-4de1-a360-66db5cfbbd5c");
    commnAddress1.setPreferred(true);
    commnAddress1.setValue("+1 131 124 3423");
    commnAddress1.setUpdatedAt(new Date());
    communicationAddress.add(commnAddress1);
    CustomerCommunications commnAddress2 = new CustomerCommunications();
    commnAddress2.setCommunicationType("EMAIL");
    commnAddress2.setCommunicationStatus("PRIVATE");
    commnAddress2.setConsGUID("a612a704-db0c-4d96-86e9-f8e488a60ad4");
    commnAddress2.setPreferred(true);
    commnAddress2.setValue("test@example.com");
    commnAddress2.setUpdatedAt(new Date());
    communicationAddress.add(commnAddress2);
    return communicationAddress;
  }

  // customer address for test
  private List<CustomerAddress> loadCustomerAddress() {
    List<CustomerAddress> customerAddress = new ArrayList<>();
    CustomerAddress customerAddress1 = new CustomerAddress();
    customerAddress1.setCity("New York");
    customerAddress1.setAddressGUID("c57bceaa-c450-4d22-8d1f-d927c554786b");
    customerAddress1.setAddressStatus("PRIVATE");
    customerAddress1.setCountry("US");
    customerAddress1.setPostalCode("10044-0052");
    customerAddress1.setPreferred(true);
    customerAddress1.setRegionCode("US|NY");
    customerAddress1.setStrSuppl1("1 Main St # Test2");
    customerAddress1.setUpdatedAt(new Date());
    customerAddress.add(customerAddress1);
    return customerAddress;
  }
}
