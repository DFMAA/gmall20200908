package com.sample;


public class PmsCommentReplay {

  private long id;
  private long commentId;
  private String memberNickName;
  private String memberIcon;
  private String content;
  private java.sql.Timestamp createTime;
  private long type;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getCommentId() {
    return commentId;
  }

  public void setCommentId(long commentId) {
    this.commentId = commentId;
  }


  public String getMemberNickName() {
    return memberNickName;
  }

  public void setMemberNickName(String memberNickName) {
    this.memberNickName = memberNickName;
  }


  public String getMemberIcon() {
    return memberIcon;
  }

  public void setMemberIcon(String memberIcon) {
    this.memberIcon = memberIcon;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public long getType() {
    return type;
  }

  public void setType(long type) {
    this.type = type;
  }

}
