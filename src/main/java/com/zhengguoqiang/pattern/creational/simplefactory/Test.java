package com.zhengguoqiang.pattern.creational.simplefactory;

/**
 * @author zhengguoqiang
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory factory = new VideoFactory();
//        Video video = factory.getVideo("java");
        Video video = factory.getVideo(PythonVideo.class);
        if(video == null){
            return;
        }
        video.produce();
    }
}
