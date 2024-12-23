class Solution {
    public int smallestNumber(int n) {
        int x = n;
        if (((x + 1) & x) == 0) {
            return x;
        } else {
            x++;
        }

        return smallestNumber(x);

    }

}

// Easy question with basic concept of recursion.
// Have to know to condition for set bit or think about it.
// Simple flow of code --> check if set bit if yes return else call the function
// with next number

//Link to the question : https://leetcode.com/problems/smallest-number-with-all-set-bits/