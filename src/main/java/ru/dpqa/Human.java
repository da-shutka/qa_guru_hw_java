package ru.dpqa;

import java.util.List;

public class Human {

    private static final String staticName = "My human";
    private final String name;
    private final int age;
    private final boolean isCute;

    public String getName() {
        return name;
    }

    /*public void setName(String name) {
        this.name = name;
    }*/

    public Human(String name, int age, boolean isCute) {
        this.name = name;
        this.age = age;
        this.isCute = isCute;
    }

    public int getAge() {
        return age;
    }

    /*public void setAge(int age) {
        this.age = age;
    }*/

    public boolean isCute() {
        return isCute;
    }

    /*public void setCute(boolean cute) {
        isCute = cute;
    }*/

    public Human incrementAge() {
        return new Human(
                this.name,
                (this.age + 1),
                this.isCute
        );
    }

    static void sayHello() {
        System.out.println("Hello!!!!" + staticName);
    }

    void sayHelloNonStatic() {
        System.out.println("Hello!!!!" + this.name);
    }

    void printSomeValues (int i, String str, List<String> list) {
        i = 100;
        list.add("selenide");
        System.out.println("int: " + i + ", string: " + str.toUpperCase() + ", list: " + list);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isCute=" + isCute +
                '}';
    }
}
