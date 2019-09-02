package com.zhengguoqiang.principle.openclose;

/**
 * @author zhengguoqiang
 */
public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(1,"Java从入门到放弃",299d);
        JavaDiscountCourse discountCourse = (JavaDiscountCourse) iCourse;
        System.out.println("课程编号：" + discountCourse.getId());
        System.out.println("课程名称：" + discountCourse.getName());
        System.out.println("课程价格：" + discountCourse.getOriginalPrice());
        System.out.println("课程折后价格：" + discountCourse.getPrice());
    }
}
