class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){return false;}
        Map<Character, Integer> letters = new HashMap<>();
        for(char c : s.toCharArray()){
            if(letters.containsKey(c)){
                letters.put(c,letters.get(c)+1);
            }else{
                letters.put(c,1);
            }
        }
        for(char c : t.toCharArray()){
            if(!letters.containsKey(c) || letters.get(c)==0){
                return false;
            }
            letters.put(c,letters.get(c)-1);
        }
        return true;
    }
}
