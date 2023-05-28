package Abstraction2;
/*
 * An abstract class has a construtor which prints "This is constructor of abstract class",
 *  an abstract method named 'abstractmethod' and a non-abstract method which prints "This is a normal
 *  method of abstract class". A class 'SubClass' inherits the abstract class and has a method named 
 * 'abstractmethod' which prints "This is abstract method". Now create an object of 'SubClass' and call the
 *  abstract method and the non-abstract method. (Analyse the result)
 */

public abstract class abstractClass {

    abstractClass(){
        System.out.println("This is constructor of abstract class");
    }

    abstract void abstractmethod();

    void nonAbstractMethod(){
        System.out.println("This is a normal method of abstract class");
    }
    

} 
