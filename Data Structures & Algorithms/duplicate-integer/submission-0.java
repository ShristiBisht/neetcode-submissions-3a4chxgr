class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> uniqueNumbers= new HashSet<>();
        boolean duplicate = false;
        for(int num : nums){
            if(!uniqueNumbers.add(num)){
                return true;
            }
        }
        return false;
    }
}
