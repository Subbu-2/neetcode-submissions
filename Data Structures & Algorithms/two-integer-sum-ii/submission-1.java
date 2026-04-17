class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int position = 1;
        for(int num: numbers){
            int complement = target -num;
            if(numMap.containsKey(complement)){
                return new int[]{numMap.get(complement), position};
            }
            numMap.put(num,position);
            position++;
        }
        return new int[]{};
    }
}
