package com.kyle.springmvc.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kyxiong on 4/29/2017.
 */
@RestController
public class BaseController {

    @RequestMapping("say/hello")
    public Message say() {
        return new Message("Kyle", 50);
    }

    private static class Message {
        private String name;
        private int age;

        public Message(String name, int age) {
            this.name = name;
            this.age = age;
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
    }

}
