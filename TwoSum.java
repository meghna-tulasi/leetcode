class Solution {
    public int[] twoSum(int[] nums, int target) {

        //O(n2) - time
        //O(1) - space
        int[] result = new int[2];
        for(int i = 0; i< nums.length; i++) {
            for(int j = i+1; j<nums.length; j++) {
                if(nums[i] + nums [j] == target) {
                    result[0] = i;
                    result[1] = j; // return new int[] {i,j};
                }
            }
        }
        return result;
        
    }
}

//using hash table
//O(n) - time
//O(n) - space
/*public int[] twoSum(int[] nums, int target) {

    Map<Integer, Integer> map = new HashMap<>();

    for(int i = 0; i < nums.length; i++) {
        map.put(nums[i],i);
    }
    for(int i = 0; i < nums.length; i++) {
        int temp = target - nums[i];
        if(map.containsKey(temp) && map.get(temp) != i) {
            return new int[] { i, map.get(temp) };
        }
    }
    throw new IllegalArgumentException("No two sum solution");
}
*/
