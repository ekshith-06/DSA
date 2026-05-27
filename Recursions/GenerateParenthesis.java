import java.util.*;

class Solution {
    public static void generateValidParenthesis(int closing, int opening, List<String> ans, int noOfPlaces,
            String currString) {
        if (closing > opening)
            return;
        if (closing == opening && closing + opening == noOfPlaces) {
            ans.add(currString);
            return;
        }
        if (opening > noOfPlaces / 2)
            return;
        if (closing < opening) {
            generateValidParenthesis(closing + 1, opening, ans, noOfPlaces, currString + ')');
        }
        generateValidParenthesis(closing, opening + 1, ans, noOfPlaces, currString + '(');
    }

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        String currString = "";
        generateValidParenthesis(0, 0, ans, 2 * n, currString);
        return ans;
        // your code goes here
    }
}

public class GenerateParenthesis {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 3; // Example input
        List<String> result = sol.generateParenthesis(n);

        System.out.println("All combinations of balanced parentheses for n = " + n + " are:");
        for (String combination : result) {
            System.out.println(combination);
        }

    }
}
