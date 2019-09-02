package com.zhengguoqiang.principle.dependencyinversion;

/**
 * @author zhengguoqiang
 */
public class Test {

    public static void main(String[] args) {
        Geely geely = new Geely();
        //v1
//        geely.studyJavaCourse();
//        geely.studyFECourse();
//        geely.studyPythonCourse();

        geely.setiCourse(new JavaCourse());
        geely.studyCourse();

        geely.setiCourse(new FECourse());
        geely.studyCourse();

        geely.setiCourse(new PythonCourse());
        geely.studyCourse();
    }
}
