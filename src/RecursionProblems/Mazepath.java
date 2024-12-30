package RecursionProblems;

/*
 Given 2 numbers m,n representing dimensions of a mXn board.You are standing at the top
 left of the board and want to reach the bottom right.In how many ways you can reach the bottom right from
 top left if from every cell you can go either to rightward or downward cell.Count and print all the possible paths
 For eg: RRDD => Means right right down down
 */
public class Mazepath {

    public static void main(String[] args) {

        int m = 3, n = 3;

        Maze(0,0,m,n,"");
        
    }

    private static void Maze(int i, int j, int m, int n, String output) {

        //base case
        if (i == m-1 && j  == n - 1){
            System.out.println(output);
            return ;
        }
        if (i >= m || j >= n) return ;
        Maze(i+1,j,m,n,output+"R"); //Recursive calls
        Maze(i,j+1,m,n,output+"D");


    }
}
