package november;

import java.util.Arrays;

public class Sol_1123_2 {
    public static void main(String[] args) {
        int answer = Solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2});
        System.out.println("answer = " + answer);
    }

    public static int Solution(int k, int m, int[] score) {
        Arrays.sort(score);

        int[] reScore = new int[score.length];
        for(int i=reScore.length-1; i>=0; i--){
            reScore[i] = score[reScore.length-1-i];
        }

        int answer = 0;
        for(int i=0; i<reScore.length; i++){
            if(i%m + 1==m){
                answer += (reScore[i]*m);
            }
        }

        return answer;
    }
//    Arrays.sort(score);
//
//    int answer = 0;
//        for(int i=score.length-1; i>=0; i--){
//        if(i%m==0) answer += (score[i]*m);
//    }
//
//        return answer;
}
