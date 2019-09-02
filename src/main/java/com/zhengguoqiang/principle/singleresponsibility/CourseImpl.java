package com.zhengguoqiang.principle.singleresponsibility;

/**
 * @author zhengguoqiang
 */
public class CourseImpl implements ICourseContent,ICourseManager {
    public String getCourseName() {
        return null;
    }

    public byte[] getCourseVideo() {
        return new byte[0];
    }

    public void studyCourse() {

    }

    public boolean refundCourse() {
        return false;
    }
}
