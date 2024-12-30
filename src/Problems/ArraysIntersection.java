package Problems;

import java.util.Arrays;
import java.util.ArrayList;
public class ArraysIntersection {

    public static void main(String[] args) {

        //To print the common elements from the two arrays given as input
        //both array are sorted
        //can differ in size
        //because the list is sorted so we only move forward while comparing

        int[] one = {10,19,20,30,40,40,50};
        int[] two = {15,16,17,20,25,30,30,40};

        System.out.println(intersection(one,two));


    }

    public static ArrayList<Integer> intersection(int[] one,int[] two){ // we passed the two arraylists

        ArrayList<Integer> ans = new ArrayList<>(); //created a new Arraylist named ans

        int i = 0; //element for tracking or comparing first list
        int j = 0;// for tracking second list

        while (i < one.length && j < two.length){  //keeps comparing till the lengths of their respective arraylists

            if (one[i] < two[j]){
                i++;
            } else if (one[i] > two[j]) { //if first list element is greater we increment the firs list inorder to find the match
                j++;
            }else { //when both elements match we move or increment both list elements
                ans.add(one[i] );
                i++;
                j++;
            }
        }
        return ans;
    }
}
