package com.bmw.cc.uservalidation.model;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

// model class for customer profile data
@Getter
@Setter
public class CustomerData {
  private String gcid;
  private String ucid;
  private String partnerCategory;
  private String surname;
  private String givenName;
  private String salutation;
  private String correspondLanguageISO;
  private String homeMarket;
  private List<CustomerAddress> addresses;
  private List<CustomerCommunications> communications;
}
