package com.sample;


public class PmsSkuInfo {

  private long id;
  private long productId;
  private double price;
  private String skuName;
  private String skuDesc;
  private double weight;
  private long tmId;
  private long catalog3Id;
  private String skuDefaultImg;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getProductId() {
    return productId;
  }

  public void setProductId(long productId) {
    this.productId = productId;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public String getSkuName() {
    return skuName;
  }

  public void setSkuName(String skuName) {
    this.skuName = skuName;
  }


  public String getSkuDesc() {
    return skuDesc;
  }

  public void setSkuDesc(String skuDesc) {
    this.skuDesc = skuDesc;
  }


  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }


  public long getTmId() {
    return tmId;
  }

  public void setTmId(long tmId) {
    this.tmId = tmId;
  }


  public long getCatalog3Id() {
    return catalog3Id;
  }

  public void setCatalog3Id(long catalog3Id) {
    this.catalog3Id = catalog3Id;
  }


  public String getSkuDefaultImg() {
    return skuDefaultImg;
  }

  public void setSkuDefaultImg(String skuDefaultImg) {
    this.skuDefaultImg = skuDefaultImg;
  }

}
