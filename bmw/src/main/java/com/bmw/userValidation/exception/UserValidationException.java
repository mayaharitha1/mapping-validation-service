package com.bmw.userValidation.exception;

// class for user validation custom exception
public class UserValidationException extends Exception {

  private static final long serialVersionUID = -7558618748640066498L;
  private final int statusCode;

  public UserValidationException(int value, String message) {
    super(message);
    this.statusCode = value;
  }
  
  /*
   * public UserValidationException(final String message, int statusCode) { super(message);
   * this.statusCode = statusCode; }
   * 
   * public UserValidationException(int code, String message, Throwable cause) { super(message,
   * cause); this.statusCode = code; }
   * 
   * public int getStatusCode() { return statusCode; }
   */
}
