package OOPs;

//Constructor overloading => We can have two or more constructors with different parameters

public class Main2 {

    String lang;

    Main2(){
        lang = "java";
    }

    Main2(String language){
        this.lang = language; //'this.lang' refers to the instance variable or the variable for that particular object, 'lang' refers to the parameter
    }

    public void showName(){
        System.out.println("language is " + lang);
    }

    public static void main(String[] args) {

        Main2 obj1 = new Main2();

        System.out.println(obj1.lang);
        obj1.showName();

        Main2 obj2 = new Main2("python");
        obj2.showName();



    }
}
