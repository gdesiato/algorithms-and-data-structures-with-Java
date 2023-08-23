import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {

        int[] ints = {1, 2, 4, 5, 7, 9, 11};

        System.out.println(ints.length);
        System.out.println(binarySearch(ints, 2));


        boolean[] arr = {false, false, true, true, true};
        System.out.println("first true value at index: " + findBoundary(arr));
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
}
