package com.sample;


public class OmsCompanyAddress {

  private long id;
  private String addressName;
  private long sendStatus;
  private long receiveStatus;
  private String name;
  private String phone;
  private String province;
  private String city;
  private String region;
  private String detailAddress;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getAddressName() {
    return addressName;
  }

  public void setAddressName(String addressName) {
    this.addressName = addressName;
  }


  public long getSendStatus() {
    return sendStatus;
  }

  public void setSendStatus(long sendStatus) {
    this.sendStatus = sendStatus;
  }


  public long getReceiveStatus() {
    return receiveStatus;
  }

  public void setReceiveStatus(long receiveStatus) {
    this.receiveStatus = receiveStatus;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }


  public String getDetailAddress() {
    return detailAddress;
  }

  public void setDetailAddress(String detailAddress) {
    this.detailAddress = detailAddress;
  }

}
