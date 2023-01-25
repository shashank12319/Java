package com.functionalinterface;

//using java 8
@FunctionalInterface  
interface sayable{  
    void say(String msg);  


default void m1() {
	System.out.println("this is m1 method");
}
}
public class FunctionalInterfaceExample implements sayable{  
    public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
        FunctionalInterfaceExample fie = new FunctionalInterfaceExample();  
        fie.say("Hello there");  
    }  
}  