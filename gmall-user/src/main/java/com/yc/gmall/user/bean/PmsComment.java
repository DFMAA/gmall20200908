package com.sample;


public class PmsComment {

  private long id;
  private long productId;
  private String memberNickName;
  private String productName;
  private long star;
  private String memberIp;
  private java.sql.Timestamp createTime;
  private long showStatus;
  private String productAttribute;
  private long collectCouont;
  private long readCount;
  private String content;
  private String pics;
  private String memberIcon;
  private long replayCount;


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


  public String getMemberNickName() {
    return memberNickName;
  }

  public void setMemberNickName(String memberNickName) {
    this.memberNickName = memberNickName;
  }


  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }


  public long getStar() {
    return star;
  }

  public void setStar(long star) {
    this.star = star;
  }


  public String getMemberIp() {
    return memberIp;
  }

  public void setMemberIp(String memberIp) {
    this.memberIp = memberIp;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public long getShowStatus() {
    return showStatus;
  }

  public void setShowStatus(long showStatus) {
    this.showStatus = showStatus;
  }


  public String getProductAttribute() {
    return productAttribute;
  }

  public void setProductAttribute(String productAttribute) {
    this.productAttribute = productAttribute;
  }


  public long getCollectCouont() {
    return collectCouont;
  }

  public void setCollectCouont(long collectCouont) {
    this.collectCouont = collectCouont;
  }


  public long getReadCount() {
    return readCount;
  }

  public void setReadCount(long readCount) {
    this.readCount = readCount;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public String getPics() {
    return pics;
  }

  public void setPics(String pics) {
    this.pics = pics;
  }


  public String getMemberIcon() {
    return memberIcon;
  }

  public void setMemberIcon(String memberIcon) {
    this.memberIcon = memberIcon;
  }


  public long getReplayCount() {
    return replayCount;
  }

  public void setReplayCount(long replayCount) {
    this.replayCount = replayCount;
  }

}
