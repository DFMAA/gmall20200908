package com.sample;


public class PmsProductSaleAttr {

  private long id;
  private long productId;
  private long saleAttrId;
  private String saleAttrName;


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


  public long getSaleAttrId() {
    return saleAttrId;
  }

  public void setSaleAttrId(long saleAttrId) {
    this.saleAttrId = saleAttrId;
  }


  public String getSaleAttrName() {
    return saleAttrName;
  }

  public void setSaleAttrName(String saleAttrName) {
    this.saleAttrName = saleAttrName;
  }

}
