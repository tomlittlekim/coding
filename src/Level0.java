public class Level0 {

    /*
        문제 설명
        양의 정수 n이 매개변수로 주어질 때, n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고 n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.

        제한사항
        1 ≤ n ≤ 100
        입출력 예
        n	result
        7	16
        10	220
        입출력 예 설명
        입출력 예 #1

        예제 1번의 n은 7로 홀수입니다. 7 이하의 모든 양의 홀수는 1, 3, 5, 7이고 이들의 합인 1 + 3 + 5 + 7 = 16을 return 합니다.
        입출력 예 #2

        예제 2번의 n은 10으로 짝수입니다. 10 이하의 모든 양의 짝수는 2, 4, 6, 8, 10이고 이들의 제곱의 합인 4 + 16 + 36 + 64 + 100 = 220을 return 합니다.
    */
    public int exam_7(int n) {
        int answer = 0;
        if (n % 2 != 0) {
            for (; n > 0; n -= 2) answer += n;
        } else {
            for (; n > 0; n -= 2) answer += n * n;
        }
        return answer;
    }

    /*
        문제 설명
        정수 number와 n, m이 주어집니다. number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.

        제한사항
        10 ≤ number ≤ 100
        2 ≤ n, m < 10
        입출력 예
        number	n	m	result
        60	2	3	1
        55	10	5	0
        입출력 예 설명
        입출력 예 #1

        60은 2의 배수이면서 3의 배수이기 때문에 1을 return합니다.
        입출력 예 #2

        55는 5의 배수이지만 10의 배수가 아니기 때문에 0을 return합니다.
     */
    public int exam_6(int number, int n, int m) {
        return (number % n == 0 && number % m == 0) ? 1 : 0;
    }

    /*
        문제 설명
        정수 num과 n이 매개 변수로 주어질 때, num이 n의 배수이면 1을 return n의 배수가 아니라면 0을 return하도록 solution 함수를 완성해주세요.

        제한사항
        2 ≤ num ≤ 100
        2 ≤ n ≤ 9

        입출력 예
        num	n	result
        98	2	1
        34	3	0

        입출력 예 설명
        입출력 예 #1
        98은 2의 배수이므로 1을 return합니다.
        입출력 예 #2
        32는 3의 배수가 아니므로 0을 return합니다.
    */
    public int exam_5(int num, int n) {
        return num % n == 0 ? 1 : 0;
    }

    public int exam_4(int a, int b) {
        int a_b = Integer.parseInt("" + a + b);
        int ab2 = 2 * a * b;

        return a_b >= ab2 ? a_b : ab2;
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

    /*
        문자열 배열이 주어지면 해당 문자열들을 순서대로 합친 문자열 반환
     */
    public String exam_1(String[] arr) {
       return String.join("", arr);
    }

}