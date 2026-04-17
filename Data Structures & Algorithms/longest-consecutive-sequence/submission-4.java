class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        // if(nums.length == 0) return 0;
        for(int num: nums){
            numSet.add(num);
        }
        int count=0;
        for(int num: numSet){
            if(!numSet.contains(num - 1)) {
                int length = 1;
                while (numSet.contains(num + length)) {
                    length++;
                }
                count = Math.max(count, length);
            }
        }
        return count;
    }
}
