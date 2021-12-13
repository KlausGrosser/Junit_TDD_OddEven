import main.java.OddEvenChecker;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OddEvenCheckerTest {

    private OddEvenChecker oddEvenChecker = new OddEvenChecker();


    @ParameterizedTest(name = "test odd number with: {arguments} ")
    @ValueSource(//TODO)
            public void testOddNumber(int number) {
        //TODO
    }


    @ParameterizedTest(name = "test even number with: {arguments} ")
    @ValueSource(//TODO)
            public void testEvenNumber(int number) {
        //TODO
    }
}