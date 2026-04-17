class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counter= new HashMap<>();
        for(int num: nums){
            if(counter.containsKey(num)){
                counter.put(num, counter.get(num)+1);
            }else{
                counter.put(num,1);
            }
        }
        List<Integer>[] bucket = new List[nums.length+1];
        for(int num: counter.keySet()){
            int freq = counter.get(num);
            if(bucket[freq]==null) bucket[freq] = new ArrayList<>();
            bucket[freq].add(num);
        }
        int[] result = new int[k];
        int idx=0;
        for(int freq = bucket.length-1;freq>=1 && idx<k; freq--){
            if(bucket[freq]!=null){
                for(int num: bucket[freq]){
                    result[idx++]=num;
                    if(idx == k){  
                        break;
                    }
                }
            }
        }
        return result;
    }
}
