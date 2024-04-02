public class Level0 {

    /*
        문제 설명
        두 정수 a, d와 길이가 n인 boolean 배열 included가 주어집니다. 첫째항이 a, 공차가 d인 등차수열에서 included[i]가 i + 1항을 의미할 때, 이 등차수열의 1항부터 n항까지 included가 true인 항들만 더한 값을 return 하는 solution 함수를 작성해 주세요.

        제한사항
        1 ≤ a ≤ 100
        1 ≤ d ≤ 100
        1 ≤ included의 길이 ≤ 100
        included에는 true가 적어도 하나 존재합니다.
        입출력 예
        a	d	included	result
        3	4	[true, false, false, true, true]	37
        7	1	[false, false, false, true, false, false, false]	10
        입출력 예 설명
        입출력 예 #1

        예제 1번은 a와 d가 각각 3, 4이고 included의 길이가 5입니다. 이를 표로 나타내면 다음과 같습니다.

        1항	2항	3항	4항	5항
        등차수열	3	7	11	15	19
        included	true	false	false	true	true
        따라서 true에 해당하는 1항, 4항, 5항을 더한 3 + 15 + 19 = 37을 return 합니다.

        입출력 예 #2

        예제 2번은 a와 d가 각각 7, 1이고 included의 길이가 7입니다. 이를 표로 나타내면 다음과 같습니다.

        1항	2항	3항	4항	5항	6항	7항
        등차수열	7	8	9	10	11	12	13
        included	false	false	false	true	false	false	false
        따라서 4항만 true이므로 10을 return 합니다.
     */
    public int exam_11(int a, int d, boolean[] included) {
        int answer = 0;

        for (int i = 0; i < included.length; i++) {
            if (included[i]) answer += a;
            a += d;
        }

        return answer;

        // 다른 사람의 풀이 (Stream 이용)
//        return IntStream.range(0, included.length).map(idx -> included[idx]?a+(idx*d):0).sum();

        // 다른 사람의 풀이
//        int answer = 0;
//
//        for(int i = 0; i < included.length; i++){
//            if(included[i]){
//                answer +=  a + (d*i);
//            }
//        }
//
//        return answer;
    }

    /*
        문제 설명
        문자열 code가 주어집니다.
        code를 앞에서부터 읽으면서 만약 문자가 "1"이면 mode를 바꿉니다. mode에 따라 code를 읽어가면서 문자열 ret을 만들어냅니다.

        mode는 0과 1이 있으며, idx를 0 부터 code의 길이 - 1 까지 1씩 키워나가면서 code[idx]의 값에 따라 다음과 같이 행동합니다.

        mode가 0일 때
        code[idx]가 "1"이 아니면 idx가 짝수일 때만 ret의 맨 뒤에 code[idx]를 추가합니다.
        code[idx]가 "1"이면 mode를 0에서 1로 바꿉니다.
        mode가 1일 때
        code[idx]가 "1"이 아니면 idx가 홀수일 때만 ret의 맨 뒤에 code[idx]를 추가합니다.
        code[idx]가 "1"이면 mode를 1에서 0으로 바꿉니다.
        문자열 code를 통해 만들어진 문자열 ret를 return 하는 solution 함수를 완성해 주세요.

        단, 시작할 때 mode는 0이며, return 하려는 ret가 만약 빈 문자열이라면 대신 "EMPTY"를 return 합니다.

        제한사항
        1 ≤ code의 길이 ≤ 100,000
        code는 알파벳 소문자 또는 "1"로 이루어진 문자열입니다.
        입출력 예
        code	result
        "abc1abc1abc"	"acbac"
        입출력 예 설명
        입출력 예 #1

        code의 각 인덱스 i에 따라 다음과 같이 mode와 ret가 변합니다.
        i	code[i]	mode	ret
        0	"a"	0	"a"
        1	"b"	0	"a"
        2	"c"	0	"ac"
        3	"1"	1	"ac"
        4	"a"	1	"ac"
        5	"b"	1	"acb"
        6	"c"	1	"acb"
        7	"1"	0	"acb"
        8	"a"	0	"acba"
        9	"b"	0	"acba"
        10	"c"	0	"acbac"
        따라서 "acbac"를 return 합니다.

        ※ 2023년 05월 18일 지문이 수정되었습니다.
     */
    public String exam_10(String code) {
        boolean mode = false;
        char[] charArr = code.toCharArray();
        String ret = "";

        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == '1') {
                mode = !mode;
            } else if (mode && i % 2 > 0) {
                ret += charArr[i];
            } else if (!mode && i % 2 == 0) {
                ret += charArr[i];
            }
        }

        return "".equals(ret) ? "EMPTY" : ret;

        // 다른 사람의 풀이
//        StringBuilder answer = new StringBuilder();
//        int mode = 0;
//        for (int i = 0; i < code.length(); i++) {
//            char current = code.charAt(i);
//            if (current == '1') {
//                mode = mode == 0 ? 1 : 0;
//                continue; // 컨티뉴를 쓰지 않고 아래의 조건문을 ELSE-IF로 추가로 달아줬을 것 같다.
//            }
//
//            if (i % 2 == mode) { // 문제를 보고 핵심을 꿰뚫지 못 했다. mode를 홀수,짝수 구분용도로 사용할 수 있었다. 아쉽다.
//                answer.append(current);
//            }
//        }
//        return answer.length() == 0 ? "EMPTY" : answer.toString();
    }

    /*
        문제 설명
        두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때, flag가 true면 a + b를 false면 a - b를 return 하는 solution 함수를 작성해 주세요.

        제한사항
        -1,000 ≤ a, b ≤ 1,000
        입출력 예
        a	b	flag	result
        -4	7	true	3
        -4	7	false	-11
        입출력 예
        입출력 예 #1

        예제 1번에서 flag가 true이므로 a + b = (-4) + 7 = 3을 return 합니다.
        입출력 예 #2

        예제 2번에서 flag가 false이므로 a - b = (-4) - 7 = -11을 return 합니다.
     */
    public int exam_9(int a, int b, boolean flag) {
        return flag ? a + b : a - b;
    }

    /*
        문제 설명
        문자열에 따라 다음과 같이 두 수의 크기를 비교하려고 합니다.

        두 수가 n과 m이라면
        ">", "=" : n >= m
        "<", "=" : n <= m
        ">", "!" : n > m
        "<", "!" : n < m
        두 문자열 ineq와 eq가 주어집니다. ineq는 "<"와 ">"중 하나고, eq는 "="와 "!"중 하나입니다. 그리고 두 정수 n과 m이 주어질 때, n과 m이 ineq와 eq의 조건에 맞으면 1을 아니면 0을 return하도록 solution 함수를 완성해주세요.

        제한 사항
        1 ≤ n, m ≤ 100

        입출력 예
        ineq	eq	n	m	result
        "<"	"="	20	50	1
        ">"	"!"	41	78	0

        입출력 예 설명
        입출력 예 #1
        20 <= 50은 참이기 때문에 1을 return합니다.
        입출력 예 #2
        41 > 78은 거짓이기 때문에 0을 return합니다.
     */
    public int exam_8(String ineq, String eq, int n, int m) {
        boolean b = false;
        switch (ineq + eq) {
            case ">=":
                b = (n >= m);
                break;
            case "<=":
                b = (n <= m);
                break;
            case ">!":
                b = (n > m);
                break;
            case "<!":
                b = (n < m);
                break;
        }

        return b ? 1 : 0;

        // 다른 사람의 풀이
//        return (">".equals(ineq) ? n > m : n < m) || ("=".equals(eq) ? n == m : false) ? 1 : 0;
    }

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