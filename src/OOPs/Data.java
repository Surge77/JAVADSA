package OOPs;

//Here we will see about access modifiers

//Access modifiers are used to set the accessibility(visibility) of classes,interfaces,variables,methods,constructors,data members etc
//Public => declaration are visible everywhere
//Private => visible withing the class only
//Protected => declaration are visible within the package or all subclasses

public class Data {

    //The reason we use private variable is to keep control on the accessibility on variables
    //We put restrictions on the accessibility on functions,variables etc
    private String name;

    //Getter and setter are build in methods
    //It is always recommended to use this in getter and setters

    //Getters
    public String getName(){
        return this.name;
    }

    //setters
    public void setName(String name){
        this.name = name;
    }




}
