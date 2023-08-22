public class BinarySearch {

    public static void main(String[] args) {

        int[] ints = {1, 2, 4, 5, 7, 9, 11};

        System.out.println(binarySearch(ints, 2));
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
}
