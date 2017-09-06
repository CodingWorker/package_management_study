package com.example2;

import com.example.HelloWorld;

/**
 * Created by DaiYan on 2017/7/26.
 */

/**
 * com.example.HelloWorld已经被install发布到了maven本地仓库中
 * 所以可以直接引用
 */
public class Main {
    public static void main(String[] args){
        System.out.println(HelloWorld.class.getName());
    }
}
