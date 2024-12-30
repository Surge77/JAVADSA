package Searching.Problems;
import java.util.Scanner;

// Codeforces problem link -> https://codeforces.com/edu/course/2/lesson/6/2/practice/contest/283932/problem/C



public class VeryEasyTask {

    public static void main(String[] args) {

        int n , x , y;

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the total number of copies required: ");
        n = inp.nextInt();

        System.out.println("Enter speed of copier 1: ");
        x = inp.nextInt();

        System.out.println("Enter the speed copier 2: ");
        y = inp.nextInt();

        System.out.println("The minimum Time required is "+MinimumTime(n, x , y));

    }

    private static int MinimumTime(int n, int x, int y) {

        if (n == 1){
            return Math.min(x,y);
        }

        int left = 0;
        int right = Math.max(x,y) * n;

        int ans = 0;

        while (left <= right){

            //Here mid represents time
            int mid = (left + right) / 2;

            //goodEnough function checks if the mid time range is enough or not to make
            //n - 1 copies
            if (goodEnough(n,x,y,mid)){
                ans = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return ans + Math.min(x,y);
    }

    private static boolean goodEnough(int n, int x, int y, int mid) {

        //Objective :
        //If in mid-amount of time I am able to make n - 1 copies
        //then my mid-value is good, hence I should return true

        //check how many copies can be made in mid-amount of time
        //If no of copies >= n - 1 return true,
        //Otherwise,return false

        //c1 copier can make mid/x copies in mid time
        //c2 copier can make mid/y copies in mid time

        //We write n - 1 because initially we can't use both copiers we only choose any one copier
        //Ideally we choose one which takes less time

        return mid/x + mid/y >= n - 1; //If this condition is satisfied it returns true
    }
}
