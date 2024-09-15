class Solution {
    public int findTheLongestSubstring(String s) {
        Map <Integer,Integer> m =new HashMap<>();
        m.put(0,-1);
        int ans=0,ck=0;
        int i=0;
        for(char c: s.toCharArray()){
            if(c=='a' || c== 'e' || c=='i' || c=='o' || c=='u'){
                ck^=(1<<(int) (c-'a'));
            }
            if(m.containsKey(ck)){
                ans=Math.max(ans,i-m.get(ck));
            }
            else{
                m.put(ck,i);
            }
            i++;
        }
        return ans;
    }
}