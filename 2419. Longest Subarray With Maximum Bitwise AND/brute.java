class Solution {
    public int longestSubarray(int[] nums) {
        // Map<Integer,Integer> m= new Hashmap<>();
        int max=nums[0];
        int count=1;
        int maxval=1;
        for(int i=1;i<nums.length;i++){
            if(max<nums[i] ){
                max=nums[i];
                count=1;
                maxval=1;
            }
            else if(nums[i]==max){
                count++;
                maxval=Math.max(count,maxval);
            }
            else{
                count=0;
            }
        }
        return maxval;
    }
}