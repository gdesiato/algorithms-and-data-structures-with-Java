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


    public int maxProfit(int[] prices) {

        int profit = 0;
        int buy = prices[0];
        
        for (int sell : prices){
            if (sell > buy){
                profit = Math.max(profit, sell - buy);
            } else {
                buy = sell;
            }
        }
        return profit;
    }

}
