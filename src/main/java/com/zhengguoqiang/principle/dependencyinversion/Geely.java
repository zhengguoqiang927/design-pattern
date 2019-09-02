package com.zhengguoqiang.principle.dependencyinversion;

/**
 * @author zhengguoqiang
 */
public class Geely {
//    public void studyJavaCourse(){
//        System.out.println("Geely在学习Java课程");
//    }
//
//    public void studyFECourse(){
//        System.out.println("Geely在学习FE课程");
//    }
//
//    public void studyPythonCourse(){
//        System.out.println("Geely在学习Python课程");
//    }

    private ICourse iCourse;

    //构造器注入
//    public Geely(ICourse iCourse) {
//        this.iCourse = iCourse;
//    }
    //set方法注入


    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyCourse(){
        iCourse.studyCourse();
    }
}
