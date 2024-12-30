package Inheritance;

//We will learn about inheritance
//We are going to learn this by using a real life application of ecommerce website
//In an ecommerce website there are three types of users => admin , sellers and regular users
//There will be a base class or super class which will have some basic functionalities which all these users will have
//On top of that each type of users will get their own special functions according to their requirements

//Inheritance advantages => code reusability, method overriding or runtime polymorphism

//Types of inheritances => Single , Multi-level , Hierarchical , Multiple (Java doesn't support this can be done through interfaces) , Hybrid (Combination of two or more inheritances).



//THis is a super class which can also be called as base class or parent class
public class User {

    //If we make a variable or method protected it can be accessed within and with its child classes or subclasses
    //The child classes will also be able to modify it
    protected String username;

    private String email;

    public User(String username,String  email){
        this.email = email;
        this.username = username;
    }

    public void login(){
        System.out.println(username + " have logged in");
    }

    public void showDashboard(){
        System.out.println(username + "'s dashboard");
    }




}
