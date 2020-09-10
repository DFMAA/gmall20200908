package com.sample;


public class PmsBaseAttrInfo {

  private long id;
  private String attrName;
  private long catalog3Id;
  private String isEnabled;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getAttrName() {
    return attrName;
  }

  public void setAttrName(String attrName) {
    this.attrName = attrName;
  }


  public long getCatalog3Id() {
    return catalog3Id;
  }

  public void setCatalog3Id(long catalog3Id) {
    this.catalog3Id = catalog3Id;
  }


  public String getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(String isEnabled) {
    this.isEnabled = isEnabled;
  }

}
