package com.imooc.model;

import java.util.Objects;

public class Student {
  // 成员属性：学号，姓名、性别、年龄
  private String studentNo;
  private String studentName;
  private String studentSex;
  private int studentAge;
  private Subject studentSubject;

  // 无参构造
  public Student() {}

  // 多餐构造，实现对全部属性的赋值
  public Student(String studentNo, String studentName, String studentSex, int studentAge) {
    this.setStudentNo(studentNo);
    this.setStudentName(studentName);
    this.setStudentAge(studentAge);
    this.setStudentSex(studentSex);
  }

  public Student(
      String studentNo,
      String studentName,
      String studentSex,
      int studentAge,
      Subject studentSubject) {
    this.setStudentNo(studentNo);
    this.setStudentName(studentName);
    this.setStudentAge(studentAge);
    this.setStudentSex(studentSex);
    this.setStudentSubject(studentSubject);
  }

  public String getStudentNo() {
    return studentNo;
  }

  public void setStudentNo(String studentNo) {
    this.studentNo = studentNo;
  }

  public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

  public String getStudentSex() {
    return studentSex;
  }

  public void setStudentSex(String studentSex) {
    // 限制性别只能是“男”或者“女”，反之强制赋值为“男”

    if (Objects.equals(studentSex, "男") || Objects.equals(studentSex, "女")) {
      this.studentSex = studentSex;
    } else {
      this.studentSex = "男";
    }
  }

  public int getStudentAge() {
    return studentAge;
  }

  /**
   * @Author liuyue @Description 给年龄赋值，限定必须在10-100之间，反之赋值为18 @Date 13:57 2022/4/10 @Param
   * [studentAge] 传入的年龄
   *
   * @return void
   */
  public void setStudentAge(int studentAge) {
    if (studentAge < 10 || studentAge > 100) {
      this.studentAge = 18;
    } else {
      this.studentAge = studentAge;
    }
  }

  /**
   * @Author liuyue @Description 获取专业对象，如果没有实例化，先实例化再返回 @Date 22:43 2022/4/10 @Param []
   *
   * @return 专业对象的信息
   */
  public Subject getStudentSubject() {
    if (this.studentSubject == null) {
      this.studentSubject = new Subject();
    }
    return studentSubject;
  }

  public void setStudentSubject(Subject studentSubject) {
    this.studentSubject = studentSubject;
  }

  /**
   * @Author liuyue @Description 学生自我介绍的方法 @Date 13:50 2022/4/10
   *
   * @return 自我介绍的信息，包含姓名、学号、性别、年龄
   */
  public String introduction() {
    String str =
        "学生信息如下：\n姓名："
            + this.getStudentName()
            + "\n学号："
            + this.getStudentNo()
            + "\n性别："
            + this.getStudentSex()
            + "\n年龄："
            + this.getStudentAge();
    return str;
  }

  // 方法1 传递所学专业名称和学制年限
  public String introduction(String subjectName, int SubjectLife) {
    String str =
        "学生信息如下：\n姓名："
            + this.getStudentName()
            + "\n学号："
            + this.getStudentNo()
            + "\n性别："
            + this.getStudentSex()
            + "\n年龄："
            + this.getStudentAge()
            + "\n所报专业名称："
            + subjectName
            + "\n学制年限："
            + SubjectLife;
    return str;
  }

  // 方法2 传递专业对象
  public String introduction(Subject mySubject) {
    String str =
        "学生信息如下：\n姓名："
            + this.getStudentName()
            + "\n学号："
            + this.getStudentNo()
            + "\n性别："
            + this.getStudentSex()
            + "\n年龄："
            + this.getStudentAge()
            + "\n所报专业名称："
            + mySubject.getSubjectName()
            + "\n学制年限："
            + mySubject.getSubjectLife();
    return str;
  }

  // 方法3 新增成员属性与本类方法获取专业信息
  public String introduction_two() {
    String str =
        "学生信息如下：\n姓名："
            + this.getStudentName()
            + "\n学号："
            + this.getStudentNo()
            + "\n性别："
            + this.getStudentSex()
            + "\n年龄："
            + this.getStudentAge()
            + "\n所报专业名称："
            + this.getStudentSubject().getSubjectName()
            + "\n学制年限："
            + this.getStudentSubject().getSubjectLife();
    return str;
  }
}
