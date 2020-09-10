package com.sample;


public class PmsProductInfo {

  private long id;
  private String productName;
  private String description;
  private long catalog3Id;
  private long tmId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public long getCatalog3Id() {
    return catalog3Id;
  }

  public void setCatalog3Id(long catalog3Id) {
    this.catalog3Id = catalog3Id;
  }


  public long getTmId() {
    return tmId;
  }

  public void setTmId(long tmId) {
    this.tmId = tmId;
  }

}
