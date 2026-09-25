class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int r = n-1;
        int res = nums[0];

        while(l<=r){
            int m = l + (r-l)/2;
            if(target == nums[m]){
                return m;
            }
            if(nums[l]<=nums[m]){
                if(nums[l] < target || nums[m] > target){
                    l = m+1;
                } else r= m-1;
            } else {
                if(nums[r]> target || nums[m] < target){
                    r = m-1;
                } else l = m+1;

            }
        }
        return -1;
    }
}
