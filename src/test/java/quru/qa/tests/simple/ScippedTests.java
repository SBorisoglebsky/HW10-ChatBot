package quru.qa.tests.simple;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import quru.qa.tests.TestBase;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ScippedTests extends TestBase {

    @Test
    @Disabled
    void test0() {
        assertTrue(true);
    }

    @Test
    @Disabled
    void test1() {
        assertTrue(true);
    }

    @Test
    @Disabled("With some reason")
    void test2() {
        assertTrue(true);
    }
    
}
