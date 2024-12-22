package contest_rewind.weekly_contests.contest_429;

import java.util.Arrays;

public class Solution {
    public static int minimumOperations(int[] nums) {
        int[] myArray = nums;
        int length = myArray.length;
        int count = 0;
        while (length > 3) {
            boolean isRepeating = isDuplicate(myArray);
            if (isRepeating) {
                myArray = Arrays.copyOfRange(myArray, 3, length);
                count++;
            } else { 
            //I was not writing this else statement instead I was returning count 
            //(Because of this silly mistake I was not able to submit the code)
                return count;
            }

            length = myArray.length;
        }
        if (length <= 3 && isDuplicate(myArray)) {
            return count + 1;
        }
        return count;
    }

    public static boolean isDuplicate(int[] myArray) {
        int n = myArray.length;
        boolean repeating = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (myArray[i] == myArray[j]) {
                    repeating = true;
                    return repeating;
                }
            }
        }
        return repeating;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,3,3,5,7};
        int result = minimumOperations(arr);
        System.out.println(result);
    }

}


//I tried the brute force approach, although
//I was missing an edge case which I was not able to figure out during the contest (I was so close)