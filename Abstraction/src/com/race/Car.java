package com.race;

public abstract class Car {

	abstract void speed() ;

}

// Abstraction : hiding the implementation details and showing only the necessary data 

// Abstraction is a concept of not providing the body or implementation to the method
// forcing the child class to provide body to the method
// abstract method means method which do not have body ex : absract void xyz();
// normal class do not allow a single abstract method
// class should must be declared as an absract class if we want to declare a single abstract method
// can we declare abstract method in normal class ? --> NO {class should must be abstract}  
// can we declare normal method in abstract class ? --> YES 
// {we can define n numbers of abstract as well as normal method in abstrat class}
// abstract class has constructor ? 
// we cannot create an object of abstract class