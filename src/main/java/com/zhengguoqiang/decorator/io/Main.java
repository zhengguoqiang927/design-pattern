package com.zhengguoqiang.decorator.io;

import java.io.*;

/**
 * @author zhengguoqiang
 */
public class Main {
    public static void main(String[] args) {
        int c;
        String filePath = "/Users/zhengguoqiang/Projects/IdeaProjects/zhengguoqiang/design-pattern/src/main/java/com/zhengguoqiang/decorator/io/test.txt";

        try {
            //被装饰着FileInputStream先被BufferedInputStream装饰，
            //在被LowerCaseInputStream装饰
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(new FileInputStream(filePath)));
//            while ((c = in.read()) >= 0){
//                System.out.print((char) c);
//            }

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int read = 0;
            while ((read = in.read(buffer, 0, buffer.length)) != -1) {
                baos.write(buffer, 0, read);
            }
            baos.flush();
            System.out.println(new String(baos.toByteArray(), "UTF-8"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
