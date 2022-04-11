package com.imooc.model;

public class Subject {
  // 成员属性：学科名称、学科编号、学制年限

  private String subjectName;
  private String subjectNo;
  private int subjectLife;
  private Student[] myStudent;
  private int studentNum;

  // 无参构造
  public Subject() {}

  // 带参构造，实现对属性学科、编号、学制的赋值
  public Subject(String subjectName, String subjectNo, int subjectLife) {
    // this.subjectName = subjectName;
    this.setSubjectName(subjectName);
    this.setSubjectNo(subjectNo);
    this.setSubjectLife(subjectLife);
  }
  // 带参构造，实现对属性学科、编号、学制、学生对象的赋值
  public Subject(String subjectName, String subjectNo, int subjectLife, Student[] myStudent) {
    this.setSubjectName(subjectName);
    this.setSubjectNo(subjectNo);
    this.setSubjectLife(subjectLife);
    this.setMyStudent(myStudent);
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
    if (subjectLife < 0) {
      return;
    }
    this.subjectLife = subjectLife;
  }
  /* *
   * @formatter:off
   * @Author liuyue
   * @Description 获取选修专业的学生信息， 如果保存学生信息的数组未被初始化，则先初始化长度200
   * @Date 23:42 2022/4/10
   * @Param []
   * @return com.imooc.model.Student[]
   * @formatter:on
   **/
  public Student[] getMyStudent() {
    if (this.myStudent == null) {
      this.myStudent = new Student[200];
    }
    return myStudent;
  }

  public void setMyStudent(Student[] myStudent) {
    this.myStudent = myStudent;
  }

  public int getStudentNum() {
    return studentNum;
  }

  public void setStudentNum(int studentNum) {
    this.studentNum = studentNum;
  }

  /* *
   * @formatter:off
   * @Author liuyue
   * @Description 专业介绍的方法
   * @Date 23:57 2022/4/10
   * @Param []
   * @return 专业介绍的相关信息，包含名称、编号、年限
   * @formatter:on
   **/
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

  // public void addStudent(Student stu) {
  //   // 1、将学生保存到数组中
  //   for (int i = 0; i < this.getMyStudent().length; i++) {
  //     if (this.getMyStudent()[i] == null) {
  //       this.getMyStudent()[i] = stu;
  //       // 2、将学生个数保存到studentNum
  //       this.studentNum = i + 1;
  //       break;
  //     }
  //   }
  // }

  public void addStudent(Student stu) {
    // 1、将学生保存到数组中
    for (int i = 0; i < this.getMyStudent().length; i++) {
      if (this.getMyStudent()[i] == null) {
        stu.setStudentSubject(this);
        this.getMyStudent()[i] = stu;
        // 2、将学生个数保存到studentNum
        this.studentNum = i + 1;
        break;
      }
    }
  }
}
