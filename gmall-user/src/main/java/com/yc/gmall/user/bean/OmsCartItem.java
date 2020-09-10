package com.yc.gmall.user.bean;


public class OmsCartItem {

  private long id;
  private long productId;
  private long productSkuId;
  private long memberId;
  private long quantity;
  private double price;
  private String sp1;
  private String sp2;
  private String sp3;
  private String productPic;
  private String productName;
  private String productSubTitle;
  private String productSkuCode;
  private String memberNickname;
  private java.sql.Timestamp createDate;
  private java.sql.Timestamp modifyDate;
  private long deleteStatus;
  private long productCategoryId;
  private String productBrand;
  private String productSn;
  private String productAttr;


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


  public long getProductSkuId() {
    return productSkuId;
  }

  public void setProductSkuId(long productSkuId) {
    this.productSkuId = productSkuId;
  }


  public long getMemberId() {
    return memberId;
  }

  public void setMemberId(long memberId) {
    this.memberId = memberId;
  }


  public long getQuantity() {
    return quantity;
  }

  public void setQuantity(long quantity) {
    this.quantity = quantity;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public String getSp1() {
    return sp1;
  }

  public void setSp1(String sp1) {
    this.sp1 = sp1;
  }


  public String getSp2() {
    return sp2;
  }

  public void setSp2(String sp2) {
    this.sp2 = sp2;
  }


  public String getSp3() {
    return sp3;
  }

  public void setSp3(String sp3) {
    this.sp3 = sp3;
  }


  public String getProductPic() {
    return productPic;
  }

  public void setProductPic(String productPic) {
    this.productPic = productPic;
  }


  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }


  public String getProductSubTitle() {
    return productSubTitle;
  }

  public void setProductSubTitle(String productSubTitle) {
    this.productSubTitle = productSubTitle;
  }


  public String getProductSkuCode() {
    return productSkuCode;
  }

  public void setProductSkuCode(String productSkuCode) {
    this.productSkuCode = productSkuCode;
  }


  public String getMemberNickname() {
    return memberNickname;
  }

  public void setMemberNickname(String memberNickname) {
    this.memberNickname = memberNickname;
  }


  public java.sql.Timestamp getCreateDate() {
    return createDate;
  }

  public void setCreateDate(java.sql.Timestamp createDate) {
    this.createDate = createDate;
  }


  public java.sql.Timestamp getModifyDate() {
    return modifyDate;
  }

  public void setModifyDate(java.sql.Timestamp modifyDate) {
    this.modifyDate = modifyDate;
  }


  public long getDeleteStatus() {
    return deleteStatus;
  }

  public void setDeleteStatus(long deleteStatus) {
    this.deleteStatus = deleteStatus;
  }


  public long getProductCategoryId() {
    return productCategoryId;
  }

  public void setProductCategoryId(long productCategoryId) {
    this.productCategoryId = productCategoryId;
  }


  public String getProductBrand() {
    return productBrand;
  }

  public void setProductBrand(String productBrand) {
    this.productBrand = productBrand;
  }


  public String getProductSn() {
    return productSn;
  }

  public void setProductSn(String productSn) {
    this.productSn = productSn;
  }


  public String getProductAttr() {
    return productAttr;
  }

  public void setProductAttr(String productAttr) {
    this.productAttr = productAttr;
  }

}
