package com.jasond.secondquestion;


public class Cat extends Animal {

    public Cat() {
        super("Cat");

        @Override
        public String speak (){
            return "meow";

        }
        @Override
        public String move () {
            return "cat running";

        }

    }

}
