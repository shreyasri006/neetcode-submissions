class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> uniqueValues = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (uniqueValues.contains(nums[i])) {
                return true;
            } else {
                uniqueValues.add(nums[i]);
            }
        }

        return false;
    }
}