class Solution {
    public boolean isPalindrome(int x) {
        int n = x;
        if (x == 0) // 0 is a palindrome number
            return true;
        if (x < 0 || x % 10 == 0)
            return false;

        int reverseInt = 0;
        int pop = 0;

        // logic to reverse number
        while (n > 0) {
            pop = n % 10;
            reverseInt = reverseInt * 10 + pop;
            n /= 10;
        }

        if (x == reverseInt || x / 10 == 0)
            return true;

        else {
            return false;
        }

    }
}
