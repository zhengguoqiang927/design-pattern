package com.zhengguoqiang.pattern.creational.factorymethod;

/**
 * @author zhengguoqiang
 */
public abstract class VideoFactory {
//    Video getVideo(String type){
//        if ("java".equals(type)){
//            return new JavaVideo();
//        }else if ("python".equals(type)){
//            return new PythonVideo();
//        }
//        return null;
//    }
//
//    Video getVideo(Class c){
//        Video video = null;
//        try {
//            video = (Video) Class.forName(c.getName()).newInstance();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return video;
//    }
    abstract Video getVideo();
}
