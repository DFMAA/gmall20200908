package com.sample;


public class PmsBaseAttrValue {

  private long id;
  private String valueName;
  private long attrId;
  private String isEnabled;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getValueName() {
    return valueName;
  }

  public void setValueName(String valueName) {
    this.valueName = valueName;
  }


  public long getAttrId() {
    return attrId;
  }

  public void setAttrId(long attrId) {
    this.attrId = attrId;
  }


  public String getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(String isEnabled) {
    this.isEnabled = isEnabled;
  }

}
