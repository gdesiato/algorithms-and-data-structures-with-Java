public class On {

    public static void main(String[] args) {

        int[] nums = new int[] {3, 3, 0, 0, 1, 2, 3};
        System.out.println(majorityElement(nums));
    }



        public static int majorityElement(int[] nums){

            int majority = nums[0];
            int votes = 1;

            for (int i = 1; i < nums.length; i++){
                if (votes == 0){
                    votes++;
                    majority = nums[i];
                }
                else if (majority == nums[i]){
                        votes++;
                } else {
                    votes--;
                }
            }
            return majority;
        }

}
