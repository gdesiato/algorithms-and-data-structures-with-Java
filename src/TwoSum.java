import java.util.List;

public class TwoSum {

    public static List<Integer> twoSumSorted(List<Integer> arr, int target) {
        int l = 0;
        int r = arr.size() - 1;
        while (l < r) {
            int twoSum = arr.get(l) + arr.get(r);
            if (twoSum == target) {
                return List.of(l, r);
            } else if (twoSum < target) {
                l++;
            } else {
                r--;
            }
        }
        return null; // if no pair adds up to the target
    }

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 4, 5, 6, 8);
        int target = 10;
        List<Integer> result = twoSumSorted(numbers, target);

        if (result != null) {
            System.out.println("Indices of numbers that add up to " + target + ": " + result);
        } else {
            System.out.println("No two numbers add up to " + target);
        }
    }
}
