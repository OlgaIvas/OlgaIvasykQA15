package com.telran.addressbook.model;

public class Contact {
  private String firstname;
  private String lastname;
  private String address;
  private String phone;
  private String email;

  public Contact setFirstname(String firstname) {
    this.firstname = firstname;
    return this; }
  public Contact setLastname(String lastname) {
    this.lastname = lastname;
    return this;}
  public Contact setAddress(String address) {
    this.address = address;
    return this;}
  public Contact setPhone(String phone) {
    this.phone = phone;
    return this;}
  public Contact setEmail(String email) {
    this.email = email;
    return this;}

  public String getFirstname() {
    return firstname;
  }
  public String getLastname() {
    return lastname;
  }
  public String getAddress() {
    return address;
  }
  public String getPhone() {
    return phone;
  }
  public String getEmail() {
    return email;
  }
}
