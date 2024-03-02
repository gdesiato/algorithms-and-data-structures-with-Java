public class LongestDistance {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] x = {4,1,2,3,1};
        int sol = solution.solution(x);
        System.out.println(sol);
    }
}


class Solution {
    public int solution(int[] blocks) {
        int longestDistance = 0;

        for (int i = 0; i < blocks.length; i++) {
            int leftDistance = 0;
            int rightDistance = 0;

                for (int j = i; j > 0; j--) {
                    if (blocks[j - 1] >= blocks[j]) {
                        leftDistance++;
                    } else {
                        break;
                    }
                }

                for (int j = i; j < blocks.length - 1; j++) {
                    if (blocks[j + 1] >= blocks[j]) {
                        rightDistance++;
                    } else {
                        break;
                    }
                }

                longestDistance = Math.max(longestDistance, leftDistance + rightDistance + 1);
        }

        return longestDistance;
    }
}