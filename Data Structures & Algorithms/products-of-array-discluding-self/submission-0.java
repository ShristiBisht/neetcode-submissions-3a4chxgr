class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] preProd = new int[len];
        int[] postProd = new int[len];
        int[] res = new int[len];

        for(int i=0; i < len; i++){
            if(i==0) preProd[i] = nums[i];
            else preProd[i] = preProd[i-1]*nums[i];
        }
        for(int j=len-1; j >= 0; j--){
            if(j==len-1) postProd[j] = nums[j];
            else postProd[j] = postProd[j+1]*nums[j];
        }

        for(int i=0; i < len; i++) {
            int left = (i == 0) ? 1 : preProd[i-1];
            int right = (i == len - 1) ? 1 : postProd[i+1];
            res[i] = left * right;
        }

        return res;
    }
}