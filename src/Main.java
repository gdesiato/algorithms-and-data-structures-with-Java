import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ArrayAlgo arrayAlgo = new ArrayAlgo();

        int[] nums = {1,2,3,4};
        int target = 5;
        int[] result = arrayAlgo.twoSumSorted(nums, target);

        System.out.println(Arrays.toString(result));


        // Sell and Buy Stocks
        int[] stocks = {7,1,5,3,6,4};
        int result2 = arrayAlgo.maxProfit(stocks);

        System.out.println(result2);

    }
}
