class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> isUnique = new HashSet<>();
        boolean duplicate=false;
        for(int num : nums){
            if(!isUnique.add(num)){
                return true;
            }
        }
        return false;
    }
}