package Inheritance;


// child class
public class Admin_User extends User{ //extends is used to indicate that a class is inheriting from a superclass or parent class

    public Admin_User(String username,String email){
        super(username,email); //This super keyword call the parent constructor and pass your attributes
    }

    public void manage_products(){
        System.out.println("Admin is  managing products");
    }


    //The @Override annotation is used to indicate that a method is intended to override a method declared in a superclass
    @Override
    public void showDashboard(){
        super.showDashboard(); //this will call the parent class showDashboard functions
        System.out.println("Admin user's specialized dashboard");
    }

    public void display_username(){
        System.out.println(username);
    }


    public static void main(String[] args) {

        Admin_User au = new Admin_User("Jon snow","snow@gmail.com");
        au.login();
        au.showDashboard();
        au.display_username();
    }






}
