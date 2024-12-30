package Problems;

import java.util.Scanner;
public class ReverseNumberWhileloop {

    public static void main(String[] args) {

        //To reverse a given number using while loop and some basic math

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to reverse: ");
        int n = input.nextInt();
        int ans = 0;

        while (n>0){

            int rem = n % 10;
            ans = ans * 10 + rem;
            n = n/10; //here we divide by 10 to remove the remainder value

        }
        System.out.println(ans);

    }
}
