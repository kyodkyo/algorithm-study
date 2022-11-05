package november;

public class Sol_1105 {
    public static void main(String[] args) {
        String answer = solution(new int[]{1, 3, 4, 6});
        System.out.println("answer = " + answer);
    }

    public static String solution(int[] food) {
        String answer = "";

        for(int i=1; i<food.length; i++){
            int count = food[i] / 2;
            for(int j=1; j<=count; j++){
                answer += String.valueOf(i);
            }
        }
        answer += "0";

        for(int i=answer.length()-2; i>=0; i--){
            answer += answer.charAt(i);
        }

        return answer;
    }

    public static String solution2(int[] food){
        StringBuilder sb = new StringBuilder();

        for(int i=1; i<food.length; i++){
            int count = food[i]/2;
            sb.append(String.valueOf(i).repeat(count));
        }

        String answer = sb + "0";
        return answer + sb.reverse();
    }

}
