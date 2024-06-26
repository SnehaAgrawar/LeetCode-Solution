public class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) { // check if val is in any index
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
