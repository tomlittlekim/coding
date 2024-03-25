import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void exam_1() {
        Main main = new Main();
        Assertions.assertEquals("abc", main.exam_1(new String[]{"a","b","c"}));
    }

    @Test
    void exam_2() {
        Main main = new Main();
        String my_string_1 = "string";
        String my_string_2 = "love";

        String my_string_1_answer = "stringstringstring";
        String my_string_2_answer = "lovelovelovelovelovelovelovelovelovelove";

        Assertions.assertEquals(my_string_1_answer, main.exam_2(my_string_1, 3));
        Assertions.assertEquals(my_string_2_answer, main.exam_2(my_string_2, 10));
    }

    @Test
    void exam_3() {
        Main main = new Main();

        Assertions.assertEquals(991, main.exam_3(9, 91));
        Assertions.assertEquals(898, main.exam_3(89, 8));
    }

    @Test
    void exam_4() {
        Main main = new Main();

        Assertions.assertEquals(364, main.exam_4(2, 91));
        Assertions.assertEquals(912, main.exam_4(91, 2));
    }

}
