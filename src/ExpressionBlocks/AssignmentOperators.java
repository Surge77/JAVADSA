package ExpressionBlocks;

public class AssignmentOperators {

    public static void main(String[] args) {

        //Assignment Operators are used to assign values to the variables

        int age;
        age = 5;
        //Here = is the assignment operator
        //Whatever is on the right hand side gets assigned to the left hand side

        int a = 20;
        int val = age;

        System.out.println(val);

        //short  way of assigning
        val += a; // val = val + a => 20 + 5 whatever is on right side gets added to left side

        System.out.println(val);

        val -= a; // val = val - a

        System.out.println(val);

        //similarly other operations

        val *= a; // val = val * a

        val /= a; // val = val / a

        val %= a; // val = val % a

    }
}

