package com.imooc.model;

public class Subject {
  // 成员属性：学科名称、学科编号、学制年限

  private String subjectName;
  private String subjectNo;
  private int subjectLife;

  // 无参构造
  public Subject() {}

  // 带参构造，实现对属性的全部赋值
  public Subject(String subjectName, String subjectNo, int subjectLife) {
    // this.subjectName = subjectName;
    this.setSubjectName(subjectName);
    this.setSubjectNo(subjectNo);
    this.setSubjectLife(subjectLife);
  }

  public String getSubjectName() {
    return subjectName;
  }

  public void setSubjectName(String subjectName) {
    this.subjectName = subjectName;
  }

  public String getSubjectNo() {
    return subjectNo;
  }

  public void setSubjectNo(String subjectNo) {
    this.subjectNo = subjectNo;
  }

  public int getSubjectLife() {
    return subjectLife;
  }

  public void setSubjectLife(int subjectLife) {
    if (subjectLife < 0) return;
    this.subjectLife = subjectLife;
  }

  public String info() {
    String str =
        "专业信息如下：\n专业名称："
            + this.getSubjectName()
            + "\n专业编号："
            + this.getSubjectNo()
            + "\n学制年限："
            + this.getSubjectLife()
            + "年";
    return str;
  }
}
