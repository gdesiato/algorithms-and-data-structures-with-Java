import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {

        int[] ints = {1, 2, 4, 5, 7, 9, 11};

        System.out.println(ints.length);
        System.out.println(binarySearch(ints, 2));


        boolean[] arr = {false, false, true, true, true};
        System.out.println("first true value at index: " + findBoundary(arr));


        List<Integer> arrList = new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19));
        int target = 6;
        System.out.println(firstNotSmaller(arrList, target));


        List<Integer> arrList1 = new ArrayList<>(Arrays.asList(1, 3, 3, 3, 3, 6, 10, 10, 10, 100));
        int target1 = 10;
        System.out.println(findFirstOccurrence(arrList1, target1));


        int num = 7;
        System.out.println( "The square root, or approx square root, of " + num + " is: " + squareRoot(num));


        List<Integer> arrList2 = new ArrayList<>(Arrays.asList(30, 40, 50, 10, 20));
        System.out.println(findMinRotated(arrList2));

        // mountain array
        List<Integer> arrList3 = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 2, 1, 0));
        System.out.println(peakOfMountainArray(arrList3));




    }


    private static int binarySearch(int[] numbers, int numberToFind){

        int lowPointer = 0;
        int highPointer = numbers.length - 1;

        while (lowPointer <= highPointer){

            // average of the low and high indexes
            int middlePosition = (lowPointer + highPointer) /2;
            int middleNumber = numbers[middlePosition];

            if (numberToFind == middleNumber){
                return middlePosition;
            }

            if (numberToFind < middleNumber){
                highPointer = middlePosition - 1;
            } else {
                lowPointer = middlePosition + 1;
            }
        }

        // number not found
        return -1;
    }


    // Find the First True in a Sorted Boolean Array
    public static int findBoundary(boolean[] arr){
        int left = 0;
        int right = arr.length -1;
        // initialize the variable that will store the result (first true value)
        int boundaryIndex = -1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            // if true
            if (arr[mid]){
                boundaryIndex = mid;
                right = mid -1; // to check if there is another true value before the one found
            // if false
            } else {
                left = mid + 1; // the first true value must be at a later index
            }
        }
        return  boundaryIndex;
    }

    // First Element not Smaller than Target
    public static int firstNotSmaller(List<Integer> arrlist, int target){
        int left = 0;
        int right = arrlist.size() -1;
        int boundaryIndex = -1;

        while (left <= right){
            int mid = left + (right -left) /2;
            if(arrlist.get(mid) >= target){
                boundaryIndex = mid;
                right = mid -1;
            } else {
                left = mid + 1;
            }
        }
        return boundaryIndex;
    }


    // First Occurrence
    public static int findFirstOccurrence(List<Integer> arr, int target) {
        int left = 0;
        int right = arr.size() -1;
        int targetIndex = -1;

        while (left <= right){
            int mid = left + (right - left) / 2;
            if(arr.get(mid) == target){
                targetIndex = mid;
                right = mid - 1;
            } else if (arr.get(mid) < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return targetIndex;

    }


    // Square Root Estimation
    // Given an integer, find its square root without using the built-in square root function.
    // Only return the integer part (truncate the decimals).

    // applying the binary search technique over a range of numbers, not a given array
    public static int squareRoot(int n) {
        if(n == 0){
            return 0;
        }

        int left = 1;
        int right = n;

        while (left <= right){
            int mid = left + (right - left) / 2;

            if( mid == n / mid){
                return mid;
            } else if (mid > n /mid){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }


    // find the index of the minimum element in the array
    public static int findMinRotated(List<Integer> arr) {
        int left = 0;
        int right = arr.size() - 1;
        int boundaryIndex = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // if <= last element, then belongs to lower half
            if (arr.get(mid) <= arr.get(arr.size() - 1)) {
                boundaryIndex = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return boundaryIndex;
    }


    // find the index of the peak element in a mountain array
    public static int peakOfMountainArray(List<Integer> arr) {
        int left = 0;
        int right = arr.size() - 1;
        int boundaryIndex = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid == arr.size()-1 || arr.get(mid) > arr.get(mid + 1)) {
                boundaryIndex = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return boundaryIndex;
    }
}
