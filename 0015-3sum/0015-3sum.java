class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      List<List<Integer>> result = new ArrayList<>();
        
        // Step 1: Sort the array to unlock two-pointers and easy duplicate skipping
        Arrays.sort(nums);
        
        // Step 2: Iterate through the array. 'i' is our anchored number.
        // We only go up to length - 2 because we need at least 3 numbers for a triplet.
        for (int i = 0; i < nums.length - 2; i++) {
            
            // EARLY EXIT: If the smallest number in our remaining window is > 0, 
            // it's impossible for the sum to ever reach 0. We are done!
            if (nums[i] > 0) {
                break;
            }
            
            // Skip duplicate anchors to prevent duplicate triplets in our output
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            // Set up the two pointers
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    // We found a valid triplet!
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Skip duplicates for the left pointer
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    // Skip duplicates for the right pointer
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    
                    // Move both pointers inward to look for the next pair
                    left++;
                    right--;
                } else if (sum < 0) {
                    // Sum is too small, we need a bigger number
                    left++;
                } else {
                    // Sum is too big, we need a smaller number
                    right--;
                }
            }
        }
        
        return result;  
    }
}