class Solution {

    public String longestCommonPrefix(String[] strs) {

        // 1. Take the first(index=0) string in the array as prefix.
        String prefix = strs[0];

        // 2. Iterate from second(index=1) string till the end.
        for (int index = 1; index < strs.length; index++) {
            // 3.Use the indexOf() function to check if the prefix is there in the strs[i]
            // or not.
            while (strs[index].indexOf(prefix) != 0) {
                // 4.Use the substring function to chop the last letter from prefix each time
                // the function return -1.
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
