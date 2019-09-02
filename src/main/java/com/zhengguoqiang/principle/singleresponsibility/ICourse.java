package com.zhengguoqiang.principle.singleresponsibility;

/**
 * @author zhengguoqiang
 */
public interface ICourse {
    //course content
    String getCourseName();
    byte[] getCourseVideo();

    //course manager
    void studyCourse();
    boolean refundCourse();
}
