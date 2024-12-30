package RecursionProblems;

public class FibonacciSequence {

    public static void main(String[] args) {

        System.out.println(FiboNum(6));

    }

    public static int FiboNum(int i) {

        //Base case
        if (i == 0 || i == 1){
            return i;
        }else{
            return FiboNum(i - 1) + FiboNum(i - 2);
            //Here the answer is depended upon two sub-problems that is i-1 and i-2
        }

    }
}
