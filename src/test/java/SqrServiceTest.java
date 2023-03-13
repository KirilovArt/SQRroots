import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.javaqa.squareroots.services.SqrService;

public class SqrServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/counter.csv")
    public void testSqrcounter(int expected, int lowervalue, int uppervalue) {
        SqrService service = new SqrService();

        int actual = service.calcSqr(lowervalue, uppervalue);
        Assertions.assertEquals(expected, actual);
    }

}
