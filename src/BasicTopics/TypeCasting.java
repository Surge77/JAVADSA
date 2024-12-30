package BasicTopics;

public class TypeCasting {

    public static void main(String[] args) {

        //Typecasting is a method or process that converts a data type into another data type in both ways
        // i.e manually => done by programmer or automatically => done by compiler
        //There are two types of typecasting :
        //                 ========>> narrowing
        // double > float > long > int > short > byte
        //                <<======== Widening
        // 1. Implicit typecasting/ automatic typecasting / widening typecasting / casting down => alternative names
        // The implicit typecasting convert a smaller data type to a bigger data type which can also be called as widening which is basically happens automatically

        // 2. Explicit Typecasting / narrowing typecasting / casting up / manually ==> alternative names
        //In explicit we move from a bigger data type to a smaller data type which is also called narrowing which has to be done manually

        // Case 1
        byte by = 10;
        short sh = 10;
        int in = 10;
        long lo = 10;

        //smaller can go to bigger but bigger cannot go the smaller type automatically
        //theres also a way for smaller to go to bigger but it is to be done manually

//        by = sh;
//        int = sh; these three are not valid
//        lo = sh;

//        in = by;
//        lo = by;
//        lo = in; //now these three are valid

        //Different cases of concatenations and conversion
        System.out.println(10 + 20 + "Hello" + 10 + 20); //30Hello1020
        System.out.println(2 + ' ' + 5); //39 the a blank space has unique code value of 32 ' ' ==> means a character
        System.out.println(2 + " " + 5); // "" ==> means a string 2 5
        System.out.println("Hello" + '\t' + "World"); //Here \t in single quote represents tab space(usually four or eight spaces)  => Hello World
        System.out.println("Hello" + "\t" + "World"); //Hello World => same as before
        System.out.println(2 + '\t' + 3); //here the unique code value is 9 of '\t' => 14
    }
}
