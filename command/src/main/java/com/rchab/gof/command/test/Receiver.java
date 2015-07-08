package com.rchab.gof.command.test;

public class Receiver {
    private String name;
    private Integer age;

    public Receiver(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String  toString() {
        return "Target{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
