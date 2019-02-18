package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Cat extends Pet {
    /**
     * @param name name of this Cat
     * @param age age of this Cat
     */
    public Cat(String name, Integer age) {

        //System.out.println( "Name of the cat" + name);
        //System.out.println( "Age of the cat" + age);
//return getName();
//return getAge();

    }

    /**
     * @param age age of this Cat
     */
    public Cat(Integer age) {

        System.out.println( "Age of the cat" + age);

    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name) {

        System.out.println( "Name of the cat" + name);


    }

    /**
     * nullary constructor
     * by default, a Cat's
     * name is CatName
     * age is 0
     */
    public Cat() {
        String name ="";
        int age =0;

    }

    /**
     * @return meow as a string
     */
    public String speak() {

        return "Meow";
    }
}
