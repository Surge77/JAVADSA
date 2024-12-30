package Abstraction;

public class OnlineStore {

    public static void main(String[] args) {

        //The product class is the abstract class but for abstract class we are picking up the implementation of electronics because the product is electronics
        Product Electronics = new Electronics("Smartphone",5000);
        Product Clothing = new Electronics("Smartphone",5450);

        System.out.println(Electronics.calculateTax());
        System.out.println(Electronics.calculateDiscount());
        System.out.println(Electronics.calculateShippingCost());
    }
}
