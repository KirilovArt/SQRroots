import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.javaqa.squareroots.services.SqrService;

public class SqrServiceTest {

    @ParameterizedTest
//    @CsvSource({
//            "0,10,99",
//            "22,10,999",
//            "1,1,100",
//            "0,-100,-10",
//            "1,-100,100"
//    })
    @CsvFileSource(files = "src/test/resources/counter.csv")
    public void testSqrcounter( int expected, int x, int y){
        SqrService service = new SqrService();

        int actual = service.calcSqr(x, y);
        Assertions.assertEquals(expected,actual);
    }

}
