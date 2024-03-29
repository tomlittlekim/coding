import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class LevelZeroTest {

    private static final Level0 LEVEL_0 = new Level0();

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
