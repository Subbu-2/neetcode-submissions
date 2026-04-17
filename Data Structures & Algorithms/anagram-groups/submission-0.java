class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> grouped= new HashMap<>();
        for(String str: strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if(!grouped.containsKey(sorted)) grouped.put(sorted, new ArrayList<>());
            grouped.get(sorted).add(str.toString());
        }
        List<List<String>> result = new ArrayList<>();
        for (List<String> group: grouped.values()){
            result.add(group);
        }
        return result;
    }
}
