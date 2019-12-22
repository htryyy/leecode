/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int nums_size = nums.length;
        for(int i=0; i < nums_size; i++){
            int tmp = nums_size - 1;
            int x = nums[i];
            while(tmp != i){
                int y = nums[tmp];
                if (target == x + y){
                    result[0] = i;
                    result[1] = tmp;
                    return result;
                }
                tmp--;
            }
        } 
        return result;
    }
}
// @lc code=end

