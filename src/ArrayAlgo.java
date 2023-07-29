public class ArrayAlgo {

    // for sorted arrays
    public int[] twoSumSorted(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;

        while(l < r){
            int sum = nums[l] + nums[r];
            if (sum == target){
                return new int[]{l,r};
            } else if (sum < target){
                l++;
            } else { // sum larger than target
                r--;
            }
        }

        return null;
    }

    // for unsorted arrays

}
