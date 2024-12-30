package BasicTopics;

import java.util.Scanner;
public class ContinueStatements {

    public static void main(String[] args) {

//        //Continue statement skips the current iteration of a loop
//
//        for (int i= 1; i <= 10 ; i++){
//
//            if ((i>4) && (i < 9)){
//                continue;
//            }
//
//            System.out.println(i);
//        } //here when the number is on 5 and the if condition is true due to continue keyword
//          // it directly skips the loop and starts a new iteration

        int i =1 , j = 1;

        while (i <= 3){

            System.out.println("Inner Loop: "+ i);

            //when the loop enters this nested loop this whole loop is carried out until the condition is false
            while (j <= 3){ // this is a nested loop
                if (j == 2 ){
                    j++;
                    continue;
                }
                System.out.println("Outer loop "+ j); //after the nested loop condition is false it prints this
                j++; // and then increments
            }
            i++; // then i gets incremented and again the outer loop goes on and then again the nested loop value is checked
        }
    }
}
