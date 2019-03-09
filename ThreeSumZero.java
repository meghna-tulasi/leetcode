class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       
        Arrays.sort(nums);

        List<Integer> zeroList = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        TreeSet<String> set = new TreeSet<String>();

        for(int i = 0; i< nums.length - 2; i++) {
            int j = i+1;
            int k = nums.length - 1;

            while(j < k) {
                if(nums[i] + nums[j] + nums[k] == 0) {
                    String s = nums[i] + "," + nums[j] + "," + nums[k];

                    if(!set.contains(s)) {
                        zeroList.add(nums[i]);
                        zeroList.add(nums[j]);
                        zeroList.add(nums[k]);
                        result.add(zeroList);
                        zeroList = new ArrayList<>();
                        set.add(s);
                    }

                    j++; k--;
                }
                else if(nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                }
                else
                    k--;
            }
        }
    return result;
    }
}
//O(n2) - time
//O(n) - space
// replace zero by target value for target sum problem