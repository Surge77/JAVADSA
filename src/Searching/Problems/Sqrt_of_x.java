package Searching.Problems;

//Q -> Given a value x, tell if x is a square of an integer or not
//So far we were getting an array and upon that we applied binary search
//But in this question we just have given the value of x based on this we identified the search space of answer
//Search space is the range in which the answer lies

public class Sqrt_of_x {

    public static void main(String[] args) {

        int x = 25;

        System.out.println(SquareOrNot(x));

    }

    private static Boolean SquareOrNot(int x) {

        int l = 0;
        int r = x;

        while (l <= r){

            int mid = (l + r) / 2;

            if (mid * mid  == x){  //We check if mid-value is the ans
                return true;
            } else if (mid * mid < x) { //if the mid is smaller we move to right side

                l = mid + 1;

            }else {  // if mid is greater we move left side
                r = mid - 1;
            }
        }
        return false;
    }
}
