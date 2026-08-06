class Solution {
    public int longestConsecutive(int[] nums) {
        
        nums.sort((a,b)->a[0] -b[0]);
        int count = 0
        for(int i=-;i<nums.length();i++){

            for(int j=i+1;j<nums.length();j++){

                if(nums[i+1] == nums[j]){
                    count++;
                }
    
            }
            return count;
        }
    }
}
