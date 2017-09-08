package com.test.mvn.example1;

import com.test.mvn.example0.Hello;

/**
 * Created by DaiYan on 2017/9/8.
 */
public class Person {
    private String name;
    private int age;
    private Hello hello;

    public Person(){
        this.hello=new Hello();
    }

    public void sayHello(){
        String msg="——name: "+this.name+", age: "+this.age;
        this.hello.sayHello("say hello@"+msg);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Hello getHello() {
        return hello;
    }

    public void setHello(Hello hello) {
        this.hello = hello;
    }
}
