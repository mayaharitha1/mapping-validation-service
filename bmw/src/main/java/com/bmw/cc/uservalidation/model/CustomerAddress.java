package com.bmw.cc.uservalidation.model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

// model class for customer address
@Getter
@Setter
public class CustomerAddress {
  private String addressGUID;
  private String strSuppl1;
  private String postalCode;
  private String city;
  private String country;
  private String regionCode;
  private String addressStatus;
  private Boolean preferred;
  private Date updatedAt;
}
