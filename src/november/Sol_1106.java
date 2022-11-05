package november;

public class Sol_1106 {
    public static void main(String[] args) {
        int answer = solution(new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"});
        System.out.println("answer = " + answer);
    }

    public static int solution(String[] babbling) {
        int answer = 0;

        for(int i=0; i<babbling.length; i++){

            if(babbling[i].contains("ayaaya") || babbling[i].contains("yeye") ||
                    babbling[i].contains("mama") || babbling[i].contains("woowoo"))
                continue;

            babbling[i] = babbling[i].replace("aya", " ");
            babbling[i] = babbling[i].replace("ye", " ");
            babbling[i] = babbling[i].replace("ma", " ");
            babbling[i] = babbling[i].replace("woo", " ");
            babbling[i] = babbling[i].replace(" ", "");

            if(babbling[i].length()==0){
                answer++;
            }
        }

        return answer;
    }
}
