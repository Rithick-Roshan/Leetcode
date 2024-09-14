import java.util.*;
public class Hashmap {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
    
            Map<Integer,Integer> m = new HashMap<>();
            int[] a= new int[2];
            for(int i=0;i<nums.length;i++){
                if(m.containsKey(target-nums[i])){
                    a[1]=i;
                    a[0]=m.get(target-nums[i]);
                    return a;
                }
                m.put(nums[i],i);
            }
            return a;
        }
    }
}
