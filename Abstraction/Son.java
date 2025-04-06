package Abstraction;

public class Son extends Parent {
    
    @Override
    void career(String name) {
        // TODO Auto-generated method stub
        System.out.println("I will become"+name);
    }
    void partner(String name, int age){
        System.out.println("I love"+name+". Her age is "+age);
    }
}
