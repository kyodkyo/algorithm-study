package november;

public class Sol_1106 {
    public static void main(String[] args) {
        int answer = solution(4, 2, 20);
        System.out.println("answer = " + answer);
    }

    public static int solution(int a, int b, int n) {
        int myB, tranB, answer = 0;

        while(n>=a){
            myB = n%a;
            tranB = (n/a)*b;

            answer += tranB;
            n = myB + tranB;
        }

        return answer;
    }
}
