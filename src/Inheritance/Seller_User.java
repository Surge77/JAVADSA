package Inheritance;

//child class
public class Seller_User extends User{

    public Seller_User(String username,String email){
        super(username,email); //This super keyword call the parent constructor and pass your attributes
    }

    public void add_products(){
        System.out.println("Seller is adding a new product");
    }

    @Override
    public void showDashboard(){
        System.out.println("Seller user's specialized dashboard");
    }

    public static void main(String[] args) {

        Seller_User au = new Seller_User("visenya","visenya@yahoo.com");

        au.login();
        au.add_products();
        au.showDashboard();

    }
}
