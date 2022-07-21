package com.codedifferently.drillz;

public class Problem01 {

    /**
     * Given two non-negative int values,
     * return true if they have the same last digit,
     * such as with 27 and 57.
     * Note that the % "mod" operator computes remainders,
     * so 17 % 10 is 7.
     * lastDigit(7, 17) → true
     * lastDigit(6, 17) → false
     * lastDigit(3, 113) → true
     * @param a
     * @param b
     * @return
     */
    public boolean lastDigit(int a, int b) {
        String stringA = Integer.toString(a);
        String stringB = Integer.toString(b);

        if (stringA.charAt(stringA.length() - 1) == stringB.charAt(stringB.length() - 1))
        return true;
        else
            return false;
    }
}
