class Solution {
    public int validCandidate(int[] nums){
        int val=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(val==nums[i]){
                count++;
            }else{
                count--;
            }
            if(count==0){
                val=nums[i];
                count=1;
            }
        }
        return val;
    }
    public int majorityElement(int[] nums) {
        int value=validCandidate(nums);
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==value){
                count++;
            }
        }
        if(count>nums.length/2){
           return value;
        }
        return value;
    }
}