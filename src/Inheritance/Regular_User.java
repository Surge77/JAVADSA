package Inheritance;

//child class
public class Regular_User extends User {

    public Regular_User(String username ,String email){
        super(username, email);
    }

    public void browse_products(){
        System.out.println("Customer is browsing products");
    }

    @Override
    public void showDashboard(){
        System.out.println("Normal user's specialized dashboard");
    }

    public static void main(String[] args) {

        Regular_User au = new Regular_User("Aegon","Aegon@yahoo.com");

        au.login();
        au.browse_products();

    }
}
