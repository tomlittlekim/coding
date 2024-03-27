import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class MainTest {

    Main main = new Main();

    @ParameterizedTest
    @CsvSource({"98,2,1", "34,3,0"})
    void exam_5(int num, int n, int expected) {
        Assertions.assertEquals(expected, main.exam_5(num, n));
    }

    @Test
    void exam_1() {
        Assertions.assertEquals("abc", main.exam_1(new String[]{"a","b","c"}));
    }

    @ParameterizedTest
    @CsvSource({
        "string, 3, stringstringstring"
        , "love, 10, lovelovelovelovelovelovelovelovelovelove"
    })
    void exam_2(String str, int n, String answer) {
        Assertions.assertEquals(answer, main.exam_2(str, n));
    }

    @ParameterizedTest
    @CsvSource({"991,9,91", "898,89,8"})
    void exam_3(int expected, int a, int b) {
        Assertions.assertEquals(expected, main.exam_3(a, b));
    }

    @ParameterizedTest
    @CsvSource({"364,2,91", "912,91,2"})
    void exam_4(int expected, int a, int b) {
        Assertions.assertEquals(expected, main.exam_4(a, b));
    }

}
