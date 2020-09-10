package com.sample;


public class PmsProductVertifyRecord {

  private long id;
  private long productId;
  private java.sql.Timestamp createTime;
  private String vertifyMan;
  private long status;
  private String detail;


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


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public String getVertifyMan() {
    return vertifyMan;
  }

  public void setVertifyMan(String vertifyMan) {
    this.vertifyMan = vertifyMan;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

}
