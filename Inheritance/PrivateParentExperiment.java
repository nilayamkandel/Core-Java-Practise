package Inheritance;
/*
Create a class with a method that prints "This is parent class" and its subclass with another 
method that prints "This is child class". Now, create an object for each of the class and call
1 - method of parent class by object of parent class
2 - method of child class by object of child class
3 - method of parent class by object of child class

 * In the above example, declare the method of the parent class as private and then repeat the first two 
operations (You will get error in the third)
 */

public class PrivateParentExperiment {

    private void print(){
        System.out.println("this is parent class");
    }

   
}
