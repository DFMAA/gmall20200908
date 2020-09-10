package com.sample;


public class PmsSkuImage {

  private long id;
  private long skuId;
  private String imgName;
  private String imgUrl;
  private long productImgId;
  private String isDefault;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getSkuId() {
    return skuId;
  }

  public void setSkuId(long skuId) {
    this.skuId = skuId;
  }


  public String getImgName() {
    return imgName;
  }

  public void setImgName(String imgName) {
    this.imgName = imgName;
  }


  public String getImgUrl() {
    return imgUrl;
  }

  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
  }


  public long getProductImgId() {
    return productImgId;
  }

  public void setProductImgId(long productImgId) {
    this.productImgId = productImgId;
  }


  public String getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(String isDefault) {
    this.isDefault = isDefault;
  }

}
