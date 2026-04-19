class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>(); 
        int l=0;
        // int r=1;
        // int lengt=0;
        int res=0;
        if(s.length()==0) return 0;
        // while(l<r && r<s.length()-1){
        //     if(s.charAt(l) != s.charAt(r)){
        //         r++;
        //     }else{
        //         l++;
        //     }
        //     maxLength=Math.max(maxLength,r-l+1);
            
        // }
        for(int r=0; r<s.length();r++){
            while(charSet.contains(s.charAt(r))){
                charSet.remove(s.charAt(l));
                l++;
            }
            charSet.add(s.charAt(r));
            res = Math.max(res,r-l+1);
        }

        return res;
    }
}
