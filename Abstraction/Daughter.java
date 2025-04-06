package Abstraction;

public class Daughter extends Parent {
    @Override
    void career(String name) {
        // TODO Auto-generated method stub
        
        System.out.println("I will become"+name);
    }
    @Override
    void partner(String name, int age){
        System.out.println("I love"+name+". Her age is "+age);
    }
}
