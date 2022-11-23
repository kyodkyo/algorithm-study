package november;

import java.util.ArrayList;

public class Sol_1123 {
    public static void main(String[] args) {
        int[][] ranges = {{0, 0}, {0, -1}, {2, -3}, {3, -3}};
        double[] answer = Solution(5, ranges);
        for (double i : answer) {
            System.out.println("i = " + i);
        }
    }

    public static double[] Solution(int k, int[][] ranges) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(k);

        while (k != 1) {
            k = k%2 == 0? k/2 : k*3+1;
            nums.add(k);
        }

        double[] answer = new double[ranges.length];
        for (int i = 0; i < ranges.length; i++) {
            int start = ranges[i][0];
            int end = nums.size() - 1 + ranges[i][1];

            if (start == end) {
                answer[i] = 0.0;
                continue;
            }
            if (start > end) {
                answer[i] = -1.0;
                continue;
            }

            float sum = nums.get(start) + nums.get(end);
            start++;
            while (start < end) {
                sum += (nums.get(start) * 2);
                start += 1;
            }
            answer[i] = sum / 2;
        }

        return answer;
    }
}
