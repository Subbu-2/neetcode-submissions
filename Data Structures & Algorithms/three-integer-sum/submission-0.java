class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Map<Integer,Integer> freqMap = new HashMap<>();
        for(int num: nums){
            freqMap.put(num, freqMap.getOrDefault(num,0)+1);
        }
        System.out.println(freqMap);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0; i< nums.length; i++){
            freqMap.put(nums[i], freqMap.get(nums[i])-1);
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1; j<nums.length; j++){
                freqMap.put(nums[j], freqMap.get(nums[j])-1);
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                int target = -(nums[i]+nums[j]);
                if(freqMap.getOrDefault(target,0)>0){
                    res.add(Arrays.asList(nums[i], nums[j], target));
                }
            }
            for(int j=i+1; j< nums.length; j++){
                freqMap.put(nums[j],freqMap.get(nums[j])+1);
            }
        }
        return res;
    }
}
