//package APITest;
//
//import com.intuit.karate.Results;
//import com.intuit.karate.Runner;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//public class RunAllTest {
//    @Test
//    void testParallel() {
//        Results results = Runner.path("classpath:APITest")
//                .parallel(1);
//        assertTrue(results.getFailCount() == 0, results.getErrorMessages());
//    }
//}
