package OOPs;


//Here we will see about this keyword
//this function get rids of lots of duplication but we must use it carefully

public class Compelex {

    private int a,b;

    private Compelex(int i,int j){
        this.a = i;
        this.b = j;
    }

    private Compelex(int i){
        this(i,i); //This is called the first constructor
    }

    private Compelex(){
        this(0); //First constructor calling
    }

    //Special function to print the value of a and b which we have redefined
    //We have override the built-in function
    @Override
    public String toString() {
        return this.a +  "+" +  this.b;
    }

    public static void main(String[] args) {

        Compelex c1 = new Compelex(2,3);
        System.out.println(c1);
        //Whenever we print a object the object is always converted to string

        Compelex c2 = new Compelex(2);
        System.out.println(c2);

        Compelex c3 = new Compelex();
        System.out.println(c3);


    }
}
