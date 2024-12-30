package OOPs;

//Here we will see how to pass the object as an argument using this keyword

public class ThisExample {

    int x;
    int y;

    ThisExample(int x, int y){

        this.x = x;
        this.y = y;

        System.out.println(this.x + " " + this.y);

        add(this); //this is nothing but passing any object we create in main function

        System.out.println(this.x + " " + this.y);


    }

    void add(ThisExample o){
        this.x += 2;
        this.y += 2;
    }

    public static void main(String[] args) {

        ThisExample obj = new ThisExample(1,4);

    }
}
