class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int i = 0, arrLength = nums.length;
        int result[] = new int[2];
        
        while (i != arrLength-1) {
            int j = i+1;
            while (j != arrLength) {
                if(nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                } 
                j++;                    
            }
            i++;
        }
        return result;
        
    }
}