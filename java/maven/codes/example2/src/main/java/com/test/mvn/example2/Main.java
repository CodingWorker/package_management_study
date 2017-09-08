package com.test.mvn.example2;

import com.test.mvn.example1.Person;

/**
 * Created by DaiYan on 2017/9/8.
 */
public class Main {
    public static void main(String[] args){
        Person person=new Person();
        person.setName("Daniel");
        person.setAge(12);
        person.sayHello();
    }
}
