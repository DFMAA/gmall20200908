package com.sample;


public class OmsOrder {

  private long id;
  private long memberId;
  private long couponId;
  private String orderSn;
  private java.sql.Timestamp createTime;
  private String memberUsername;
  private double totalAmount;
  private double payAmount;
  private double freightAmount;
  private double promotionAmount;
  private double integrationAmount;
  private double couponAmount;
  private double discountAmount;
  private long payType;
  private long sourceType;
  private long status;
  private long orderType;
  private String deliveryCompany;
  private String deliverySn;
  private long autoConfirmDay;
  private long integration;
  private long growth;
  private String promotionInfo;
  private long billType;
  private String billHeader;
  private String billContent;
  private String billReceiverPhone;
  private String billReceiverEmail;
  private String receiverName;
  private String receiverPhone;
  private String receiverPostCode;
  private String receiverProvince;
  private String receiverCity;
  private String receiverRegion;
  private String receiverDetailAddress;
  private String note;
  private long confirmStatus;
  private long deleteStatus;
  private long useIntegration;
  private java.sql.Timestamp paymentTime;
  private java.sql.Timestamp deliveryTime;
  private java.sql.Timestamp receiveTime;
  private java.sql.Timestamp commentTime;
  private java.sql.Timestamp modifyTime;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getMemberId() {
    return memberId;
  }

  public void setMemberId(long memberId) {
    this.memberId = memberId;
  }


  public long getCouponId() {
    return couponId;
  }

  public void setCouponId(long couponId) {
    this.couponId = couponId;
  }


  public String getOrderSn() {
    return orderSn;
  }

  public void setOrderSn(String orderSn) {
    this.orderSn = orderSn;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public String getMemberUsername() {
    return memberUsername;
  }

  public void setMemberUsername(String memberUsername) {
    this.memberUsername = memberUsername;
  }


  public double getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(double totalAmount) {
    this.totalAmount = totalAmount;
  }


  public double getPayAmount() {
    return payAmount;
  }

  public void setPayAmount(double payAmount) {
    this.payAmount = payAmount;
  }


  public double getFreightAmount() {
    return freightAmount;
  }

  public void setFreightAmount(double freightAmount) {
    this.freightAmount = freightAmount;
  }


  public double getPromotionAmount() {
    return promotionAmount;
  }

  public void setPromotionAmount(double promotionAmount) {
    this.promotionAmount = promotionAmount;
  }


  public double getIntegrationAmount() {
    return integrationAmount;
  }

  public void setIntegrationAmount(double integrationAmount) {
    this.integrationAmount = integrationAmount;
  }


  public double getCouponAmount() {
    return couponAmount;
  }

  public void setCouponAmount(double couponAmount) {
    this.couponAmount = couponAmount;
  }


  public double getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(double discountAmount) {
    this.discountAmount = discountAmount;
  }


  public long getPayType() {
    return payType;
  }

  public void setPayType(long payType) {
    this.payType = payType;
  }


  public long getSourceType() {
    return sourceType;
  }

  public void setSourceType(long sourceType) {
    this.sourceType = sourceType;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public long getOrderType() {
    return orderType;
  }

  public void setOrderType(long orderType) {
    this.orderType = orderType;
  }


  public String getDeliveryCompany() {
    return deliveryCompany;
  }

  public void setDeliveryCompany(String deliveryCompany) {
    this.deliveryCompany = deliveryCompany;
  }


  public String getDeliverySn() {
    return deliverySn;
  }

  public void setDeliverySn(String deliverySn) {
    this.deliverySn = deliverySn;
  }


  public long getAutoConfirmDay() {
    return autoConfirmDay;
  }

  public void setAutoConfirmDay(long autoConfirmDay) {
    this.autoConfirmDay = autoConfirmDay;
  }


  public long getIntegration() {
    return integration;
  }

  public void setIntegration(long integration) {
    this.integration = integration;
  }


  public long getGrowth() {
    return growth;
  }

  public void setGrowth(long growth) {
    this.growth = growth;
  }


  public String getPromotionInfo() {
    return promotionInfo;
  }

  public void setPromotionInfo(String promotionInfo) {
    this.promotionInfo = promotionInfo;
  }


  public long getBillType() {
    return billType;
  }

  public void setBillType(long billType) {
    this.billType = billType;
  }


  public String getBillHeader() {
    return billHeader;
  }

  public void setBillHeader(String billHeader) {
    this.billHeader = billHeader;
  }


  public String getBillContent() {
    return billContent;
  }

  public void setBillContent(String billContent) {
    this.billContent = billContent;
  }


  public String getBillReceiverPhone() {
    return billReceiverPhone;
  }

  public void setBillReceiverPhone(String billReceiverPhone) {
    this.billReceiverPhone = billReceiverPhone;
  }


  public String getBillReceiverEmail() {
    return billReceiverEmail;
  }

  public void setBillReceiverEmail(String billReceiverEmail) {
    this.billReceiverEmail = billReceiverEmail;
  }


  public String getReceiverName() {
    return receiverName;
  }

  public void setReceiverName(String receiverName) {
    this.receiverName = receiverName;
  }


  public String getReceiverPhone() {
    return receiverPhone;
  }

  public void setReceiverPhone(String receiverPhone) {
    this.receiverPhone = receiverPhone;
  }


  public String getReceiverPostCode() {
    return receiverPostCode;
  }

  public void setReceiverPostCode(String receiverPostCode) {
    this.receiverPostCode = receiverPostCode;
  }


  public String getReceiverProvince() {
    return receiverProvince;
  }

  public void setReceiverProvince(String receiverProvince) {
    this.receiverProvince = receiverProvince;
  }


  public String getReceiverCity() {
    return receiverCity;
  }

  public void setReceiverCity(String receiverCity) {
    this.receiverCity = receiverCity;
  }


  public String getReceiverRegion() {
    return receiverRegion;
  }

  public void setReceiverRegion(String receiverRegion) {
    this.receiverRegion = receiverRegion;
  }


  public String getReceiverDetailAddress() {
    return receiverDetailAddress;
  }

  public void setReceiverDetailAddress(String receiverDetailAddress) {
    this.receiverDetailAddress = receiverDetailAddress;
  }


  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }


  public long getConfirmStatus() {
    return confirmStatus;
  }

  public void setConfirmStatus(long confirmStatus) {
    this.confirmStatus = confirmStatus;
  }


  public long getDeleteStatus() {
    return deleteStatus;
  }

  public void setDeleteStatus(long deleteStatus) {
    this.deleteStatus = deleteStatus;
  }


  public long getUseIntegration() {
    return useIntegration;
  }

  public void setUseIntegration(long useIntegration) {
    this.useIntegration = useIntegration;
  }


  public java.sql.Timestamp getPaymentTime() {
    return paymentTime;
  }

  public void setPaymentTime(java.sql.Timestamp paymentTime) {
    this.paymentTime = paymentTime;
  }


  public java.sql.Timestamp getDeliveryTime() {
    return deliveryTime;
  }

  public void setDeliveryTime(java.sql.Timestamp deliveryTime) {
    this.deliveryTime = deliveryTime;
  }


  public java.sql.Timestamp getReceiveTime() {
    return receiveTime;
  }

  public void setReceiveTime(java.sql.Timestamp receiveTime) {
    this.receiveTime = receiveTime;
  }


  public java.sql.Timestamp getCommentTime() {
    return commentTime;
  }

  public void setCommentTime(java.sql.Timestamp commentTime) {
    this.commentTime = commentTime;
  }


  public java.sql.Timestamp getModifyTime() {
    return modifyTime;
  }

  public void setModifyTime(java.sql.Timestamp modifyTime) {
    this.modifyTime = modifyTime;
  }

}
