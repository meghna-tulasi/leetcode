class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        Arrays.sort(nums);
        
        if(k == 0) {
            return nums[nums.length-1];
        }
        return nums[nums.length-k];
    }
}

//wiggle sort O(n) - time, O(1) - space
/*
class Solution {
    public void wiggleSort(int[] nums) {
        
       for (int i = 0; i < nums.length - 1; i+=2) {
           if (i>0 && nums[i-1] > nums[i] ) 
                swap(nums, i-1, i); 
  
            
            if (i<nums.length-1 && nums[i] < nums[i+1] ) 
                swap(nums, i, i + 1); 
        } 
    } 
     
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
*/