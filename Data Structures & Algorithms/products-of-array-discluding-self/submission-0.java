class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prodOfAll = 1; int prodOfNonZeros = 1;
        int countOfZeros = 0; int indexOfFirstZero = -1;
        for(int i=0;i<nums.length;i++){
            if(countOfZeros > 1) {
                break;
            }
            if(nums[i]==0){
                countOfZeros++;
                if(countOfZeros==1){
                    indexOfFirstZero=i;
                }
            }
            else {
                prodOfNonZeros *= nums[i];
            }
            prodOfAll *= nums[i];
        }
        int[] ans = new int[nums.length];
        if(countOfZeros>1){
            return ans;
        }
        if(countOfZeros==1){
            ans[indexOfFirstZero] = prodOfNonZeros;
            return ans;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                ans[i] = prodOfAll;
            } else{
                ans[i] = prodOfAll / nums[i];
            }
        }
        return ans;
    }
}  
