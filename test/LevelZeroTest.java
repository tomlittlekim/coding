import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

public class LevelZeroTest {

    private static final Level0 LEVEL_0 = new Level0();

    @ParameterizedTest
    @CsvSource({
            "2,6,1,9"
            ,"5,3,3,473"
            ,"4,4,4,110592"
    })
    void exam_12(int a, int b, int c, int expected) {
        Assertions.assertEquals(expected, LEVEL_0.exam_12(a, b, c));
    }

    @ParameterizedTest
    @MethodSource("exam11Data")
    void exam_11(int a, int d, boolean[] included, int expected) {
        Assertions.assertEquals(expected, LEVEL_0.exam_11(a, d, included));
    }

    static Stream<Arguments> exam11Data() {
        return Stream.of(
                Arguments.of(3, 4, new boolean[]{true, false, false, true, true}, 37)
                , Arguments.of(7, 1, new boolean[]{false, false, false, true, false, false, false}, 10)
        );
    }

    @ParameterizedTest
    @CsvSource({
            "abc1abc1abc,acbac"
    })
    void exam_10(String code, String result) {
        System.out.println(LEVEL_0.exam_10(code));
        Assertions.assertEquals(result, LEVEL_0.exam_10(code));
    }

    @ParameterizedTest
    @CsvSource({
            "-4,7,true,3"
            ,"-4,7,false,-11"
    })
    void exam_9(int a, int b, boolean flag, int expected) {
        Assertions.assertEquals(expected, LEVEL_0.exam_9(a, b, flag));
    }

    @ParameterizedTest
    @CsvSource({
            "<,=,20,50,1"
            , ">,!,41,78,0"
    })
    void exam_8(String ineq, String eq, int n, int m, int expected) {
        Assertions.assertEquals(expected, LEVEL_0.exam_8(ineq, eq, n, m));
    }

    @ParameterizedTest
    @CsvSource({"7,16", "10,220"})
    void exam_7(int n, int expected) {
        Assertions.assertEquals(expected, LEVEL_0.exam_7(n));
    }

    @ParameterizedTest
    @CsvSource({
            "60,2,3,1"
            ,"55,10,5,0"
    })
    void exam_6(int number, int n, int m, int expected) {
        Assertions.assertEquals(expected, LEVEL_0.exam_6(number, n, m));
    }

    @ParameterizedTest
    @CsvSource({"98,2,1", "34,3,0"})
    void exam_5(int num, int n, int expected) {
        Assertions.assertEquals(expected, LEVEL_0.exam_5(num, n));
    }

    @ParameterizedTest
    @CsvSource({"364,2,91", "912,91,2"})
    void exam_4(int expected, int a, int b) {
        Assertions.assertEquals(expected, LEVEL_0.exam_4(a, b));
    }

    @ParameterizedTest
    @CsvSource({"991,9,91", "898,89,8"})
    void exam_3(int expected, int a, int b) {
        Assertions.assertEquals(expected, LEVEL_0.exam_3(a, b));
    }

    @ParameterizedTest
    @CsvSource({
            "string, 3, stringstringstring"
            , "love, 10, lovelovelovelovelovelovelovelovelovelove"
    })
    void exam_2(String str, int n, String answer) {
        Assertions.assertEquals(answer, LEVEL_0.exam_2(str, n));
    }

    @Test
    void exam_1() {
        Assertions.assertEquals("abc", LEVEL_0.exam_1(new String[]{"a","b","c"}));
    }

}
