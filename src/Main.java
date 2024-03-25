public class Main {
    public static void main(String[] args) {}

    /*
        문자열 배열이 주어지면 해당 문자열들을 순서대로 합친 문자열 반환
     */
    public String exam_1(String[] arr) {
       return String.join("", arr);
    }

    /*
        문제 설명
        문자열 my_string과 정수 k가 주어질 때, my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.

        제한사항
        1 ≤ my_string의 길이 ≤ 100
        my_string은 영소문자로만 이루어져 있습니다.
        1 ≤ k ≤ 100

        입출력 예
        my_string	k	result
        "string"	3	"stringstringstring"
        "love"	10	"lovelovelovelovelovelovelovelovelovelove"
        입출력 예 설명
        입출력 예 #1
        예제 1번의 my_string은 "string"이고 이를 3번 반복한 문자열은 "stringstringstring"이므로 이를 return 합니다.
        입출력 예 #2
        예제 2번의 my_string은 "love"이고 이를 10번 반복한 문자열은 "lovelovelovelovelovelovelovelovelovelove"이므로 이를 return 합니다.
    */
    public String exam_2(String my_string, int k) {
        return my_string.repeat(k);
    }

    public int exam_3(int a, int b) {
        // 나의 풀이
        /*int a_b = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int b_a = Integer.parseInt(String.valueOf(b) + String.valueOf(a));

        if (b_a > a_b) return b_a;
        return a_b;*/

        // 다른 사람의 풀이
        int a_b = Integer.parseInt("" + a + b);
        int b_a = Integer.parseInt("" + b + a);

        return a_b >= b_a ? a_b : b_a;
    }

    public int exam_4(int a, int b) {
        int a_b = Integer.parseInt("" + a + b);
        int ab2 = 2 * a * b;

        return a_b >= ab2 ? a_b : ab2;
    }

}