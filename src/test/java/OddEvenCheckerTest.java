import main.java.OddEvenChecker;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OddEvenCheckerTest {

    private OddEvenChecker oddEvenChecker = new OddEvenChecker();


    @ParameterizedTest(name = "test odd number with: {arguments} ")
    @ValueSource(ints = {1, 3, 5, -3, 15, Integer.MAX_VALUE})
            public void testOddNumber(int number) {
                assertTrue(oddEvenChecker.isOddNumber(number));
    }


    @ParameterizedTest(name = "test even number with: {arguments} ")
    @ValueSource(ints = {2, 4, 8, -16, 30, 80})
            public void testEvenNumber(int number) {
                assertFalse(oddEvenChecker.isOddNumber(number));

    }
}