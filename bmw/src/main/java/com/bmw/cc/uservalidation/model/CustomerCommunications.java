package com.bmw.cc.uservalidation.model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

// model class for customer communications
@Getter
@Setter
public class CustomerCommunications {
  private String consGUID;
  private String communicationType;
  private String communicationStatus;
  private Boolean preferred;
  private String value;
  private Date updatedAt;
}
