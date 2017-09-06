package com.example;

import org.junit.Test;

/**
 * Created by DaiYan on 2017/7/26.
 */

/**
 * 本项目是为了测试：maven下载保存依赖的路径自定义
 * 需要修改user.name/.m2/settings.xml中的配置项localRepository
 */
public class HelloWorld {
    @Test
    public void sayHello(){
        System.out.println("hello maven!");
    }
}
