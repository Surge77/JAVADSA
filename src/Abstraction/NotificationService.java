package Abstraction;

// => Interfaces : An interface is a fully abstract class.It includes a group of abstract methods without a body.
// To use interface we need to use interface keyword
//Similar to abstract classes we cannot create objects of interfaces
//Interfaces can be used to achieve multiple inheritances in java
/**
 * Interfaces define a contract or a blueprint for classes to follow.
 * They contain abstract methods that must be implemented by any class that implements the interface.
 * Interfaces support multiple inheritance by allowing a class to implement multiple interfaces.
 */

//Suppose there are two developers ram and shyam working on email notification and sms notification both are working separately
//one has implemented three methods and the other four
//Ideally both should have same functions and more could be added upon them
//This is where interfaces comes handy
//Now with interface both will implement a same interface for both notifications
//This is helpful when multiple unrelated classes need to share common set of methods

interface NotificationService {

    void sendNotifications(String message);

    void subscribeToTopic(String topic);



}
