class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> uSet = new HashSet<>();
        for(int num: nums){
            uSet.add(num);
        }
        int longest =0 ;
        for(int num: uSet){
            if(!uSet.contains(num-1)){
                int length = 1;
                while(uSet.contains(num + length)) {length++;}
                longest = Math.max(longest,length);
                
            }
        }
        System.out.println(uSet);
        return longest;
    }
}
