package com.tom;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello world");
        Person p = new Person();
        p.hello();
        p.weight = 66.5f;
        p.height = 1.7f;

        System.out.println(p.bmi());



        /*int age = 19;
        Integer age2 = 19;
        char c = 'A';
        byte b = 120;
        float weight = 66.5f;
        float height = 1.7f;
        boolean adult = true;
        boolean enroll = false;
        String name = "Jonathan";*/

    }

}
