package november;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Sol_1104 {
    public static void main(String[] args) {
        int answer = solution2(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1});
        System.out.println("answer = " + answer);
    }

    public static int solution(int[] ingredient) {
        int answer = 0;

        int[] burger = new int[]{1, 2, 3, 1};
        ArrayList<Integer> checkList = new ArrayList<>();

        for (int i = 0; i < ingredient.length; i++) {
            checkList.add(ingredient[i]);

            if (checkList.size() >= 4) {
                int[] temp = new int[4];
                temp[0] = checkList.get(checkList.size() - 4);
                temp[1] = checkList.get(checkList.size() - 3);
                temp[2] = checkList.get(checkList.size() - 2);
                temp[3] = checkList.get(checkList.size() - 1);

                if (Arrays.equals(temp, burger)) {
                    answer++;
                    checkList.remove(checkList.size() - 1);
                    checkList.remove(checkList.size() - 1);
                    checkList.remove(checkList.size() - 1);
                    checkList.remove(checkList.size() - 1);
                }
            }
        }

        return answer;
    }

    public static int solution2(int[] ingredient) {
        int answer = 0;

        Stack<Integer> checkList = new Stack<>();
        int[] burger = new int[]{1, 3, 2, 1};

        for (int i = 0; i < ingredient.length; i++) {
            checkList.push(ingredient[i]);

            if (checkList.size() >= 4) {
                ArrayList<Integer> temp = new ArrayList<>();

                for(int p=0; p<4; p++) {
                    if(checkList.peek() != burger[p]){
                        break;
                    }
                    temp.add(checkList.pop());
                }

                if(temp.size()==4){
                    answer++;
                }
                else {
                    for(int j=temp.size()-1; j>=0; j--){
                        checkList.push(temp.get(j));
                    }
                }
            }
        }

        return answer;
    }
}
