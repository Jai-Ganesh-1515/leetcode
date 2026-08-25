class Solution {
    public int missingMultiple(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int t=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=t;
                }
            }
        }
        int m=k;
        while(true){
            boolean f=false;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==m){
                    f=true;
                    break;
                }
            }
            if(!f){
                return m;
            }
            m+=k;
        }
    }
}