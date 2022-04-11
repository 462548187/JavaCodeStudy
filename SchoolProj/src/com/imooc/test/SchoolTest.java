package com.imooc.test;

import com.imooc.model.Student;
import com.imooc.model.Subject;

public class SchoolTest {
  public static void main(String[] args) {
    // 测试Subject
    Subject subject = new Subject("计算机科学与应用", "J0001", 4);
    System.out.println(subject.info());

    System.out.println("=================================");

    // 测试Student

    Student stu1 = new Student("S01", "张三", "男", 18);
    System.out.println(stu1.introduction());

    System.out.println("=================================");

    Student stu2 = new Student("S02", "李四", "na", 17);
    System.out.println(stu2.introduction("计算机科学与应用", 4));

    System.out.println("=================================");
    System.out.println(stu2.introduction(subject));

    System.out.println("=================================");
    Student stu3 = new Student("S03", "王五", "男", 18, subject);
    System.out.println(stu3.introduction_two());

    System.out.println("=================================");

    // 测试指定专业中到底有多少学生报名
    subject.addStudent(stu1);
    subject.addStudent(stu2);
    // subject.addStudent(stu3);
    System.out.println(subject.getSubjectName() + "专业中已有【" + subject.getStudentNum() + "】学生进行了报名");
  }
}
